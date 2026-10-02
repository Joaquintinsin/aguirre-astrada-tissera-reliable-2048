# Assignment 3

## Phase 1: Automated Test Generation with EvoSuite

Se generaron tests con EvoSuite 1.0.6 (`4-generarTestsEvosuite.sh`) para `Cell`, `Board`, `Position`, `DeterministicPlacement` y `NonDeterministicPlacement`. Los tests se encuentran en `src/test/java/EvosuiteTests/`.

### 1.3 Medicion de cobertura

Los tests de EvoSuite usan por defecto @RunWith(EvoRunner.class) con separateClassLoader = true. Con esa opcion el codigo bajo prueba se carga en un classloader propio y JaCoCo no lo ve: el reporte sale en 0 % en todas las clases.
Siguiendo la documentacion de EvoSuite (https://www.evosuite.org/documentation/measuring-code-coverage/) se seteo separateClassLoader = false en los cinco tests \*\_ESTest.java y se corrio para generar el reporte solo con los 95 tests generados con EvoSuite:

```bash
mvn -f pom-evosuite.xml clean test jacoco:report -Dtest='*_ESTest'
```

**Reporte de JaCoCo sobre los tests de EvoSuite**

| Clase                     | Cov. instr. | Cov. ramas |
| :------------------------ | ----------- | ---------- |
| Total                     | 97.8 %      | 89.4 %     |
| Board                     | 97 %        | 87 %       |
| Cell                      | 98 %        | 94 %       |
| Position                  | 100 %       | 100 %      |
| NonDeterministicPlacement | 100 %       | 100 %      |
| DeterministicPlacement    | 100 %       | 100 %      |

### Comparacion con suite manual y con Randoop

Los tres suites se miden con JaCoCo, sin contar MainCLI. Manual y EvoSuite se midieron con el mismo comando y los mismos criterios (`mvn -f pom-evosuite.xml clean test jacoco:report -Dtest=...`, con `-Dtest` eligiendo los tests de cada suite).

| Clase                     | Manual antes de repOK (\*A2) | Manual con repOK (linea / rama) | Randoop, A2 (linea / rama) | EvoSuite (linea / rama) |
| :------------------------ | :--------------------------- | :------------------------------ | :------------------------- | :---------------------- |
| Board                     | 100 %                        | 94 % / 85 %                     | 100 % / 97 %               | 96 % / 87 %             |
| Cell                      | 100 %                        | 79 % / 78 %                     | 100 % / 100 %              | 97 % / 94 %             |
| Position                  | 100 %                        | 100 % / 100 %                   | 100 % / 100 %              | 100 % / 100 %           |
| DeterministicPlacement    | 100 %                        | 100 % / 100 %                   | 100 % / 100 %              | 100 % / 100 %           |
| NonDeterministicPlacement | 100 %                        | 100 % / 100 %                   | 100 % / 100 %              | 100 % / 100 %           |

- _A2: Assignment 2_
- "Manual antes de repOK" es la cobertura reportada en Assignment 2 (Fase 2). "Manual con repOK" es la cobertura actual del suite manual medida con `mvn -f pom-evosuite.xml clean test jacoco:report -Dtest='BoardTest,CellTest,DeterministicBoardTest'`.

**Cantidad de Tests:**

- Suite EvoSuite son 95 tests. (Mas compacto)
- Suite Manual son 102 tests.
- Suite Randoop son 243 tests. (Mas cobertura)

**Comparacion**

- Los tres suites cubren al 100% Position, DeterministicPlacement y NonDeterministicPlacement en sentencias y ramas.
- En Cell, Randoop logra más cobertura (100 % / 100 %). luego EvoSuite (97 % de lineas, 94 % de ramas) y por ultimo la suite manual (79 % / 78 %).
- Igualmente en Board, Randoop es el mas alto (100 % / 97 %), luego EvoSuite (96 % / 87 %) y suite manual (94 % / 85 %).
- La cobertura de la suite manual con `repOK()` disminuye (Cell baja de 100 % a 79 % de lineas, Board a 94 %). Debido a que se agrego `repOK()` y se corrigio el constructor sin ampliar los tests manuales.

## Phase 2: Fuzzing

### Cómo funciona el fuzzer

El fuzzer genera una secuencia aleatoria de teclas (a, s, w, d), una porlínea, y termina con `q`. El largo se elige al azar entre `min_length` y `max_length`, y cada tecla tiene la misma probabilidad.
`CLIRunner` ejecuta el juego por stdin y clasifica el resultado: FAIL si el exit code es distinto de 0 o hay algo en stderr, UNRESOLVED si hay timeout, PASS en otro caso.

### Primeros resultados al ejecutar fuzzer.py

> Summary:
> PASS : 20/20
> FAIL : 0/20
> UNRESOLVED : 0/20

### Ejecución de fuzzer verificando repOK()

Se modificó el `MainCLI` para comprobar el repOK() del board luego de cada movimiento

**Resultado con 20 partidas**

> Summary:
> PASS : 20/20
> FAIL : 0/20
> UNRESOLVED : 0/20

**Resultado con 200 partidas**

> Summary:
> PASS : 200/200
> FAIL : 0/200
> UNRESOLVED : 0/200

**Resultado con 200 partidas, y entradas de entre 300 y 500 caracteres de movimiento**
Simula partidas más largas, que llegan al Game Over

> Summary:
> PASS : 200/200
> FAIL : 0/200
> UNRESOLVED : 0/200

## Reflections

EvoSuite logro una cobertura mayor que los tests manuales y que Randoop, pero no consiguió encontrar fallas porque generalmente se basaba en tests de regresión.

Randoop en cambio sí que consiguió encontrar fallas, por ejemplo de NullPointerException o IllegalArgumentException que fuimos solucionando sin problema. Por más que los tests sean más ilegibles que los que genera EvoSuite por ejemplo, el haber creado los tests por separado no molestaban en el proceso de testing, solo añadían tests adicionales.

Como ninguna de las dos herramientas anteriores podía probar la interfaz del juego, ni pudo jugar, se decidió incorporar la técnica de fuzzing, que concluyó esta parte del trabajo práctico.

La técnica de fuzzing permitió una implementación elegante y simple para testear la interfaz del juego con muchos movimientos de forma rápida. Al agregar la aserción de repOk luego de realizar cualquier movimiento, podíamos detectar ese crasheo si llegaba a ocurrir, sin embargo como la implementación del juego quedó correcta, no se llega a apreciar ningún crasheo (contrastado también con el reporte anteriormente hecho en la etapa de Fuzzing).

Podemos concluír que los tests manuales fueron una tarea tediosa pero necesaria para construír las etapas siguientes, y fueron (y seguirán siendo) los más entendibles y simples, porque fueron generados por humanos para humanos.

El uso de las herramientas facilitó crear más tests sobre el código existente y ayudó a detectar algunos bugs que se solucionaron de forma eficaz, y la combinación entre ellas evidencian una mejoría en el proceso de testing y de creación de software en general.
