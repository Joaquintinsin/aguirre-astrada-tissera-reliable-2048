package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CellTest {
    
    @Test
    void testCellCreation() {
        //arrange-act
        Cell cell = new Cell(2);
    
        //assert
        assertEquals(cell.getValue(), 2);
    }

    
}