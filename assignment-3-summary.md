# Assignment 3

## Phase 1: Automated Test Generation with EvoSuite

Se generaron tests con EvoSuite 1.0.6 (`4-generarTestsEvosuite.sh`) para `Cell`, `Board`, `Position`, `DeterministicPlacement` y `NonDeterministicPlacement`. Los tests se encuentran en `src/test/java/EvosuiteTests/`.

### 1.3 Medicion de cobertura

Los tests de EvoSuite usan por defecto @RunWith(EvoRunner.class) con separateClassLoader = true. Con esa opcion el codigo bajo prueba se carga en un classloader propio y JaCoCo no lo ve: el reporte sale en 0 % en todas las clases. 
Siguiendo la documentacion de EvoSuite (https://www.evosuite.org/documentation/measuring-code-coverage/) se seteo separateClassLoader = false en los cinco tests *_ESTest.java y se corrio para generar el reporte solo con los 95 tests generados con EvoSuite:

```bash
mvn -f pom-evosuite.xml clean test jacoco:report -Dtest='*_ESTest'
```

**Reporte de JaCoCo sobre los tests de EvoSuite**

| Clase                     | Cov. instr.  |  Cov. ramas | 
| :------------------------ |  ------------|  -----------| 
| Total                     |       97.8 % |      89.4 % | 
| Board                     |         97 % |        87 % | 
| Cell                      |         98 % |        94 % | 
| Position                  |        100 % |       100 % |
| NonDeterministicPlacement |        100 % |       100 % | 
| DeterministicPlacement    |        100 % |       100 % |


### Comparacion con suite manual y con Randoop

Los tres suites se miden con JaCoCo, sin contar MainCLI. Manual y EvoSuite se midieron con el mismo comando y los mismos criterios (`mvn -f pom-evosuite.xml clean test jacoco:report -Dtest=...`, con `-Dtest` eligiendo los tests de cada suite).

| Clase                     | Manual antes de repOK (*A2) | Manual con repOK (linea / rama) | Randoop, A2 (linea / rama) | EvoSuite (linea / rama) |
| :------------------------ | :------------------------- | :------------------------------ | :------------------------- | :---------------------- |
| Board                     | 100 %                      | 94 % / 85 %                     | 100 % / 97 %               | 96 % / 87 %             |
| Cell                      | 100 %                      | 79 % / 78 %                     | 100 % / 100 %              | 97 % / 94 %             |
| Position                  | 100 %                      | 100 % / 100 %                   | 100 % / 100 %              | 100 % / 100 %           |
| DeterministicPlacement    | 100 %                      | 100 % / 100 %                   | 100 % / 100 %              | 100 % / 100 %           |
| NonDeterministicPlacement | 100 %                      | 100 % / 100 %                   | 100 % / 100 %              | 100 % / 100 %           |


* *A2:  Assignment 2
* "Manual antes de repOK" es la cobertura reportada en Assignment 2 (Fase 2). "Manual con repOK" es la cobertura actual del suite manual medida con `mvn -f pom-evosuite.xml clean test jacoco:report -Dtest='BoardTest,CellTest,DeterministicBoardTest'`.

**Cantidad de Tests:**

- Suite EvoSuite son 95 tests. (Mas compacto)
- Suite Manual son 102 tests. 
- Suite Randoop son 243 tests. (Mas cobertura)


**Comparacion**
- Los tres suites cubren al 100% Position, DeterministicPlacement y NonDeterministicPlacement en sentencias y ramas.
- En Cell, Randoop logra más cobertura (100 % / 100 %). luego EvoSuite (97 % de lineas, 94 % de ramas) y por ultimo la suite manual (79 % / 78 %).
- Igualmente en Board, Randoop es el mas alto (100 % / 97 %), luego EvoSuite (96 % / 87 %) y suite manual (94 % / 85 %).
- La cobertura de la suite manual con `repOK()` disminuye (Cell baja de 100 % a 79 % de lineas, Board a 94 %). Debido a que se agrego `repOK()` y se corrigio el constructor sin ampliar los tests manuales.
