package ar.edu.unrc.game2048;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class BoardTest {
    // ==== Constructor tests ====
    @Test
    public void defaultConstructorTest() {
        // Arrange - Act
        Board board = new Board();
        // Assert
        assertNotNull(board);
    }

    @Test
    public void nonDeterministicClassWhenUsingDefaultConstructorTest() {
        // Arrange & Act
        Board board = new Board();
        // Assert
        assertEquals(board.getStrategy().getClass(), new NonDeterministicPlacement().getClass());
    }

    @Test
    public void parameterConstructorTest() {
        int inputSize = 6;
        // Arrange - Act
        Board board = new Board(inputSize);
        // Assert
        assertEquals(board.getSize(), inputSize);

    }

    @Test
    public void nonDeterministicClassWhenUsingsizeParameterizedConstructorTest() {
        // Arrange & Act
        int inputSize = 6;
        Board board = new Board(inputSize);
        // Assert
        assertEquals(board.getStrategy().getClass(), new NonDeterministicPlacement().getClass());
    }

    @Test
    public void strategyNullConstructorTest() {
        // Arrange & Act
        int inputSize = 6;
        PlacementStrategy strat = null;
        Board board = new Board(inputSize, strat);
        // Assert
        assertEquals(board.getStrategy().getClass(), new NonDeterministicPlacement().getClass());
    }

    @Test
    public void parameterConstructorNegativeNumberExeptionTest() {
        // Arrange
        int inputSize = -1;
        // Act - Assert
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(inputSize);
        });

    }

    @Test
    public void illegalSizeWithNonDeterministicStrategyConstructorTest() {
        // Arrange
        int inputSize = -1;
        // Act - Assert
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(inputSize, new NonDeterministicPlacement());
        });
    }

    @Test
    public void zeroSizedWithNonDeterministicStrategyConstructorTest() {
        // Arrange
        int inputSize = 0;
        // Act - Assert
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(inputSize, new NonDeterministicPlacement());
        });
    }

    @Test
    public void copyConstructorTest() {
        // Arrange
        int inputSize = 6;
        Board board = new Board(inputSize);
        // Act
        Board copy = new Board(board);
        // Assert
        assertEquals(board, copy);
    }

    @Test
    public void nonDeterministicStrategyConstructorTest() {
        // Arrange & Act
        int inputSize = 6;
        NonDeterministicPlacement strat = new NonDeterministicPlacement();
        Board board = new Board(inputSize, strat);
        // Assert
        assertEquals(board.getStrategy().getClass(), new NonDeterministicPlacement().getClass());
    }

    // ==== Getter tests ====

    @Test
    public void getSizeTest() {
        // Arrange
        int inputSize = 5;
        Board board = new Board(inputSize);
        // Act
        int result = board.getSize();
        // Assert
        assertEquals(inputSize, result);
    }

    @Test
    public void getScoreInitialValueTest() {
        // Arrange
        Board board = new Board();
        // Act
        int result = board.getScore();
        // Assert
        assertEquals(0, result);
    }

    @Test
    public void getCellValidPositionTest() {
        // Arrange
        Board board = new Board(4);
        // Act
        Cell result = board.getCell(0, 0);
        // Assert
        assertNotNull(result);
    }

    @Test
    public void getCellOutOfBoundsThrowsExceptionTest() {
        // Arrange
        Board board = new Board(4);
        // Act - Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            board.getCell(4, 0);
        });
    }

    @Test
    public void getEmptyPositionTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);

        // Act
        Set<Position> emptyPositions = new HashSet<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cellToTest = boardToTest.getCell(i, j);
                if (cellToTest.isEmpty()) {
                    Position cellPosition = new Position(i, j);
                    emptyPositions.add(cellPosition);
                }
            }
        }

        // Assert
        assertEquals(boardToTest.getEmptyPositions(), emptyPositions);
    }

    // ==== Setter tests ====

    @Test
    public void setCellValidPositionTest() {
        // Arrange
        Board board = new Board(4);
        Cell newCell = Cell.EMPTY;
        // Act
        board.setCell(1, 1, newCell);
        // Assert
        assertEquals(newCell, board.getCell(1, 1));
    }

    @Test
    public void setCellNullThrowsExceptionTest() {
        // Arrange
        Board board = new Board(4);
        // Act - Assert
        assertThrows(IllegalArgumentException.class, () -> {
            board.setCell(0, 0, null);
        });
    }

    @Test
    public void setCellOutOfBoundsThrowsExceptionTest() {
        // Arrange
        Board board = new Board(4);
        Cell newCell = Cell.EMPTY;
        // Act - Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            board.setCell(4, 4, newCell);
        });
    }

    // ==== ValidatePosition tests ====

    // Both valid values
    @Test
    public void validatePositionWithValidValuesTest() {
        // Arrange
        int size = 5;
        Board board = new Board(size);
        int row = 0;
        int col = 0;

        // Act
        board.validatePosition(row, col);

        // Assert
        assertTrue(true);
    }

    // Invalid: Negative row value
    @Test
    public void validatePositionWithNegativeRowTest() {
        // Arrange
        int size = 5;
        Board board = new Board(size);
        int row = -1;
        int col = 0;

        // Act - Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            board.validatePosition(row, col);
        });
    }

    // Invalid: Row greater or equal than size
    @Test
    public void validatePositionWithGreaterRowThanSizeTest() {
        // Arrange
        int size = 5;
        Board board = new Board(size);
        int row = size;
        int col = 0;

        // Act - Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            board.validatePosition(row, col);
        });
    }

    // Invalid: Negative column value
    @Test
    public void validatePositionWithNegativeColumnTest() {
        // Arrange
        int size = 5;
        Board board = new Board(size);
        int row = 0;
        int col = -1;

        // Act - Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            board.validatePosition(row, col);
        });
    }

    // Invalid: Column greater or equal than size
    @Test
    public void validatePositionWithGreaterColumnThanSizeTest() {
        // Arrange
        int size = 5;
        Board board = new Board(size);
        int row = 0;
        int col = size;

        // Act - Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            board.validatePosition(row, col);
        });
    }

    // ==== States of the board tests ====

    @Test
    public void hasEmptyCellsTest() {
        // Arrange
        Board boardToTest = new Board();

        // Act
        assertEquals(boardToTest.hasEmptyCells(), !boardToTest.isFull());
    }

    @Test
    public void isWinningBoardTest() {
        // Arrange
        Cell winning_cell = new Cell(Board.WINNING_VALUE);
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, winning_cell);

        // Act
        boolean isWinningBoard = boardToTest.isWinningBoard();

        // Assert
        assertTrue(isWinningBoard);
        assertFalse(boardToTest.isLosingBoard());
    }

    @Test
    public void isLosingBoardTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(8));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));

        // Act
        assertFalse(boardToTest.isWinningBoard());
        assertFalse(boardToTest.hasEmptyCells());
        assertTrue(boardToTest.isLosingBoard());
    }

    @Test
    public void isLosingBoardWithHorizontalMergeAvailableTest() {
        // Arrange
        Board board = new Board(2);
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        board.setCell(1, 0, new Cell(4));
        board.setCell(1, 1, new Cell(8));

        // Act & Assert
        assertFalse(board.isLosingBoard());
    }

    @Test
    public void isLosingBoardWithVerticalMergeAvailableTest() {
        // Arrange
        Board board = new Board(2);
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(4));
        board.setCell(1, 0, new Cell(2));
        board.setCell(1, 1, new Cell(8));

        // Act & Assert
        assertFalse(board.isLosingBoard());
    }

    @Test
    public void isFullTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(8));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));

        // Act
        boolean isFull = boardToTest.isFull();

        // Assert
        assertTrue(isFull);
    }

    // ==== Movement tests ====

    @Test
    public void moveUpTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(0));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));

        // Act
        boolean boardHasMoved = boardToTest.moveUp();

        // Assert
        assertTrue(boardHasMoved);
    }

    @Test
    public void moveUpWhenLosingBoardTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(8));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));

        // Act
        boolean boardHasMoved = boardToTest.moveUp();

        // Assert
        assertFalse(boardHasMoved);
    }

    @Test
    public void moveUpWhenWinningBoardTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2048));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));

        // Act
        boolean boardHasMoved = boardToTest.moveUp();

        // Assert
        assertFalse(boardHasMoved);
    }

    @Test
    public void moveUpWhenTopRowIsFullAndCanNotMergeTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(4));
        boardToTest.setCell(1, 0, new Cell(0));
        boardToTest.setCell(1, 1, new Cell(0));
        Board previousBoard = new Board(boardToTest);

        // Act
        boolean boardHasMoved = boardToTest.moveUp();

        // Assert
        assertFalse(boardHasMoved);
        assertEquals(previousBoard, boardToTest);
    }

    @Test
    public void moveDownTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(0));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));

        // Act
        boolean boardHasMoved = boardToTest.moveDown();

        // Assert
        assertTrue(boardHasMoved);
    }

    @Test
    public void moveDownWhenLosingBoardTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(8));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));

        // Act
        boolean boardHasMoved = boardToTest.moveDown();

        // Assert
        assertFalse(boardHasMoved);
    }

    @Test
    public void moveDownWhenWinningBoardTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2048));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));

        // Act
        boolean boardHasMoved = boardToTest.moveDown();

        // Assert
        assertFalse(boardHasMoved);
    }

    @Test
    public void moveDownWhenBottomRowIsFullAndCanNotMergeTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(0));
        boardToTest.setCell(0, 1, new Cell(0));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));
        Board previousBoard = new Board(boardToTest);

        // Act
        boolean boardHasMoved = boardToTest.moveDown();

        // Assert
        assertFalse(boardHasMoved);
        assertEquals(previousBoard, boardToTest);
    }

    @Test
    public void moveLeftTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(0));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));

        // Act
        boolean moved = boardToTest.moveLeft();

        // Assert
        assertTrue(moved);
    }

    @Test
    public void moveLeftWhenLosingBoardTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(8));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));

        // Act
        boolean boardHasMoved = boardToTest.moveLeft();

        // Assert
        assertFalse(boardHasMoved);
    }

    @Test
    public void moveLeftWhenWinningBoardTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2048));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));

        // Act
        boolean boardHasMoved = boardToTest.moveLeft();

        // Assert
        assertFalse(boardHasMoved);
    }

    @Test
    public void moveLeftWhenLeftColumnIsFullAndCanNotMergeTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(0));
        boardToTest.setCell(1, 0, new Cell(4));
        boardToTest.setCell(1, 1, new Cell(0));
        Board previousBoard = new Board(boardToTest);

        // Act
        boolean boardHasMoved = boardToTest.moveLeft();

        // Assert
        assertFalse(boardHasMoved);
        assertEquals(previousBoard, boardToTest);
    }

    @Test
    public void moveRightTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(0));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));

        // Act
        boolean moved = boardToTest.moveRight();

        // Assert
        assertTrue(moved);
    }

    @Test
    public void moveRightWhenLosingBoardTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(8));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));

        // Act
        boolean boardHasMoved = boardToTest.moveRight();

        // Assert
        assertFalse(boardHasMoved);
    }

    @Test
    public void moveRightWhenWinningBoardTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2048));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(4));

        // Act
        boolean boardHasMoved = boardToTest.moveRight();

        // Assert
        assertFalse(boardHasMoved);
    }

    @Test
    public void moveRightWhenRightColumnIsFullAndCanNotMergeTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(0));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 0, new Cell(0));
        boardToTest.setCell(1, 1, new Cell(4));
        Board previousBoard = new Board(boardToTest);

        // Act
        boolean boardHasMoved = boardToTest.moveRight();

        // Assert
        assertFalse(boardHasMoved);
        assertEquals(previousBoard, boardToTest);
    }

    // ==== Equals tests ====

    // Equal to some other board
    @Test
    public void equalsTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));
        Board b1Equal = new Board(boardToTest);

        // Act
        boolean boardVsB1 = boardToTest.equals(b1Equal);

        // Assert
        assertTrue(boardVsB1);
    }

    // Equal to itself
    @Test
    public void equalsToItselfTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));

        // Act
        boolean equalsResult = boardToTest.equals(boardToTest);

        // Assert
        assertTrue(equalsResult);
    }

    // Not equal with null
    @Test
    public void equalToNullTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));

        // Act
        boolean equalsResult = boardToTest.equals(null);

        // Assert
        assertFalse(equalsResult);
    }

    // Not equal because of the class
    @Test
    public void equalToAnotherClassTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));
        Cell[] board = new Cell[] { new Cell(2), new Cell(2), new Cell(2), new Cell(2) };

        // Act
        boolean equalsResult = boardToTest.equals(board);

        // Assert
        assertFalse(equalsResult);
    }

    // Not equal because of the size
    @Test
    public void notSizeEqualsTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));
        int b2Size = 4;
        Board b2SizeNotEqual = new Board(b2Size);

        // Act
        boolean boardVsB2 = boardToTest.equals(b2SizeNotEqual);

        // Assert
        assertFalse(boardVsB2);
    }

    // Not equal because of the value of the cells
    @Test
    public void notElementsEqualsTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));
        Board b3CellsNotEqual = new Board(size);
        b3CellsNotEqual.setCell(0, 0, new Cell(4));
        b3CellsNotEqual.setCell(1, 0, new Cell(2));
        b3CellsNotEqual.setCell(0, 1, new Cell(2));
        b3CellsNotEqual.setCell(1, 1, new Cell(2));

        // Act
        boolean boardVsB3 = boardToTest.equals(b3CellsNotEqual);

        // Assert
        assertFalse(boardVsB3);
    }

    // ==== To String test ====

    @Test
    public void toStringBoardEmptyTest() {
        // Arrange
        Board board = new Board(4);
        // Act
        String result = board.toString();
        // Assert
        assertNotNull(result,
                "Score: 0\n+----+----+----+----+\n|    |    |    |    |\n+----+----+----+----+\n|    |    |    |    |\n+----+----+----+----+\n|    |    |    |    |\n+----+----+----+----+\n|    |    |    |    |\n+----+----+----+----+\n");
    }

    // ==== Hash Code test ====
    @Test
    public void hashCodeTest() {
        // Arrange
        Board boardOne = new Board(4);
        Board boardTwo = new Board(boardOne);
        // Act
        int hashCodeOne = boardOne.hashCode();
        int hashCodeTwo = boardTwo.hashCode();
        // Assert
        assertEquals(hashCodeOne, hashCodeTwo);
    }

    @Test
    public void hashCodeShouldNotReturnZeroTest() {
        // Arrange
        Board board = new Board(4, new DeterministicPlacement());
        // Act
        int result = board.hashCode();
        // Assert
        assertNotEquals(0, result);
    }
}
