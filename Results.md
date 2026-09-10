## Phase 1

Jacoco report:

-Cobertura total 79%

-Main 0%
-Position 82%
-Board 86%
-Cell 92%
-DeterministicPlacement 94%
-NonDeterministicPlacement 95%

PitTest report:

Total:
-Line coverage: 75%
-Mutattion Coverage: 74%
-Test Strength: 89%

Board:
-Line coverage: 89%
-Mutattion Coverage: 87%
-Test Strength: 94%

Cell:
-Line coverage: 91%
-Mutattion Coverage: 91%
-Test Strength: 95%

DeterministicPlacement:
-Line coverage: 88%
-Mutattion Coverage: 63%
-Test Strength: 71%

Main:
-Line coverage: 0%
-Mutattion Coverage: 0%
-Test Strength: 100%

NonDeterministicPlacement:
-Line coverage: 89%
-Mutattion Coverage: 0%
-Test Strength: 0%

Position:
-Line coverage: 75%
-Mutattion Coverage: 40%
-Test Strength: 57%

### Resumen de Mutantes que sobrevivieron segun la corrida de PITest

1. Constructor de Board con parametro size

```java
// Metodo
public Board(int size) {
// Linea original
if (size <= 0) {
// Mutante
if (size < 0) {
```

2. Constructor de Board con parametro size y parametro PlacementStrategy

```java
// Metodo
public Board(int size, PlacementStrategy strat) {
// Linea original
if (size <= 0) {
// Mutante
if (size < 0) {
```

3. Getter de score en clase Board

```java
// Metodo
public int getScore() {
// Linea original
return score;
// Mutante
return 0;
```

4. Getter de cell en clase Board

```java
// Metodo
public Cell getCell(int row, int col) {
// Linea original
validatePosition(row, col);
// Mutante
<LineRemoved>
```

5. Setter de cell en clase Board

```java
// Metodo
public void setCell(int row, int col, Cell cell) {
// Linea original
validatePosition(row, col);
// Mutante
<LineRemoved>
```

6. Validacion de posicion

Hay dos mutantes que sobrevivieron, los dos por la misma razon sobre la misma linea

`changed conditional boundary → SURVIVED`

```java
// Metodo
private void validatePosition(int row, int col) {
// Linea original
if (row < 0 || row >= size || col < 0 || col >= size) {

// Posible Mutante 1
if (row <= 0 || row >= size || col < 0 || col >= size) {
// Posible Mutante 2
if (row < 0 || row >= size || col <= 0 || col >= size) {
// Posible Mutante 3
if (row < 0 || row > size || col < 0 || col >= size) {
// Posible Mutante 4
if (row < 0 || row >= size || col < 0 || col > size) {
```

7. Mergeo de celdas iguales adjacentes

```java
// Metodo
protected List<Cell> mergeAdjacentEqualsCells(List<Cell> cellList) {
// Linea original
score += mergedCell.getValue();
// Mutante
score -= mergedCell.getValue();
```

8. Relleno con celdas vacias

```java
// Metodo
protected void padWithEmptyCells(List<Cell> merged) {
// Linea original
while (merged.size() < size) {
// Mutante
while (merged.size() <= size) {
```

9. Metodo equals de clase Board

Falla por `NO_COVERAGE`

```java
// Metodo
public boolean equals(Object o) {
// Linea original
if (this == o)
  return true;
// Mutante
if (this == o)
  return false;
```

10. Metodo equals de clase Board

Falla por `NO_COVERAGE`

```java
// Metodo
public boolean equals(Object o) {
// Linea original
if (o == null || getClass() != o.getClass())
  return false;
// Mutante
if (o == null || getClass() != o.getClass())
  return true;
```

11. hashCode de clase Board

Falla por `NO_COVERAGE`

```java
// Metodo
public int hashCode() {
// Linea original
return Objects.hash(size, Arrays.deepHashCode(grid), score);
// Mutante
return 0;
```

12. toString de clase Board

Falla por `NO_COVERAGE`

```java
// Metodo
public String toString() {
// Linea original
for (int r = 0; r < size; r++) {
// Mutantes
<NegatedConditional>
<ChangeConditionalBoundary>
```

13. toString de clase Board

Falla por `NO_COVERAGE`

```java
// Metodo
public String toString() {
// Linea original
for (int c = 0; c < size; c++) {
// Mutantes
<NegatedConditional>
<ChangeConditionalBoundary>
```

14. toString de clase Board

Falla por `NO_COVERAGE`

```java
// Metodo
public String toString() {
// Linea original
for (int c = 0; c < size; c++) {
// Mutantes
<NegatedConditional>
<ChangeConditionalBoundary>
```

15. toString de clase Board

Falla por `NO_COVERAGE`

```java
// Metodo
public String toString() {
// Linea original
String val = grid[r][c].isEmpty() ? "     " : String.format("%5d", grid[r][c].getValue());
// Mutante
<NegatedConditional>
```

16. toString de clase Board

Falla por `NO_COVERAGE`

```java
// Metodo
public String toString() {
// Linea original
for (int c = 0; c < size; c++) {
// Mutantes
<NegatedConditional>
<ChangeConditionalBoundary>
```

17. toString de clase Board

Falla por `NO_COVERAGE`

```java
// Metodo
public String toString() {
// Linea original
return sb.toString();
// Mutante
return "";
```

## Phase 2: Improve Test Quality

Jacoco report:

- Cobertura total 100%

- Position 100%
- Board 100%
- Cell 100%
- DeterministicPlacement 100%
- NonDeterministicPlacement 100%

---

PITest report:

Total:

- Line coverage: 84%
- Mutation Coverage: 89%
- Test Strength: 98%

Board:

- Line coverage: 100%
- Mutation Coverage: 100%
- Test Strength: 100%

Cell:

- Line coverage: 100%
- Mutation Coverage: 100%
- Test Strength: 100%

DeterministicPlacement:

- Line coverage: 100%
- Mutation Coverage: 100%
- Test Strength: 100%

NonDeterministicPlacement:

- Line coverage: 100%
- Mutation Coverage: 43%
- Test Strength: 43%

Position:

- Line coverage: 100%
- Mutation Coverage: 90%
- Test Strength: 90%

---

## Phase 3: Automated Test Generation with Randoop - JaCoCo report

Generar los tests con Randoop

```
java -cp "lib/randoop-all-4.3.4.jar:target/classes" randoop.main.Main gentests \
  --testclass=ar.edu.unrc.game2048.Cell \
  --testclass=ar.edu.unrc.game2048.Board \
  --testclass=ar.edu.unrc.game2048.Position \
  --testclass=ar.edu.unrc.game2048.DeterministicPlacement \
  --omit-methods="\
    ar.edu.unrc.game2048.Board\(\)|\
    ar.edu.unrc.game2048.Board\(\s*int\s*\)$|\
    ar.edu.unrc.game2048.Board\(\s*ar.edu.unrc.game2048.Board\s*\)$" \
  --time-limit=10 \
  --junit-output-dir=src/test/java \
  --junit-package-name=randoopTests
```

Esta forma de generar tests con Randoop evita utilizar metodos no deterministicos para la construccion de Board
Como? Omitiendo los siguientes metodos:

- `Board()` (argumento `ar.edu.unrc.game2048.Board\(\)|\`)
- `Board(int size)` (argumento `ar.edu.unrc.game2048.Board\(\s*int\s*\)$|\`)
- `Board(Board board)` (argumento `ar.edu.unrc.game2048.Board\(\s*ar.edu.unrc.game2048.Board\s*\)$" \`)

JaCoCo Report:

Board
Line Coverage: 100 %
Branch Coverage: 97 %

Cell
Line Coverage: 100 %
Branch Coverage: 100 %

Position
Line Coverage: 100 %
Branch Coverage: 100 %

DeterministicPlacement
Line Coverage: 100 %
Branch Coverage: 100 %

NonDeterministicPlacement
Line Coverage: 100 %
Branch Coverage: 100 %

PITest Report:

| Number of Classes | %    | Line Coverage | %   | Mutation Coverage | %   | Test Strength |
| :---------------- | :--- | :------------ | :-- | :---------------- | :-- | :------------ |
| 5                 | 100% | 238/238       | 99% | 212/213           | 99% | 212/213       |

Breakdown by Class

| Name                           | %    | Line Coverage | %    | Mutation Coverage | %    | Test Strength |
| :----------------------------- | :--- | :------------ | :--- | :---------------- | :--- | :------------ |
| Board.java                     | 100% | 187/187       | 100% | 165/165           | 100% | 165/165       |
| Cell.java                      | 100% | 22/22         | 100% | 23/23             | 100% | 23/23         |
| DeterministicPlacement.java    | 100% | 8/8           | 100% | 8/8               | 100% | 8/8           |
| NonDeterministicPlacement.java | 100% | 9/9           | 86%  | 6/7               | 86%  | 6/7           |
| Position.java                  | 100% | 12/12         | 100% | 10/10             | 100% | 10/10         |
