package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import ar.edu.unrc.game2048.Board.Position;

class BoardTest {
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
        assert boardToTest.getEmptyPositions().equals(emptyPositions);
    }

    @Test
    public void hasEmptyCellsTest() {
        // Arrange
        Board boardToTest = new Board();

        // Act
        assert boardToTest.hasEmptyCells() == !boardToTest.isFull();
    }

    @Test
    public void isWinningBoardTest() {
        // Arrange
        int win_value = 2048;
        Cell winning_cell = new Cell(win_value);
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, winning_cell);
        boolean found = false;

        // Act
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cellToTest = boardToTest.getCell(i, j);
                if (cellToTest.equals(winning_cell)) {
                    found = true;
                }
            }
        }

        // Assert
        assert !boardToTest.isLosingBoard();
        assert found;
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
        assert !boardToTest.isWinningBoard();
        assert !boardToTest.hasEmptyCells();
        assert boardToTest.isLosingBoard();
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
        assert isFull;
    }

    @Test
    public void moveUpTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);

        // Act
        boolean boardHasMoved = boardToTest.moveUp();

        // Assert
        assert boardHasMoved;
    }

    @Test
    public void hardcodedMoveUpTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(0));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));
        // There are two possibles board oracles after moving because of the random tile
        Board firstOracleBoard = new Board(size);
        firstOracleBoard.setCell(0, 0, new Cell(4));
        firstOracleBoard.setCell(0, 1, new Cell(2));
        firstOracleBoard.setCell(1, 0, new Cell(0));
        firstOracleBoard.setCell(1, 1, new Cell(2));
        Board secondOracleBoard = new Board(size);
        secondOracleBoard.setCell(0, 0, new Cell(4));
        secondOracleBoard.setCell(0, 1, new Cell(2));
        secondOracleBoard.setCell(1, 0, new Cell(2));
        secondOracleBoard.setCell(1, 1, new Cell(0));

        // Act
        boardToTest.moveUp();
        Cell topLeftBoardCell = boardToTest.getCell(0, 0);
        Cell topRightBoardCell = boardToTest.getCell(0, 1);
        // Board to test vs first oracle
        Cell topLeftFirstOracleCell = firstOracleBoard.getCell(0, 0);
        Cell topRightFirstOracleCell = firstOracleBoard.getCell(0, 1);
        // Board to test vs second oracle
        Cell topLeftSecondOracleCell = secondOracleBoard.getCell(0, 0);
        Cell topRightSecondOracleCell = secondOracleBoard.getCell(0, 1);
        boolean cellsAreEquals = topLeftBoardCell.equals(topLeftFirstOracleCell)
                && topRightBoardCell.equals(topRightFirstOracleCell);
        cellsAreEquals = cellsAreEquals || topLeftBoardCell.equals(topLeftSecondOracleCell)
                && topRightBoardCell.equals(topRightSecondOracleCell);

        // Assert
        assert cellsAreEquals;
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
        assert !boardHasMoved;
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
        assert !boardHasMoved;
    }

    @Test
    public void moveDownTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        Board defaultBoard = new Board();

        // Act
        boolean boardHasMoved = boardToTest.moveDown();
        boolean defaultBoardHasMoved = defaultBoard.moveDown();

        // Assert
        assert defaultBoardHasMoved;
        assert boardHasMoved;
    }

    @Test
    public void hardcodedMoveDownTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(0));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));
        // There are two possibles board oracles after moving because of the random tile
        Board firstOracleBoard = new Board(size);
        firstOracleBoard.setCell(0, 0, new Cell(0));
        firstOracleBoard.setCell(0, 1, new Cell(2));
        firstOracleBoard.setCell(1, 0, new Cell(4));
        firstOracleBoard.setCell(1, 1, new Cell(2));
        Board secondOracleBoard = new Board(size);
        secondOracleBoard.setCell(0, 0, new Cell(2));
        secondOracleBoard.setCell(0, 1, new Cell(0));
        secondOracleBoard.setCell(1, 0, new Cell(4));
        secondOracleBoard.setCell(1, 1, new Cell(2));

        // Act
        boardToTest.moveDown();
        Cell bottomLeftBoardCell = boardToTest.getCell(1, 0);
        Cell bottomRightBoardCell = boardToTest.getCell(1, 1);
        // Board to test vs first oracle
        Cell bottomLeftFirstOracleCell = firstOracleBoard.getCell(1, 0);
        Cell bottomRightFirstOracleCell = firstOracleBoard.getCell(1, 1);
        // Board to test vs second oracle
        Cell bottomLeftSecondOracleCell = secondOracleBoard.getCell(1, 0);
        Cell bottomRightSecondOracleCell = secondOracleBoard.getCell(1, 1);
        boolean cellsAreEquals = bottomLeftBoardCell.equals(bottomLeftFirstOracleCell)
                && bottomRightBoardCell.equals(bottomRightFirstOracleCell);
        cellsAreEquals = cellsAreEquals || bottomLeftBoardCell.equals(bottomLeftSecondOracleCell)
                && bottomRightBoardCell.equals(bottomRightSecondOracleCell);

        // Assert
        assert cellsAreEquals;
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
        assert !boardHasMoved;
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
        assert !boardHasMoved;
    }

    @Test
    public void moveLeftTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        Board defaultBoard = new Board();

        // Act
        boolean boardHasMoved = boardToTest.moveLeft();
        boolean defaultBoardHasMoved = defaultBoard.moveLeft();

        // Assert
        assert defaultBoardHasMoved;
        assert boardHasMoved;
    }

    @Test
    public void hardcodedMoveLeftTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(0));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));
        // There are two possibles board oracles after moving because of the random tile
        Board firstOracleBoard = new Board(size);
        firstOracleBoard.setCell(0, 0, new Cell(2));
        firstOracleBoard.setCell(0, 1, new Cell(0));
        firstOracleBoard.setCell(1, 0, new Cell(4));
        firstOracleBoard.setCell(1, 1, new Cell(2));
        Board secondOracleBoard = new Board(size);
        secondOracleBoard.setCell(0, 0, new Cell(2));
        secondOracleBoard.setCell(0, 1, new Cell(2));
        secondOracleBoard.setCell(1, 0, new Cell(4));
        secondOracleBoard.setCell(1, 1, new Cell(0));

        // Act
        boardToTest.moveLeft();
        Cell topLeftBoardCell = boardToTest.getCell(0, 0);
        Cell bottomLeftBoardCell = boardToTest.getCell(0, 1);
        // Board to test vs first oracle
        Cell topLeftFirstOracleCell = firstOracleBoard.getCell(0, 0);
        Cell bottomLeftFirstOracleCell = firstOracleBoard.getCell(0, 1);
        // Board to test vs second oracle
        Cell topLeftSecondOracleCell = secondOracleBoard.getCell(0, 0);
        Cell bottomLeftSecondOracleCell = secondOracleBoard.getCell(0, 1);
        boolean cellsAreEquals = bottomLeftBoardCell.equals(topLeftFirstOracleCell)
                && bottomLeftBoardCell.equals(bottomLeftFirstOracleCell);
        cellsAreEquals = cellsAreEquals || topLeftBoardCell.equals(topLeftSecondOracleCell)
                && bottomLeftBoardCell.equals(bottomLeftSecondOracleCell);

        // Assert
        assert cellsAreEquals;
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
        assert !boardHasMoved;
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
        assert !boardHasMoved;
    }

    @Test
    public void moveRightTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        Board defaultBoard = new Board();

        // Act
        boolean boardHasMoved = boardToTest.moveRight();
        boolean defaultBoardHasMoved = defaultBoard.moveRight();

        // Assert
        assert defaultBoardHasMoved;
        assert boardHasMoved;
    }

    @Test
    public void hardcodedMoveRightTest() {
        // Arrange
        int size = 2;
        Board boardToTest = new Board(size);
        boardToTest.setCell(0, 0, new Cell(2));
        boardToTest.setCell(0, 1, new Cell(0));
        boardToTest.setCell(1, 0, new Cell(2));
        boardToTest.setCell(1, 1, new Cell(2));
        // There are two possibles board oracles after moving because of the random tile
        Board firstOracleBoard = new Board(size);
        firstOracleBoard.setCell(0, 0, new Cell(0));
        firstOracleBoard.setCell(0, 1, new Cell(2));
        firstOracleBoard.setCell(1, 0, new Cell(2));
        firstOracleBoard.setCell(1, 1, new Cell(4));
        Board secondOracleBoard = new Board(size);
        secondOracleBoard.setCell(0, 0, new Cell(2));
        secondOracleBoard.setCell(0, 1, new Cell(2));
        secondOracleBoard.setCell(1, 0, new Cell(0));
        secondOracleBoard.setCell(1, 1, new Cell(4));

        // Act
        boardToTest.moveRight();
        Cell topRightBoardCell = boardToTest.getCell(0, 1);
        Cell bottomRightBoardCell = boardToTest.getCell(1, 1);
        // Board to test vs first oracle
        Cell topRightFirstOracleCell = firstOracleBoard.getCell(0, 1);
        Cell bottomRightFirstOracleCell = firstOracleBoard.getCell(1, 1);
        // Board to test vs second oracle
        Cell topRightSecondOracleCell = secondOracleBoard.getCell(0, 1);
        Cell bottomRightSecondOracleCell = secondOracleBoard.getCell(1, 1);
        boolean cellsAreEquals = bottomRightBoardCell.equals(topRightFirstOracleCell)
                && bottomRightBoardCell.equals(bottomRightFirstOracleCell);
        cellsAreEquals = cellsAreEquals || topRightBoardCell.equals(topRightSecondOracleCell)
                && bottomRightBoardCell.equals(bottomRightSecondOracleCell);

        // Assert
        assert cellsAreEquals;
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
        assert !boardHasMoved;
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
        assert !boardHasMoved;
    }

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
        assert boardVsB1;
    }

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
        assert !boardVsB2;
    }

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
        assert !boardVsB3;
    }
}
