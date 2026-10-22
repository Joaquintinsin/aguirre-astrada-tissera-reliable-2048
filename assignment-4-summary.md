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


## Phase 3: Inspect and Evaluate the Inferred Invariants

### 3.1 Understand the Program Point Structure
 Archivos analizados
- `daikon-output-tests-only.txt` 
- `daikon-output.txt` 

### 3.2 Evaluate the Invariants

Analisis de clase Cell en daikon-output-tets-only

Invariantes
this.value >= 0
- **correct and useful** : un valor negatico sería invalido
this.value >= ar.edu.unrc.game2048.Cell.EMPTY.value
- **correct but trivial**

-No se captura como invariante que value sea 0 ó potencia de 2 

Metodo CanMergeWith
Precondiciones
-ar.edu.unrc.game2048.Cell.EMPTY.value <= other.value: **correct but trivial**
Postcondiciones 
-(return == true)  ==>  (this.value one of { 2, 4, 8 }): **too strong**. Dos celdas de valor 16 deberian dar true cuando se consulta si se pueden fusionar.

Metodo MergeWith
Precondiciones
-this.value one of { 2, 4 }: **too strong**. Dos celdas de valor 8 se deberian poder fusionar.

Metodo isEmpty
Postcondiciones
-(this.value one of { 2, 4, 8 })  <==>  (this.value > ar.edu.unrc.game2048.Cell.EMPTY.value)  **too strong**. Si value fuera 32, no vale la biimplicación.


Observación: en este punto Daikon no infiere que `value` sea 0 o una potencia de 2. Tampoco infiere `2 * this.value == return.value` en `mergeWith`, porque con solo dos valores observados no puede distinguir una relación lineal de una coincidencia.


Analisis de clase Board en daikon-output-test-only

Invariantes
this.size == size(this.grid[])
- **correct and useful**. Relaciona el campo `size` con la grilla real.
this.size >= 1
- **correct and useful**. Un tablero de tamaño 0 o negativo es inválido.
this.grid != null
- **correct and useful**
this.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class
- **correct but trivial**
this.grid[] elements != null
- **correct and useful**
this.score one of { 0, 4 }
- **too strong**. Tras más fusiones el puntaje toma otros valores (8, 12, ...).
ar.edu.unrc.game2048.Board.DEFAULT_SIZE != this.size
- **too strong**. Un `Board(5, strat)` la rompe (`5 - 1 == 4`).
ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= this.score
- **too strong**. El score puede aumentar y superar DEFAULT_SIZE
ar.edu.unrc.game2048.Board.WINNING_VALUE >= this.size
- **too strong**. No hay tableros lo suficientemente grandes.
ar.edu.unrc.game2048.Board.WINNING_VALUE > this.score
- **too strong**. No se probaron partidas que llegaron a ganar y tener un score mayor.



### 3.3 Cambios al ampliar la traza (daikon-output)

Al sumar las 20 partidas de CLI a los 417 tests, la inferencia cambió.

**Los conjuntos de valores se reemplazaron por propiedades más generales.**
En tests-only, Daikon veía pocos valores distintos y reportaba invariantes del tipo
`one of {...}`. Con las partidas esos conjuntos dejaron de cumplirse:

- `Cell`: `this.value one of {2, 4, 8}` y `mergeWith:::ENTER this.value one of {2, 4}`
  pasaron a `this.value >= 2` y `this.value is a power of 2`.
- `Board`: `score one of {0, 4}` desapareció del `OBJECT`, y apareció `score >= 0` y `score % DEFAULT_SIZE == 0`.
  También se amplió `setCell:::ENTER`, de `cell.value == 2` a `cell.value one of {2, 4}`.


**Aparecieron invariantes verdaderas que antes no se distinguían de una coincidencia.**
- `Cell.mergeWith:::EXIT`: `2 * this.value - return.value == 0`. Era la postcondición más importante de `Cell` y los tests solos no la produjeron.
- `Board`: `this.score >= orig(this.score)` ya estaba en `moveLeft` y `moveRight`
  y ahora vale en los cuatro movimientos.

