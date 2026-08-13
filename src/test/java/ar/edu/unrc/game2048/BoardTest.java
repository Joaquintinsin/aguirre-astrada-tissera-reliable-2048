package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        Board board = new Board(6);
        // Assert
        assertEquals(board.getSize(), inputSize);
        
    }

}
