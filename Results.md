## Phase 1

Jacoco report:

- Cobertura total 79%

- Main 0%
- Position 82%
- Board 86%
- Cell 92%
- DeterministicPlacement 94%
- NonDeterministicPlacement 95%

---

PITest report:

Total:

- Line coverage: 84%
- Mutation Coverage: 82%
- Test Strength: 90%

Board:

- Line coverage: 100%
- Mutation Coverage: 92%
- Test Strength: 92%

Cell:

- Line coverage: 100%
- Mutation Coverage: 96%
- Test Strength: 96%

DeterministicPlacement:

- Line coverage: 100%
- Mutation Coverage: 88%
- Test Strength: 88%

Main:

- Line coverage: 0%
- Mutation Coverage: 0%
- Test Strength: 100%

NonDeterministicPlacement:

- Line coverage: 100%
- Mutation Coverage: 29%
- Test Strength: 29%

Position:

- Line coverage: 100%
- Mutation Coverage: 90%
- Test Strength: 90%

## Resumen de Mutantes que sobrevivieron segun la corrida de PITest

1. Constructor de Board con parametro size

```java
// Metodo
public Board(int size) {
// Linea original
if (size <= 0) {
// Mutante
if (size < 0) {
```

2. Getter de score en clase Board

```java
// Metodo
public int getScore() {
// Linea original
return score;
// Mutante
return 0;
```

3. Getter de cell en clase Board

```java
// Metodo
public Cell getCell(int row, int col) {
// Linea original
validatePosition(row, col);
// Mutante
<LineRemoved>
```

4. Setter de cell en clase Board

```java
// Metodo
public void setCell(int row, int col, Cell cell) {
// Linea original
validatePosition(row, col);
// Mutante
<LineRemoved>
```

5. Mergeo de celdas iguales adjacentes

```java
// Metodo
protected List<Cell> mergeAdjacentEqualsCells(List<Cell> cellList) {
// Linea original
score += mergedCell.getValue();
// Mutante
score -= mergedCell.getValue();
```

6. Relleno con celdas vacias

```java
// Metodo
protected void padWithEmptyCells(List<Cell> merged) {
// Linea original
while (merged.size() < size) {
// Mutante
while (merged.size() <= size) {
```

7. toString de clase Board

```java
// Metodo
public String toString() {
// Linea original
for (int r = 0; r < size; r++) {
// Mutante
for (int r = 0; r >= size; r++) {
```

8. toString de clase Board

```java
// Metodo
public String toString() {
// Linea original
for (int c = 0; c < size; c++) {
// Mutantes
<NegatedConditional>
<ChangeConditionalBoundary>
```

9. toString de clase Board

```java
// Metodo
public String toString() {
// Linea original
for (int c = 0; c < size; c++) {
// Mutante
for (int c = 0; c >= size; c++) {
```

10. toString de clase Board

```java
// Metodo
public String toString() {
// Linea original
String val = grid[r][c].isEmpty() ? "     " : String.format("%5d", grid[r][c].getValue());
// Mutante
String val = !(grid[r][c].isEmpty()) ? "     " : String.format("%5d", grid[r][c].getValue());
```

11. toString de clase Board

```java
// Metodo
public String toString() {
// Linea original
for (int c = 0; c < size; c++) {
// Mutantes
<NegatedConditional>
<ChangeConditionalBoundary>
```

12. toString de clase Board

```java
// Metodo
public String toString() {
// Linea original
return sb.toString();
// Mutantes
return "";
```
