package ar.edu.unrc.game2048;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import randoop.CheckRep;

/**
 * Represents the 2048 game board.
 * The board is a square grid of Cells, typically 4x4.
 *
 * Representation Invariants:
 * - grid is a non-null square matrix (rows == cols)
 * - all cells in the grid are non-null (they may be EMPTY)
 * - all cell values are valid per Cell invariants
 * - the board is always in a valid game state
 *
 * Thread-safety: This class is not thread-safe.
 */
public class Board {

    /**
     * Board default number of rows/columns (4 x 4)
     */
    public static final int DEFAULT_SIZE = 4;

    /**
     * Default winning value: when board contains this value, the player wins (2048)
     */
    public static final int WINNING_VALUE = 2048;

    /**
     * Board size (i.e., number of rows and columns). Must be > 0.
     */
    private final int size;

    /**
     * Contents of the board: a 2D array of Cells. grid[row][col] represents the
     * cell at (row, col).
     */
    private final Cell[][] grid;

    /**
     * Game accumulated score.
     */
    private int score;

    /**
     * Placement strategy after moving the tiles.
     */
    private PlacementStrategy strategy;

    /**
     * Creates a new board of the default size (4x4) with two random tiles.
     */
    public Board() {
        this(DEFAULT_SIZE);
    }

    /**
     * Creates a new board of the specified size with two random tiles.
     *
     * @param size the board size (must be > 0)
     * @throws IllegalArgumentException if size <= 0
     */ 
    public Board(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Board size must be positive: " + size);
        }
        this.size = size;
        this.grid = new Cell[size][size];
        this.score = 0;
        initializeEmpty();
        this.strategy = new NonDeterministicPlacement();
        this.strategy.addTile(this);
        this.strategy.addTile(this);
    }
    
    public Board(int size, PlacementStrategy strat) {
        if (size <= 0) {
            throw new IllegalArgumentException("Board size must be positive: " + size);
        }
        this.strategy = strat;
        if (strat == null) {
            this.strategy = new NonDeterministicPlacement();
            //this.strategy = new DeterministicPlacement();
        }
        this.size = size;
        this.grid = new Cell[size][size];
        this.score = 0;
        initializeEmpty();
        this.strategy.addTile(this);
        this.strategy.addTile(this);
    }

    /**
     * Copy constructor - creates a deep copy of another board.
     *
     * @param other the board to copy
     * @throws IllegalArgumentException if other == null
     */
    public Board(Board other) {
        if (other == null) {
            throw new IllegalArgumentException("Board to copy cannot be null");
        }
        this.size = other.size;
        this.grid = new Cell[size][size];
        this.score = other.score;
        this.strategy = other.strategy;
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                this.grid[r][c] = other.grid[r][c];
            }
        }
    }

    /**
     * Creates an all-empty board, WITHOUT the two initial random tiles.
     * Used by fromString(String, PlacementStrategy), where the cells
     * come from the input string.
     */
    private Board(PlacementStrategy strat, int size) {
        this.size = size;
        this.grid = new Cell[size][size];
        this.score = 0;
        this.strategy = (strat == null) ? new NonDeterministicPlacement() : strat;
        initializeEmpty();
    }

    // ==================== BOARD FROM / TO STRING ====================

    /**
     * Maximum number of digits accepted for a single cell. The biggest power of
     * two that fits in an int is 2^30 = 1073741824 (10 digits).
     */
    private static final int MAX_DIGITS = 10;

    /**
     * Grammar of a valid board string (only ASCII spaces are accepted as
     * whitespace):
     *
     * <pre>
     *   board  ::= ' '* '[' ' '* number (' '* ',' ' '* number)* ' '* ']' ' '*
     *   number ::= '0' | [1-9][0-9]*
     * </pre>
     *
     * Plus the semantic restrictions checked in fromString
     * the amount of numbers is a perfect square n*n (n &gt;= 1), and every number
     * is 0 or a power of two that fits in an int (&lt;= 2^30).
     */
    private static final java.util.regex.Pattern BOARD_PATTERN = java.util.regex.Pattern.compile(
            " *\\[ *(0|[1-9][0-9]*)( *, *(0|[1-9][0-9]*))* *\\] *");

    /**
     * Builds a board from a string such as
     * [0,0,0,0,4,2,0,0,0,0,0,0,2,2,2,2], using a non-deterministic
     * placement strategy.
     */
    public static Board fromString(String s) {
        return fromString(s, null);
    }

    /**
     * Builds a board from a string with n*n comma-separated cell values, listed
     * row by row. The resulting board has score 0 and no extra tiles added.
     *
     * @param s     the board string 
     * @param strat the placement strategy (null means non-deterministic)
     * @return a board whose cells are the given values
     * @throws IllegalArgumentException if s is null or is not a valid
     *                                  board string
     */
    public static Board fromString(String s, PlacementStrategy strat) {
        if (s == null) {
            throw new IllegalArgumentException("Board string cannot be null");
        }
        boolean matches;
        try {
            matches = BOARD_PATTERN.matcher(s).matches();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException(
                    "Board string too long to parse: " + s.length() + " chars");
        }
        if (!matches) {
            throw new IllegalArgumentException("Malformed board string: " + s);
        }

        // Syntax is OK: strip the brackets and split by commas
        String body = s.trim();
        body = body.substring(1, body.length() - 1);
        String[] parts = body.split(",");

        int n = parts.length;
        int size = (int) Math.round(Math.sqrt(n));
        if (size * size != n) {
            throw new IllegalArgumentException(
                    "The number of cells (" + n + ") is not a perfect square");
        }

        Board board = new Board(strat, size);
        for (int i = 0; i < n; i++) {
            String token = parts[i].trim();
            if (token.length() > MAX_DIGITS) {
                throw new IllegalArgumentException("Cell value too big: " + token);
            }
            long value = Long.parseLong(token);
            if (value > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Cell value too big: " + token);
            }
            // Cell's constructor rejects values that are not 0 or a power of two
            board.grid[i / size][i % size] = new Cell((int) value);
        }
        return board;
    }

    /**
     * Serializes the cells of this board in the format accepted by
     * fromString(String) = [0,2,0,4]. The score is not
     * included.
     *
     * @return the board as a string
     */
    public String toArrayString() {
        StringBuilder sb = new StringBuilder("[");
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (r > 0 || c > 0) {
                    sb.append(',');
                }
                sb.append(grid[r][c].getValue());
            }
        }
        return sb.append(']').toString();
    }

    /**
     * Initializes the board with all EMPTY cells.
     */
    private void initializeEmpty() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                grid[r][c] = Cell.EMPTY;
            }
        }
    }

    /**
     * Gets the placement strategy of the board (deterministic or
     * non-deterministic).
     *
     * @return the placement strategy
     */
    public PlacementStrategy getStrategy() {
        return this.strategy;
    }

    /**
     * Gets the board size (number of rows/columns).
     *
     * @return the board size
     */
    public int getSize() {
        return size;
    }

    /**
     * Gets the current score.
     *
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * Gets the cell at the specified position.
     *
     * @param row the row index (0-based)
     * @param col the column index (0-based)
     * @return the cell at the specified position
     * @throws IndexOutOfBoundsException if row or col is out of bounds
     */
    public Cell getCell(int row, int col) {
        validatePosition(row, col);
        return grid[row][col];
    }

    /**
     * Sets a cell at the specified position.
     *
     * @param row  the row index (0-based)
     * @param col  the column index (0-based)
     * @param cell the cell to set (must not be null)
     * @throws IndexOutOfBoundsException if row or col is out of bounds
     * @throws IllegalArgumentException  if cell is null
     */
    public void setCell(int row, int col, Cell cell) {
        validatePosition(row, col);
        if (cell == null) {
            throw new IllegalArgumentException("Cell cannot be null");
        }
        grid[row][col] = cell;
    }

    /**
     * Validates that a position is within bounds.
     *
     * @param row the row index
     * @param col the column index
     * @throws IndexOutOfBoundsException if the position is out of bounds
     */
    protected void validatePosition(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("Position (%d, %d) is out of bounds for board size %d",
                            row, col, size));
        }
    }

    /**
     * Gets all empty cells on the board.
     *
     * @return a set of positions of all empty cells
     */
    public Set<Position> getEmptyPositions() {
        Set<Position> empty = new HashSet<>();
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (grid[r][c].isEmpty()) {
                    empty.add(new Position(r, c));
                }
            }
        }
        return empty;
    }

    /**
     * Checks if the board has any empty cells.
     *
     * @return true if there is at least one empty cell
     */
    public boolean hasEmptyCells() {
        return !getEmptyPositions().isEmpty();
    }

    /**
     * Checks if the board is in a winning state.
     * A board is winning if it contains a cell with the WINNING_VALUE (2048).
     *
     * @return true if the board contains 2048
     */
    public boolean isWinningBoard() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (grid[r][c].getValue() == WINNING_VALUE) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if the board is in a losing state (game over).
     * A board is losing if there are no empty cells AND no adjacent cells
     * (horizontal or vertical) can be merged.
     *
     * @return true if the game is over and the player has lost
     */
    public boolean isLosingBoard() {
        if (hasEmptyCells()) {
            return false;
        }

        // Check for possible merges
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                Cell current = grid[r][c];
                // Check right neighbor
                if (c + 1 < size && current.canMergeWith(grid[r][c + 1])) {
                    return false;
                }
                // Check down neighbor
                if (r + 1 < size && current.canMergeWith(grid[r + 1][c])) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the board is full (no empty cells).
     *
     * @return true if there are no empty cells
     */
    public boolean isFull() {
        return !hasEmptyCells();
    }

    // ==================== MOVE OPERATIONS (WITH DESIGN PROBLEMS)
    // ====================

    /**
     * Remove empty cells of a given list of cells
     *
     * @param cellList the list to remove the empty cells
     * @return a list of cells containing the non-empty cells
     */
    protected List<Cell> removeEmptyCells(List<Cell> cellList) {
        List<Cell> nonEmpty = new ArrayList<>();
        for (Cell cell : cellList) {
            if (!cell.isEmpty()) {
                nonEmpty.add(cell);
            }
        }
        return nonEmpty;
    }

    /**
     * Merge adjacent equal cells
     *
     * @param cellList a list of cells
     * @return a list of cells that were able to be merged
     */
    protected List<Cell> mergeAdjacentEqualsCells(List<Cell> cellList) {
        List<Cell> merged = new ArrayList<>();
        int i = 0;
        while (i < cellList.size()) {
            if (i + 1 < cellList.size() &&
                    cellList.get(i).canMergeWith(cellList.get(i + 1))) {
                Cell mergedCell = cellList.get(i).mergeWith(cellList.get(i + 1));
                merged.add(mergedCell);
                score = (int) Math.min((long) score + mergedCell.getValue(), Integer.MAX_VALUE);
                i += 2;
            } else {
                merged.add(cellList.get(i));
                i++;
            }
        }
        return merged;
    }

    /**
     * Pad with empty cells
     *
     * Completes the given list of cells already merged with empty cells
     *
     * @param merged a list of cells merged
     */
    protected void padWithEmptyCells(List<Cell> merged) {
        while (merged.size() < size) {
            merged.add(Cell.EMPTY);
        }
    }

    /**
     * Moves all tiles upward.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveUp() {
        if (isLosingBoard() || isWinningBoard()) {
            return false;
        }

        Board previous = new Board(this);

        // For each column, slide up
        for (int col = 0; col < size; col++) {
            // Create a list of cells from top to bottom
            List<Cell> column = new ArrayList<>();
            for (int row = 0; row < size; row++) {
                column.add(grid[row][col]);
            }
            // Remove empty cells (slide up)
            List<Cell> nonEmpty = removeEmptyCells(column);
            // Merge adjacent equal cells
            List<Cell> merged = mergeAdjacentEqualsCells(nonEmpty);
            // Pad with empty cells
            padWithEmptyCells(merged);
            // Put back into the column
            for (int row = 0; row < size; row++) {
                grid[row][col] = merged.get(row);
            }
        }

        boolean moved = !this.equals(previous);
        if (moved) {
            this.strategy.addTile(this); // Add a tile after successful move depending on the game strategy
        }
        return moved;
    }

    /**
     * Moves all tiles downward.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveDown() {
        if (isLosingBoard() || isWinningBoard()) {
            return false;
        }

        Board previous = new Board(this);

        // For each column, slide down
        for (int col = 0; col < size; col++) {
            // Create a list of cells from bottom to top (reverse order)
            List<Cell> column = new ArrayList<>();
            for (int row = size - 1; row >= 0; row--) {
                column.add(grid[row][col]);
            }
            // Remove empty cells
            List<Cell> nonEmpty = removeEmptyCells(column);
            // Merge adjacent equal cells
            List<Cell> merged = mergeAdjacentEqualsCells(nonEmpty);
            // Pad with empty cells
            padWithEmptyCells(merged);

            // Put back into the column (reverse back to original order)
            for (int row = size - 1; row >= 0; row--) {
                grid[row][col] = merged.get(size - 1 - row);
            }
        }

        boolean moved = !this.equals(previous);
        if (moved) {
            this.strategy.addTile(this); // Add a tile after successful move depending on the game strategy
        }
        return moved;
    }

    /**
     * Moves all tiles left.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveLeft() {
        if (isLosingBoard() || isWinningBoard()) {
            return false;
        }

        Board previous = new Board(this);

        // For each row, slide left
        for (int row = 0; row < size; row++) {
            // Create a list of cells from left to right
            List<Cell> rowList = new ArrayList<>();
            for (int col = 0; col < size; col++) {
                rowList.add(grid[row][col]);
            }
            // Remove empty cells
            List<Cell> nonEmpty = removeEmptyCells(rowList);
            // Merge adjacent equal cells
            List<Cell> merged = mergeAdjacentEqualsCells(nonEmpty);
            // Pad with empty cells
            padWithEmptyCells(merged);
            // Put back into the row
            for (int col = 0; col < size; col++) {
                grid[row][col] = merged.get(col);
            }
        }

        boolean moved = !this.equals(previous);
        if (moved) {
            this.strategy.addTile(this); // Add a tile after successful move depending on the game strategy
        }
        return moved;
    }

    /**
     * Moves all tiles right.
     *
     * @return true if the board changed, false otherwise
     */
    public boolean moveRight() {
        if (isLosingBoard() || isWinningBoard()) {
            return false;
        }

        Board previous = new Board(this);

        // For each row, slide right
        for (int row = 0; row < size; row++) {
            // Create a list of cells from right to left (reverse order)
            List<Cell> rowList = new ArrayList<>();
            for (int col = size - 1; col >= 0; col--) {
                rowList.add(grid[row][col]);
            }
            // Remove empty cells
            List<Cell> nonEmpty = removeEmptyCells(rowList);
            // Merge adjacent equal cells
            List<Cell> merged = mergeAdjacentEqualsCells(nonEmpty);
            // Pad with empty cells
            padWithEmptyCells(merged);

            // Put back into the row (reverse back to original order)
            for (int col = size - 1; col >= 0; col--) {
                grid[row][col] = merged.get(size - 1 - col);
            }
        }

        boolean moved = !this.equals(previous);
        if (moved) {
            this.strategy.addTile(this); // Add a tile after successful move depending on the game strategy
        }
        return moved;
    }

    // ==================== UTILITY METHODS ====================

    /**
     * Checks if this board is structurally identical to another.
     * Uses deep equality including score.
     *
     * @param o the object to compare
     * @return true if the boards are identical
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Board board = (Board) o;
        return size == board.size &&
                score == board.score &&
                Arrays.deepEquals(grid, board.grid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, Arrays.deepHashCode(grid), score);
    }

    /**
     * Returns a string representation of the board.
     * The board is displayed in a grid format with the current score.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Score: ").append(score).append("\n");
        for (int r = 0; r < size; r++) {
            sb.append("+");
            for (int c = 0; c < size; c++) {
                sb.append("-----+");
            }
            sb.append("\n|");
            for (int c = 0; c < size; c++) {
                String val = grid[r][c].isEmpty() ? "     " : String.format("%5d", grid[r][c].getValue());
                sb.append(val).append("|");
            }
            sb.append("\n");
        }
        sb.append("+");
        for (int c = 0; c < size; c++) {
            sb.append("-----+");
        }
        sb.append("\n");
        return sb.toString();
    }

    @CheckRep
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
}