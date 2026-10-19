# Assignment 4

## Phase 1: Instrumentation and Trace Collection

### 1.1 Compile the Project

```bash
mvn -f pom-daikon.xml clean test-compile
```

### 1.2 Run Chicory on Your Existing Tests

El proyecto tiene tests de JUnit 5 (`CellTest` y `BoardTest`) y tests de JUnit 4 generados por Randoop/EvoSuite.

El jar 5.9.0 de Daikon requiere Java 11 o mayor, mientras que Chicory necesita el jar `tools.jar` de JDK 8.

Modificar rutas de JDK en el script [8-run-daikon.sh](./8-run-daikon.sh) si fuese necesario.

Finalmente, correr Daikon/Chicory usando el script:

```bash
./8-run-daikon.sh
```


## Phase 2: Invariant Inference

### 2.1 Correr Daikon sobre las trazas
> Nota: el jar de Daikon requiere Java 11+

- Se descargó `daikon.jar`.
- modifiqué la ruta a `/usr/lib/jvm/java-8-openjdk-amd64`. Revisar/ajustar esta ruta (y la de `JDK11`) según el entorno donde se corra.

 ```mvn -f pom-daikon.xml clean test-compile ```

 ```./8-run-daikon.sh```

corre los 417 tests y genera `daikon-traces/JUnitCore.dtrace.gz`.

```bash
java -cp lib/daikon.jar daikon.Daikon daikon-traces/*.dtrace.gz > daikon-output.txt
```

El resultado incluye `Cell:::OBJECT`, `Board:::OBJECT` y los `ENTER`/`EXIT` de todos los métodos públicos de ambas clases (124 program points en total).

### 2.2 Generar el `.inv` binario (opcional)


```bash
java -cp lib/daikon.jar daikon.Daikon -o daikon-traces/tests-only.inv.gz daikon-traces/JUnitCore.dtrace.gz
java -cp lib/daikon.jar daikon.Daikon -o daikon-traces/combined.inv.gz daikon-traces/JUnitCore.dtrace.gz daikon-traces/cli-game-*.dtrace

java -cp lib/daikon.jar daikon.PrintInvariants daikon-traces/combined.inv.gz
```

Se generaron los dos (`tests-only.inv.gz` y `combined.inv.gz`, dentro de `daikon-traces/`) para que correspondan exactamente a `daikon-output-tests-only.txt` y `daikon-output.txt` respectivamente, y así poder reimprimirlos más adelante sin volver a correr la inferencia sobre las trazas.

### Collect Additional Traces via the CLI (Optional)
Usando el script 9 se generaron trazas extras para comparar los invariantes generados anteriormente:

```bash
./9-collect-traces-via-cli.sh
```
El script se configuró para jugar varias partidas con movimientos aleatorios. Para generar los movimientos se agregó ./fuzzer_stdout.py  que importa la clase `RandomFuzzer` e imprime una secuencia fuzzeada a stdout. No era posible usar fuzzer.py.

Resultado: 20 partidas instrumentadas, `daikon-traces/cli-game-1.dtrace` … `cli-game-20.dtrace`, sumadas al `JUnitCore.dtrace.gz` ya existente.

#### Efecto sobre los invariantes inferidos

Se volvió a correr Daikon sobre **todas** las trazas juntas (los 417 tests de Randoop + las 20 partidas de CLI):

```bash
java -cp lib/daikon.jar daikon.Daikon daikon-traces/*.dtrace* > daikon-output.txt
```

Se guardan **ambas versiones por separado** para poder compararlas en el análisis de la Fase 3:

- [daikon-output-tests-only.txt](./daikon-output-tests-only.txt) (1151 líneas) — solo con `JUnitCore.dtrace.gz` (417 tests).
- [daikon-output.txt](./daikon-output.txt) (1589 líneas) — con todas las trazas combinadas (tests + 20 partidas de CLI).
