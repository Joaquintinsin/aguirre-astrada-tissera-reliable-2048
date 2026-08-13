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
}
