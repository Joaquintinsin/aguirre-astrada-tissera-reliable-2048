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

`mvn -f pom-daikon.xml clean test-compile `

`./8-run-daikon.sh`

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

El script se configuró para jugar varias partidas con movimientos aleatorios. Para generar los movimientos se agregó ./fuzzer_stdout.py que importa la clase `RandomFuzzer` e imprime una secuencia fuzzeada a stdout. No era posible usar fuzzer.py.

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
-(return == true) ==> (this.value one of { 2, 4, 8 }): **too strong**. Dos celdas de valor 16 deberian dar true cuando se consulta si se pueden fusionar.

Metodo MergeWith
Precondiciones
-this.value one of { 2, 4 }: **too strong**. Dos celdas de valor 8 se deberian poder fusionar.

Metodo isEmpty
Postcondiciones
-(this.value one of { 2, 4, 8 }) <==> (this.value > ar.edu.unrc.game2048.Cell.EMPTY.value) **too strong**. Si value fuera 32, no vale la biimplicación.

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

## Phase 4: Comparison

### 4.1 Daikon vs. `repOK()`

En la inferencia de Daikon para la clase **Cell**, se obtiene que:

```java
this.value >= 0
this.value >= ar.edu.unrc.game2048.Cell.EMPTY.value
```

Mientras que el repOK de la clase **Cell** dice:

```java
public boolean repOK() {
    if (value < 0) {
        return false;
    }
    if (value == 0) {
        return true;
    }
    return (value & (value - 1)) == 0;
}
```

Se observa que:

- La inferencia de Daikon falla para revisar si un valor de una celda es potencia de 2.
- Se repite que el valor de la celda sea mayor o igual a 0, puesto que `ar.edu.unrc.game2048.Cell.EMPTY.value` es `0`.

---

Por otra parte, la inferencia de Daikon respecto a la clase **Board**, se obtiene:

```java
this.size == size(this.grid[])
this.size >= 1
this.grid != null
this.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class
this.grid[] elements != null
this.score >= 0
this.score % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0
ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1
ar.edu.unrc.game2048.Board.WINNING_VALUE >= this.size
ar.edu.unrc.game2048.Board.WINNING_VALUE > this.score
this.grid.getClass().getName() != this.strategy.getClass().getName()
```

Mientras que el repOK de la clase **Board** dice:

```java
public boolean repOk() {
    if (size <= 0) {
        return false;
    }
    if (grid == null || grid.length != size) {
        return false;
    }
    for (int r = 0; r < size; r++) {
        if (grid[r] == null || grid[r].length != size) {
            return false;
        }
        for (int c = 0; c < size; c++) {
            if (grid[r][c] == null || !grid[r][c].repOK()) {
                return false;
            }
        }
    }
    if(score < 0) {
        return false;
    }
    return true;
}
```

Se observa que:

- Los tres primeros invariantes de Daikon coinciden con las condiciones del repOK
- En esta linea inferida `this.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class` hace un chequeo de igualdad de nombres de clase, por mas que en repOK no se haga explicito.
  > Esto podria traer problemas de invariante para implementaciones correctas y equivalentes.
  > Daikon pide que sea una implementacion estricta con una matriz de Cell, aunque podria hacerse de otra manera y seguir siendo una implementación correcta.
- En esta inferencia `this.score % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0` Daikon encuentra que score es múltiplo de `4` pero no es algo pedido para nuestro juego.
  > Indirectamente encuentra esta condición, pero no es una especificación de nuestro problema. Podríamos cambiar la forma en que sumamos el puntaje para el juego y este invariante quedaría anulado.
- Esta inferencia está mal `ar.edu.unrc.game2048.Board.DEFAULT_SIZE != size(this.grid[])-1` porque no se podría usar un tablero de tamaño `5` por ejemplo.
- Esta otra inferencia también está mal `ar.edu.unrc.game2048.Board.WINNING_VALUE >= this.size` porque se podría crear un tablero de tamaño `> 2048` sin problemas.
- Por como se acotan las trazas y los tests, el score nunca llega a WINNING_VALUE, por lo que `ar.edu.unrc.game2048.Board.WINNING_VALUE > this.score` podría no ser cierto siempre; podría alcanzarse un score de `2048`.
- Esta inferencia `this.grid.getClass().getName() != this.strategy.getClass().getName()` es super trivial, está comparando dos cosas completamente distintas.

#### Conclusión

Para la clase **Cell** se infirió bien una parte y le faltó una parte importante.

Para la clase **Board** todo lo que contemplamos en repOK está inferido en Daikon. Aunque hay cosas que Daikon agrega de más o incorrectas.

### 4.2 Daikon vs. Manual and Automated Test Oracles

Para este programa consideramos que los oráculos más útiles fueron los escritos a mano: las aserciones de los tests manuales y la implementación de repOK()` porque las herramientas automáticas cuando decidían qué estaba bien y qué estaba mal dependían de un oráculo escrito a mano o heredaban los errores de la implementación.

**Aserciones manuales.** Son las únicas que codifican lo que el juego debería hacer y no lo que hace. Por eso fueron las que encontraron los bugs de movimiento en el Assignment 1 (por ejemplo, el recorrido de `moveDown` que no llegaba a la fila 0 por faltar el `<=`). Las herramientas que generan oráculos observando la ejecución lo habrían tomado como el comportamiento esperado. En cuanto a cobertura la suite manual tiene menos por la inclusión del repOk() en el código que tiene ramas que no son alcanzables con boards generados con sus constructores.

**`repOK()`.** Fue el oráculo que más rindió, porque se escribe una sola vez y lo puede reutilizar cualquier generador de entradas:

- Con `@CheckRep`, Randoop lo evaluó después de cada llamada y encontró que `new Cell(100)` producía una celda inválida.
- En el fuzzing del Assignment 3, `MainCLI` lo chequea después de cada movimiento en 200 partidas largas para encontrar estados inválidos.

**Aserciones de regresión de Randoop y EvoSuite.** Registran lo que el código hizo en una corrida, asi que no detectan errores. EvoSuite logró mucha cobertura pero no encontró detecto fallas. Además, son frágiles: tuvimos que regenerar los tests de EvoSuite para que fueran deterministas. 

**Invariantes de Daikon.** Son los oráculos automáticos que generalizan sobre muchas ejecuciones y dependen la calidad de las trazas.

- Con solo los 417 tests, Daikon produjo algunos invariantes demasiado fuertes ( por ejemplo, `score one of {0, 4}` o `WINNING_VALUE >= size`) y no infirió que `value` fuera potencia de 2.
- Al agregar las 20 partidas de CLI los invariantes de debilitaron, pero aún así no se infiere que `value`  debe ser potencia de 2.
- Como vimos en 4.1, todo lo que Daikon infirió correctamente sobre el estado ya estaba en `repOK()`, pero para utilizar estas inferencias se deben validar manualmente. Se reconocen aportes de Daikon en dos sentidos:

- **Relaciones entre el estado antes y después de un método.** a diferencia de `repOK()`, Daikon infiere este tipo de propiedades. Por ejemplo, el puntaje nunca baja en un movimiento o el resultado de `mergeWith` vale el doble. Estas propiedades se pueden agregar como aserciones en los tests manuales.
- **Muestra qué valores no estamos probando.** Cada invariante demasiado fuerte indica casos que ninguna ejecución alcanzó. por ejemplo, `WINNING_VALUE > this.score` muestra que ninguna ejecución llega a ganar. A partir de eso se pueden escribir tests nuevos con esos valores para mejorar la test suite.

**Conclusión:** para *Reliable 2048* el mejor oráculo fue `repOK()` junto con las aserciones manuales, porque son los únicos que expresan la especificación en lugar del comportamiento observado. Rindieron más cuando los combinamos con generación automática de entradas (Randoop con `@CheckRep` y el fuzzer). Daikon queda como herramienta complementaria: sirve para descubrir propiedades candidatas que después validamos a mano, pero no reemplazó al oráculo escrito por el equipo.
