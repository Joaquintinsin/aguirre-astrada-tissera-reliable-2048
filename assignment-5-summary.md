# Assignment 5 — Ejercicio 1.a: Fuzzing con gramáticas

## Cómo correr

```bash
source ./settear-java-21.sh
./11-fuzz-boards.sh 10000 20     # 10.000 tableros, 20 movimientos por tablero
```

## Archivos
- En Board.java se agregó `fromString("[0,2,...]")`, que crea un tablero a partir de un string, y `toArrayString()`, que hace lo inverso. Si el string es inválido, lanza `IllegalArgumentException`. 
- En MainCLI.java se agregó el flag `--board "[...]"` para empezar a jugar desde un tablero dado.
- fuzzing/grammar_fuzzer.py es el fuzzer basado en gramática (Fuzzing Book). Genera tableros válidos al azar de tamaño 1×1 a 8×8, con valores entre 0 y 2³⁰. Escribe un tablero por línea.¿
- FuzzHarness.java es el arnés que lee los tableros, carga cada uno con `fromString`, le aplica movimientos al azar y verifica que todo esté bien. Clasifica cada tablero como PASS, FAIL o CRASH.
- ReferenceModel.java es una implementación mínima e independiente de las reglas del 2048. El arnés compara `Board` contra este modelo después de cada movimiento. |
- 11-fuzz-boards.sh script para correr: compila, genera los tableros y ejecuta el arnés. 
- FuzzingRegressionTest.java: Tests JUnit con los casos de cada bug encontrado.

## Cómo funciona
Para cada tablero, el arnés verifica que:
1. `fromString` lo acepta,
2. `repOk()` es verdadero,
3. `toArrayString()` devuelve el mismo string,
4. después de cada movimiento, `repOk()` sigue siendo verdadero, el score no es negativo y el tablero coincide con el de `ReferenceModel`.

Se usa `DeterministicPlacement` para que la ficha nueva sea predecible y cada fallo se pueda reproducir.

## Errores encontrados

Resultado sobre 10.000 tableros: **PASS 9926, FAIL 3, CRASH 71**.

### Bug 1: overflow al fusionar dos fichas de 2³⁰ (71 CRASH)

`Cell.mergeWith` calcula `value * 2`. Para 2³⁰ el resultado es 2³¹, que no entra en un `int` y queda en `-2147483648`. Después `new Cell(-2147483648)` lanza una excepción en medio del movimiento.


### Bug 2: overflow del score (3 FAIL)

`score += valor` supera `Integer.MAX_VALUE` y el score queda negativo, por lo que `repOk()` da falso.


## Correcciones

- Se agregó `Cell.MAX_VALUE = 2^30`. Una ficha con ese valor ya no se puede fusionar: `canMergeWith` devuelve `false`. Por eso `isLosingBoard` ahora también considera perdido un tablero lleno en el que el único par igual es de 2³⁰. 
- El score se satura en `Integer.MAX_VALUE` en lugar de desbordar. 
- ReferenceModel se actualizó con estas dos reglas.

## Después de corregir
| Test | Bug | Antes de corregir | Después |
| `maxValueCellsCannotMerge` | 1 | ✘ `canMergeWith` devolvía `true` | ✔ |
| `movingTwoMaxValueTilesDoesNotCrash` | 1 | ✘ `IllegalArgumentException: Cell value cannot be negative: -2147483648` | ✔ |
| `fullBoardWithOnlyMaxValuePairsIsLosing` | 1 | ✘ `isLosingBoard()` devolvía `false` | ✔ |
| `scoreSaturatesInsteadOfOverflowing` | 2 | ✘ score = `-2147483648` | ✔ |



## Ejercicio 1.b: Fuzzing con mutaciones

### Cómo correr

    source ./settear-java-21.sh
    ./12-fuzz-mutated-boards.sh 10000 20 0

### Archivos
- `fuzzing/mutator.py`: mutador básico. Toma tableros válidos (los del fuzzer de gramática) y aplica entre 1 y 5 mutaciones: borrar, insertar o reemplazar un carácter. Los caracteres insertados incluyen símbolos de la sintaxis, dígitos unicode y blancos.
- `MutationHarness.java`: arnés. Un validador independiente decide si cada string debería aceptarse y se compara contra `Board.fromString`. Además de las mutaciones, corre 57 casos escritos a mano (vacío, `null`, corchetes de menos o de más, comas dobles o finales, ceros a la izquierda, signos, valores fuera de rango, dígitos unicode, saltos de línea, tableros enormes).
- `12-fuzz-mutated-boards.sh`: compila, genera, muta y ejecuta el arnés.

### Resultados posibles
REJECTED y ACCEPTED son correctos. Son errores: WRONGLY_ACCEPTED (se aceptó un string inválido), WRONGLY_REJECTED (se rechazó uno válido), FAIL (falló un oráculo) y CRASH (escapó una excepción o error distinto de `IllegalArgumentException`).

### Errores encontrados
Primera corrida sobre 10.057 entradas: REJECTED 9968, ACCEPTED 71, WRONGLY_REJECTED 16, CRASH 2.

**Bug 1: `StackOverflowError` con tableros muy grandes (2 CRASH).**
`fromString` valida la sintaxis con una expresión regular; en tableros de 300×300 y 1000×1000 el regex desborda la pila y el error escapa en lugar de rechazarse.

**WRONGLY_REJECTED (16): no es un bug de `Board`.** Eran strings con tabs alrededor de los valores. `Board` rechaza los tabs, mientras que el validador del arnés los trataba como espacios permitidos. Se corrigió el validador. Decisión de especificación: `fromString` tolera espacios ASCII y rechaza tabs y cualquier otro blanco.

### Corrección
`fromString` captura el `StackOverflowError` del regex y lanza `IllegalArgumentException("Board string too long to parse")`.
Limitación conocida: un tablero válido pero demasiado grande para el regex se rechaza. Una alternativa futura es reemplazar el regex por un recorrido manual.

### Después de corregir
Corrida limpia con la misma semilla: REJECTED 9986, ACCEPTED 71, WRONGLY_ACCEPTED 0, WRONGLY_REJECTED 0, FAIL 0, CRASH 0.

