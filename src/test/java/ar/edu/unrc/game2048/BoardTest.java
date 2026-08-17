package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BoardTest {
    @Test
    public void defaultConstructorTest() {
        // Arrange - Act
        Board board = new Board();
        // Assert
        assertNotNull(board);
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
    public void parameterConstructorNegativeNumberExeptionTest() {
        // Arrange 
        int inputSize = -1;
        // Act - Assert
        assertThrows(IllegalArgumentException.class, () -> {
          Board board = new Board(inputSize);
        });
        
    }

    @Test
    public void copyConstructorTest(){
        //Arrange
        int inputSize = 6;
        Board board = new Board(inputSize);
        //Act 
        Board copy = new Board(board);
        // Assert
        assertEquals(board, copy);
    }
    

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
    
}
