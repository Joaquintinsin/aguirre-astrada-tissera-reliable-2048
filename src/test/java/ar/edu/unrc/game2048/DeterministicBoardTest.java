package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DeterministicBoardTest {
    // ==== Constructor tests ====
    @Test
    public void defaultConstructorTest() {
        // Arrange & Act
        Board board = new Board();
        // Assert
        assertEquals(board.getStrategy().getClass(), new NonDeterministicPlacement().getClass());
    }

    @Test
    public void sizeParameterizedConstructorTest() {
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
    public void deterministicStrategyConstructorTest() {
        // Arrange & Act
        int inputSize = 6;
        DeterministicPlacement strat = new DeterministicPlacement();
        Board board = new Board(inputSize, strat);
        // Assert
        assertEquals(board.getStrategy().getClass(), new DeterministicPlacement().getClass());
    }

    // ==== Movement tests ====
    @Test
    public void moveUpWithDeterministicPlacementTest() {
        // Arrange
        int size = 2;
        /*
            2 0
            2 2
        */
        Board board = new Board(size, new DeterministicPlacement());
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, Cell.EMPTY);
        board.setCell(1, 0, new Cell(2));
        board.setCell(1, 1, new Cell(2));

        // Act
        boolean moved = board.moveUp();

        // Assert
        assertTrue(moved);
        /*
            4 2     (0,0)(0,1)
                ==?
            2 0     (1,0)(1,1)
        */
        assertEquals(new Cell(4), board.getCell(0, 0));
        assertEquals(new Cell(2), board.getCell(0, 1));
        assertEquals(new Cell(2), board.getCell(1, 0));
        assertEquals(Cell.EMPTY, board.getCell(1, 1));
    }

    @Test
    public void moveUpWhenTopRowIsFullAndCanNotMergeWithDeterministicPlacementTest() {
        // Arrange
        int size = 2;
        Board board = new Board(size, new DeterministicPlacement());
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(4));
        board.setCell(1, 0, new Cell(0));
        board.setCell(1, 1, new Cell(0));
        Board previousBoard = new Board(board);

        // Act
        boolean moved = board.moveUp();

        // Assert
        assertFalse(moved);
        assertEquals(previousBoard, board);
    }

    @Test
    public void moveDownWithDeterministicPlacementTest() {
        // Arrange
        int size = 2;
        /*
            2 0
            2 2
        */
        Board board = new Board(size, new DeterministicPlacement());
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, Cell.EMPTY);
        board.setCell(1, 0, new Cell(2));
        board.setCell(1, 1, new Cell(2));

        // Act
        boolean moved = board.moveDown();

        // Assert
        assertTrue(moved);
        /*
            2 0     (0,0)(0,1)
                ==?
            4 2     (1,0)(1,1)
        */
        assertEquals(new Cell(2), board.getCell(0, 0));
        assertEquals(Cell.EMPTY, board.getCell(0, 1));
        assertEquals(new Cell(4), board.getCell(1, 0));
        assertEquals(new Cell(2), board.getCell(1, 1));
    }

    @Test
    public void moveDownWhenBottomRowIsFullAndCanNotMergeWithDeterministicPlacementTest() {
        // Arrange
        int size = 2;
        Board board = new Board(size, new DeterministicPlacement());
        board.setCell(0, 0, new Cell(0));
        board.setCell(0, 1, new Cell(0));
        board.setCell(1, 0, new Cell(2));
        board.setCell(1, 1, new Cell(4));
        Board previousBoard = new Board(board);

        // Act
        boolean moved = board.moveDown();

        // Assert
        assertFalse(moved);
        assertEquals(previousBoard, board);
    }

    @Test
    public void moveLeftWithDeterministicPlacementTest() {
        // Arrange
        int size = 2;
        /*
            2 0
            2 2
        */
        Board board = new Board(size, new DeterministicPlacement());
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, Cell.EMPTY);
        board.setCell(1, 0, new Cell(2));
        board.setCell(1, 1, new Cell(2));

        // Act
        boolean moved = board.moveLeft();

        // Assert
        assertTrue(moved);
        /*
            2 2     (0,0)(0,1)
                ==?
            4 0     (1,0)(1,1)
        */
        assertEquals(new Cell(2), board.getCell(0, 0));
        assertEquals(new Cell(2), board.getCell(0, 1));
        assertEquals(new Cell(4), board.getCell(1, 0));
        assertEquals(Cell.EMPTY, board.getCell(1, 1));
    }

    @Test
    public void moveLeftWhenLeftColumnIsFullAndCanNotMergeWithDeterministicPlacementTest() {
        // Arrange
        int size = 2;
        Board board = new Board(size, new DeterministicPlacement());
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(0));
        board.setCell(1, 0, new Cell(4));
        board.setCell(1, 1, new Cell(0));
        Board previousBoard = new Board(board);

        // Act
        boolean moved = board.moveLeft();

        // Assert
        assertFalse(moved);
        assertEquals(previousBoard, board);
    }

    @Test
    public void moveRightWithDeterministicPlacementTest() {
        // Arrange
        int size = 2;
        /*
            2 0
            2 2
        */
        Board board = new Board(size, new DeterministicPlacement());
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, Cell.EMPTY);
        board.setCell(1, 0, new Cell(2));
        board.setCell(1, 1, new Cell(2));

        // Act
        boolean moved = board.moveRight();

        // Assert
        assertTrue(moved);
        /*
            2 2     (0,0)(0,1)
                ==?
            0 4     (1,0)(1,1)
        */
        assertEquals(new Cell(2), board.getCell(0, 0));
        assertEquals(new Cell(2), board.getCell(0, 1));
        assertEquals(Cell.EMPTY, board.getCell(1, 0));
        assertEquals(new Cell(4), board.getCell(1, 1));
    }

    @Test
    public void moveRightWhenRightColumnIsFullAndCanNotMergeWithDeterministicPlacementTest() {
        // Arrange
        int size = 2;
        Board board = new Board(size, new DeterministicPlacement());
        board.setCell(0, 0, new Cell(0));
        board.setCell(0, 1, new Cell(2));
        board.setCell(1, 0, new Cell(0));
        board.setCell(1, 1, new Cell(4));
        Board previousBoard = new Board(board);

        // Act
        boolean moved = board.moveRight();

        // Assert
        assertFalse(moved);
        assertEquals(previousBoard, board);
    }
}
