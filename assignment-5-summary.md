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
