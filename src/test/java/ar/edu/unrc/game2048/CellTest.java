package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

    @Test
    void testGetValueEmpty() {
        //arrange
        Cell cell = new Cell(0);

        //act
        int value = cell.getValue();

        //assert
        assertEquals(value, 0);
    }

    @Test
    void testGetValueNonEmpty() {
        //arrange
        Cell cell = new Cell(8);

        //act
        int value = cell.getValue();

        //assert
        assertEquals(value, 8);
    }

    @Test
    void testCanMergeWithTrue() {
        //arrange
        Cell cell1 = new Cell(4);
        Cell cell2 = new Cell(4);

        //act
        boolean result = cell1.canMergeWith(cell2);

        //assert
        assertTrue(result);
    }

    @Test
    void testCanMergeWithFalse() {
        //arrange
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(4);

        //act
        boolean result = cell1.canMergeWith(cell2);

        //assert
        assertFalse(result);
    }

    @Test
    void testCanMergeWithEmptyCells() {
        //arrange
        Cell cell1 = new Cell(0);
        Cell cell2 = new Cell(0);

        //act
        boolean result = cell1.canMergeWith(cell2);

        //assert
        assertFalse(result);
    }

    @Test
    void testMergeSussessful() {
        //arrange
        Cell cell1 = new Cell(4);
        Cell cell2 = new Cell(4);

        //act
        Cell mergedCell = cell1.mergeWith(cell2);

        //assert
        assertEquals(mergedCell.getValue(), 8);
    }

    @Test 
    void testMergeFailWithException() {
        //arrange
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(4);

        //act - assert
        assertThrows(IllegalArgumentException.class, () -> cell1.mergeWith(cell2));
    }




    
}