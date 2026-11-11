package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Regression tests for the bugs found by the grammar-based fuzzer
 * (Assignment 5, Ejercicio 1.a).
 */
public class FuzzingRegressionTest {

    private static final int MAX = Cell.MAX_VALUE;        // 2^30
    private static final int HALF = Cell.MAX_VALUE / 2;   // 2^29

    // ============ Bug 1: overflow when merging 2^30 + 2^30 ============

    @Test
    public void maxValueCellsCannotMerge() {
        Cell max = new Cell(MAX);
        assertFalse(max.canMergeWith(new Cell(MAX)));
        assertThrows(IllegalArgumentException.class, () -> max.mergeWith(new Cell(MAX)));
    }

    /** Before the fix: IllegalArgumentException "Cell value cannot be negative". */
    @Test
    public void movingTwoMaxValueTilesDoesNotCrash() {
        Board b = Board.fromString("[" + MAX + ",0," + MAX + ",0,0,0,0,0,0]",
                new DeterministicPlacement());
        boolean moved = assertDoesNotThrow(() -> b.moveLeft());
        assertTrue(moved);
        // they slide together but do not merge; the new 2 goes to (0,2)
        assertEquals("[" + MAX + "," + MAX + ",2,0,0,0,0,0,0]", b.toArrayString());
        assertEquals(0, b.getScore());
        assertTrue(b.repOk());
    }

    /** Before the fix: not losing, because canMergeWith said 2^30 could merge. */
    @Test
    public void fullBoardWithOnlyMaxValuePairsIsLosing() {
        Board b = Board.fromString("[" + MAX + "," + MAX + ",2,4]");
        assertTrue(b.isLosingBoard());
    }

    // ============ Bug 2: score overflow ============

    /** Before the fix: score = -2147483648 and repOk() == false. */
    @Test
    public void scoreSaturatesInsteadOfOverflowing() {
        String row = HALF + "," + HALF + "," + HALF + "," + HALF;
        Board b = Board.fromString("[" + row + ",0,0,0,0,0,0,0,0,0,0,0,0]",
                new DeterministicPlacement());
        b.moveLeft();  // two merges of 2^29, each one adds 2^30 to the score
        assertEquals(Integer.MAX_VALUE, b.getScore());
        assertTrue(b.repOk());
    }


    @Test
    public void hugeBoardStringIsRejectedWithoutStackOverflow() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 300 * 300; i++) {
            if (i > 0) sb.append(',');
            sb.append('0');
        }
        sb.append(']');
        assertThrows(IllegalArgumentException.class, () -> Board.fromString(sb.toString()));
    }

    @Test
    public void tabsAreRejected() {
        assertThrows(IllegalArgumentException.class, () -> Board.fromString("\t[0]\t"));
        assertThrows(IllegalArgumentException.class, () -> Board.fromString("[0,0,0,\t0]"));
    }

    @Test
    public void malformedStringsAreRejectedCleanly() {
        String[] bad = { "", "[]", "[,]", "[0,0,0,0,]", "[0,,0,0]", "[[0]]", "[02]", "[+2]",
                "[-2]", "[3]", "[2147483648]", "[\u0662]", "[0]\n", "[0,0,0]" };
        for (String s : bad) {
            assertThrows(IllegalArgumentException.class, () -> Board.fromString(s), s);
        }
        assertThrows(IllegalArgumentException.class, () -> Board.fromString(null));
    }
}
