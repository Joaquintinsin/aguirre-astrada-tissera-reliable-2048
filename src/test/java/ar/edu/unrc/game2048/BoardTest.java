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
}
