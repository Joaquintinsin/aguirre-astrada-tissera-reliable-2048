# OASIs sencillo

Prototipo en Python que envía un programa Java y una aserción a OpenRouter y
devuelve feedback para que una persona evalúe si conviene refinarla. El
prototipo no modifica archivos, no compila Java y no ejecuta tests ni mutantes.

## Preparación y ejecución

Desde este directorio:

```bash
python3 -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
```

Si todavía no existe `.env`, crearlo copiando `.env.example`. Completar
`OPENROUTER_API_KEY` con una clave propia. No compartir ni versionar ese
archivo. Por defecto se usa `openrouter/free`, que selecciona un
modelo gratuito disponible. Para fijar un modelo se puede definir
`OPENROUTER_MODEL` en `.env` o pasar `--model`.

```bash
python3 oasis-sencillo.py                 # caso abs
python3 oasis-sencillo.py --input input-max.json
python3 oasis-sencillo.py --input input-max.json --model openrouter/free
```

Cada JSON de entrada contiene las rutas `programa` y `asercion`. Las rutas
relativas se resuelven desde el directorio de ese JSON. El ejemplo usa
`Prueba.java` y `asercion.txt`; el segundo caso usa `Prueba.java` y
`asercion-max.txt`.

## Casos de estudio y evaluación humana

### 1. Aserción demasiado fuerte: `abs`

- Programa: `Prueba.abs(int x)` en `Prueba.java`.
- Aserción: `assert result > 0;` en `asercion.txt`.
- Feedback observado anteriormente y guardado en `response.txt`: el modelo
  señaló `x = 0` (resultado `0`) y `x = Integer.MIN_VALUE` (resultado
  `Integer.MIN_VALUE` por overflow de `int`) como contraejemplos.
- Evaluación humana: ambos contraejemplos son correctos para el código Java
  actual. `result >= 0` cubre `x = 0`, pero todavía falla en
  `Integer.MIN_VALUE`. Para describir literalmente la implementación actual,
  podría usarse `result >= 0 || result == Integer.MIN_VALUE`. Si la intención
  es especificar el valor absoluto matemático, corresponde decidir cómo debe
  tratarse `Integer.MIN_VALUE` y posiblemente corregir el método.

### 2. Aserción demasiado débil: `max`

- Programa: `Prueba.max(int a, int b)` en `Prueba.java`.
- Aserción: `assert result >= a && result >= b;` en `asercion-max.txt`.
- Feedback esperado: un mutante que devuelva `Math.max(a, b) + 1` satisface la
  aserción para entradas normales, pero no implementa el máximo exacto. Por
  ejemplo, para `(a, b) = (2, 5)`, el programa original devuelve `5` y el
  mutante devuelve `6`; ambos resultados son mayores o iguales que los dos
  argumentos. Una aserción más precisa para el contrato de máximo sería
  `result == Math.max(a, b)`.
- Estado de la consulta: no se pudo obtener una respuesta nueva para este caso
  durante la preparación del informe porque la conexión de red a OpenRouter no
  estuvo disponible en el entorno. El ejemplo anterior es el análisis humano
  esperado, no una respuesta atribuida al LLM. Ejecutar el segundo comando de
  arriba y completar esta sección con la respuesta real del modelo antes de
  entregar el informe final.

## Interpretación y límites

El LLM puede equivocarse, omitir casos límite o confundir una especificación
deseada con el comportamiento existente. En particular, el resultado de
`abs(Integer.MIN_VALUE)` depende del overflow definido para `int` en Java. Los
contraejemplos y mutantes propuestos son sugerencias: hay que comprobarlos y
decidir manualmente si la aserción representa el contrato deseado. El modelo
gratuito puede cambiar, tener límites de uso o no estar disponible.
