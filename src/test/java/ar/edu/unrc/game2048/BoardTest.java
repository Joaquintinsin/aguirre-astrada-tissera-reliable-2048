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

    
    
}
