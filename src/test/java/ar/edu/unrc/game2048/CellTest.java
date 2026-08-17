package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CellTest {
    
    @Test
    void testCellCreation() {
        //arrange-act
        Cell cell = new Cell(2);
    
        //assert
        assertEquals(cell.getValue(), 2);
    }

    @Test
    void testIsEmptyTrue() {
        //arrange
        Cell cell = new Cell(0);

        //act
        boolean result = cell.isEmpty();

        //assert
        assertTrue(result);
    }

    @Test
    void testIsEmptyFalse() {
        //arrange
        Cell cell = new Cell(4);

        //act
        boolean result = cell.isEmpty();

        //assert
        assertFalse(result);
    }

    
}