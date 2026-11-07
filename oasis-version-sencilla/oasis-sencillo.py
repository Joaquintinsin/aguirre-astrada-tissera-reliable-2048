#!/usr/bin/env python3
"""Ask an OpenRouter model for user-reviewed assertion-refinement feedback."""

import argparse
import json
import os
import sys
from datetime import datetime
from pathlib import Path

import requests
from dotenv import load_dotenv

SCRIPT_DIR = Path(__file__).resolve().parent
API_URL = "https://openrouter.ai/api/v1/chat/completions"
SYSTEM_PROMPT = """Sos un asistente para refinar aserciones de programas.
Analizá el código y la aserción, sin asumir que el código es correcto.

Distinguí estos casos:
- Demasiado fuerte: existe una ejecución válida del programa que viola la
  aserción. Proponé entradas concretas y un test Java que muestre el fallo.
- Demasiado débil: la aserción acepta comportamientos incorrectos. Proponé un
  mutante concreto que siga satisfaciendo la aserción y una entrada donde el
  resultado del mutante difiera del esperado.

Respondé en español con estas secciones: clasificación, análisis, ejemplo
concreto y posible refinamiento. Si falta información, decilo. No cambies el
código ni la aserción. La sugerencia es feedback para revisión humana, no una
decisión automática. Tené en cuenta el comportamiento real de Java, incluido
el overflow de int cuando corresponda."""


def parse_args():
    parser = argparse.ArgumentParser(
        description="Genera feedback de un LLM para refinar una aserción Java."
    )
    parser.add_argument(
        "--input",
        type=Path,
        default=SCRIPT_DIR / "input.json",
        help="JSON con las rutas 'programa' y 'asercion' (por defecto: input.json).",
    )
    parser.add_argument(
        "--model",
        default=None,
        help="ID de modelo OpenRouter; también puede configurarse con OPENROUTER_MODEL.",
    )
    parser.add_argument(
        "--timeout",
        type=float,
        default=90,
        help="Tiempo máximo de espera en segundos (por defecto: 90).",
    )
    return parser.parse_args()


def read_input(config_path):
    try:
        config = json.loads(config_path.read_text(encoding="utf-8"))
    except OSError as exc:
        raise ValueError(
            f"No se pudo leer el archivo de entrada '{config_path}': {exc}"
        ) from exc
    except json.JSONDecodeError as exc:
        raise ValueError(
            f"El archivo '{config_path}' no contiene JSON válido: {exc}"
        ) from exc

    if not isinstance(config, dict):
        raise ValueError("La raíz del JSON de entrada debe ser un objeto.")
    for field in ("programa", "asercion"):
        if not isinstance(config.get(field), str) or not config[field].strip():
            raise ValueError(f"El campo '{field}' debe contener la ruta a un archivo.")

    base_dir = config_path.resolve().parent

    def read_source(field):
        path = Path(config[field]).expanduser()
        if not path.is_absolute():
            path = base_dir / path
        try:
            return path.read_text(encoding="utf-8")
        except OSError as exc:
            raise ValueError(f"No se pudo leer '{field}' ('{path}'): {exc}") from exc

    return read_source("programa"), read_source("asercion")


def build_user_prompt(program, assertion):
    return f"""Analizá esta aserción para el programa dado.

<programa_java>
{program}
</programa_java>

<asercion>
{assertion.strip()}
</asercion>

Clasificala como demasiado fuerte, demasiado débil o no hay evidencia suficiente.
Para una aserción demasiado fuerte, mostrá un test con valores de entrada y
resultado esperado/obtenido que la viole. Para una demasiado débil, describí un
mutante concreto, una entrada, y por qué la aserción no lo distingue del
programa original. No inventes la ejecución de herramientas: derivá los
resultados del código y explicitá cualquier supuesto."""


def request_feedback(api_key, model, prompt, timeout):
    payload = {
        "model": model,
        "messages": [
            {"role": "system", "content": SYSTEM_PROMPT},
            {"role": "user", "content": prompt},
        ],
    }
    try:
        response = requests.post(
            API_URL,
            headers={
                "Authorization": f"Bearer {api_key}",
                "Content-Type": "application/json",
                "HTTP-Referer": "https://openrouter.ai/",
                "X-Title": "OASIs sencillo - Seminario",
            },
            json=payload,
            timeout=timeout,
        )
    except requests.Timeout as exc:
        raise RuntimeError(
            f"OpenRouter no respondió dentro de {timeout:g} segundos."
        ) from exc
    except requests.RequestException as exc:
        raise RuntimeError(f"No se pudo conectar con OpenRouter: {exc}") from exc

    if not response.ok:
        try:
            detail = response.json().get("error", {}).get("message", response.text)
        except (ValueError, AttributeError):
            detail = response.text
        raise RuntimeError(f"OpenRouter devolvió HTTP {response.status_code}: {detail}")

    try:
        data = response.json()
        content = data["choices"][0]["message"]["content"]
    except (ValueError, KeyError, IndexError, TypeError) as exc:
        raise RuntimeError(
            "OpenRouter respondió, pero el formato no contiene un mensaje válido."
        ) from exc

    if not isinstance(content, str) or not content.strip():
        raise RuntimeError("OpenRouter devolvió una respuesta vacía.")
    return content.strip()


def save_llm_response(feedback):
    timestamp = datetime.now().astimezone().strftime("%Y%m%d_%H%M%S_%f")
    response_llm_path = SCRIPT_DIR / f"response_llm_{timestamp}.md"
    try:
        response_llm_path.write_text(feedback + "\n", encoding="utf-8")
    except OSError as exc:
        print(
            f"Error: no se pudo guardar el feedback en '{response_llm_path}': {exc}",
            file=sys.stderr,
        )


def main():
    args = parse_args()
    # Load the project's .env regardless of the directory from which the script runs.
    load_dotenv(SCRIPT_DIR / ".env")
    api_key = os.getenv("OPENROUTER_API_KEY")
    if not api_key:
        print(
            "Falta OPENROUTER_API_KEY. Definila en el entorno o en "
            f"'{SCRIPT_DIR / '.env'}'.",
            file=sys.stderr,
        )
        return 2

    model = args.model or os.getenv("OPENROUTER_MODEL", "openrouter/free")
    try:
        program, assertion = read_input(args.input)
        feedback = request_feedback(
            api_key,
            model,
            build_user_prompt(program, assertion),
            args.timeout,
        )
    except (ValueError, RuntimeError) as exc:
        print(f"Error: {exc}", file=sys.stderr)
        return 1

    save_llm_response(feedback)

    print(f"Modelo: {model}")
    print("\n=== Feedback del LLM (revisar antes de modificar la aserción) ===\n")
    print(feedback)
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
