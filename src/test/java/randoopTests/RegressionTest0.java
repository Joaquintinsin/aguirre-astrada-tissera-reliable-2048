package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) 'a');
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell3 = cell1.mergeWith(cell2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 97 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(0);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(100, (int) (short) 1, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, placementStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = cell1.mergeWith(cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board1.getCell(2048, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 32) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.isWinningBoard();
        java.lang.Class<?> wildcardClass4 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveLeft();
        boolean boolean3 = board1.isWinningBoard();
        java.lang.Class<?> wildcardClass4 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        board1.setCell(10, 0, cell10);
        boolean boolean15 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.hasEmptyCells();
        boolean boolean6 = board2.isLosingBoard();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board1.getCell(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        boolean boolean3 = board2.isLosingBoard();
        boolean boolean4 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean8 = board7.moveLeft();
        boolean boolean9 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell12 = board7.getCell(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(4, (int) (short) -1, cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = board16.getCell((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.isLosingBoard();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = board2.getStrategy();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 10, (int) '#', cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 35) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(placementStrategy4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) 'a');
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement3 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement3);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell9.canMergeWith(cell10);
        board6.setCell((int) (short) 0, 0, cell9);
        boolean boolean13 = board6.moveRight();
        boolean boolean15 = board6.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell18 = board6.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean20 = nonDeterministicPlacement3.addTile(board19);
        boolean boolean21 = cell1.equals((java.lang.Object) nonDeterministicPlacement3);
        java.lang.String str22 = cell1.toString();
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "97" + "'", str22, "97");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board17.getStrategy();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(placementStrategy19);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        java.lang.Class<?> wildcardClass18 = nonDeterministicPlacement0.getClass();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean2 = board1.moveLeft();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(97, 4, cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 4) is out of bounds for board size 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        board1.setCell(10, 0, cell10);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.canMergeWith(cell18);
        boolean boolean20 = cell17.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(10, (int) (byte) -1, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        boolean boolean14 = board1.moveDown();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell14 = board9.getCell(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 10, (int) '4', cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 52) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        java.lang.String str10 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell12.isEmpty();
        boolean boolean15 = cell4.canMergeWith(cell12);
        java.lang.Class<?> wildcardClass16 = cell12.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        int int2 = board1.getScore();
        boolean boolean3 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '#');
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str4 = cell3.toString();
        boolean boolean5 = cell3.isEmpty();
        boolean boolean6 = cell1.canMergeWith(cell3);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = cell1.mergeWith(cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 35 and 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        java.lang.Object obj2 = null;
        boolean boolean3 = board1.equals(obj2);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean8 = cell6.canMergeWith(cell7);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(2048, 0, cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 0) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        boolean boolean10 = cell4.isEmpty();
        boolean boolean11 = cell4.isEmpty();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        boolean boolean8 = position2.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 0)" + "'", str5, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement19 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement19);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.canMergeWith(cell26);
        board22.setCell((int) (short) 0, 0, cell25);
        boolean boolean29 = board22.moveRight();
        boolean boolean31 = board22.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell34 = board22.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean36 = nonDeterministicPlacement19.addTile(board35);
        boolean boolean37 = nonDeterministicPlacement0.addTile(board35);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement39 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        boolean boolean41 = deterministicPlacement39.addTile(board40);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement39);
        boolean boolean43 = nonDeterministicPlacement0.addTile(board42);
        int int44 = board42.getSize();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.moveDown();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        java.lang.Class<?> wildcardClass5 = board4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board1.getStrategy();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(placementStrategy9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        boolean boolean10 = cell4.isEmpty();
        int int11 = cell4.getValue();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean14 = board13.isFull();
        boolean boolean15 = board13.isWinningBoard();
        boolean boolean16 = cell4.equals((java.lang.Object) boolean15);
        java.lang.Class<?> wildcardClass17 = cell4.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '#');
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str4 = cell3.toString();
        boolean boolean5 = cell3.isEmpty();
        boolean boolean6 = cell1.canMergeWith(cell3);
        int int7 = cell3.getValue();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str10 = cell9.toString();
        boolean boolean11 = cell3.canMergeWith(cell9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean18 = cell16.canMergeWith(cell17);
        board13.setCell((int) (short) 0, 0, cell16);
        boolean boolean20 = board13.moveRight();
        boolean boolean22 = board13.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell25 = board13.getCell((int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell26 = cell9.mergeWith(cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (byte) 0, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 2048) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveLeft();
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        boolean boolean15 = cell10.equals((java.lang.Object) (-1L));
        boolean boolean16 = cell10.isEmpty();
        int int17 = cell10.getValue();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean20 = board19.isFull();
        boolean boolean21 = board19.isWinningBoard();
        boolean boolean22 = cell10.equals((java.lang.Object) boolean21);
        boolean boolean24 = cell10.equals((java.lang.Object) "");
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean31 = cell29.canMergeWith(cell30);
        board26.setCell((int) (short) 0, 0, cell29);
        boolean boolean34 = cell29.equals((java.lang.Object) (-1L));
        java.lang.String str35 = cell29.toString();
        ar.edu.unrc.game2048.Cell cell37 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str38 = cell37.toString();
        boolean boolean39 = cell37.isEmpty();
        boolean boolean40 = cell29.canMergeWith(cell37);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean47 = cell45.canMergeWith(cell46);
        board42.setCell((int) (short) 0, 0, cell45);
        boolean boolean50 = cell45.equals((java.lang.Object) (-1L));
        boolean boolean51 = cell29.canMergeWith(cell45);
        java.lang.String str52 = cell29.toString();
        boolean boolean53 = cell10.canMergeWith(cell29);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(2048, (int) (byte) -1, cell29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, -1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        boolean boolean9 = board5.moveDown();
        boolean boolean10 = board5.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        boolean boolean14 = board1.moveRight();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 10.0d);
        int int8 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean15 = board1.moveUp();
        boolean boolean16 = board1.isWinningBoard();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy17 = board1.getStrategy();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(placementStrategy17);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 10.0d);
        java.lang.String str8 = position2.toString();
        int int9 = position2.col;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean16 = cell14.canMergeWith(cell15);
        board11.setCell((int) (short) 0, 0, cell14);
        boolean boolean18 = board11.moveRight();
        boolean boolean20 = board11.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell23 = board11.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Cell cell27 = board24.getCell(0, (int) (byte) 0);
        boolean boolean28 = position2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, 0)" + "'", str8, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean15 = board14.moveDown();
        int int16 = board14.getSize();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '#');
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str4 = cell3.toString();
        boolean boolean5 = cell3.isEmpty();
        boolean boolean6 = cell1.canMergeWith(cell3);
        int int7 = cell3.getValue();
        java.lang.String str8 = cell3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        boolean boolean11 = board1.isFull();
        boolean boolean12 = board1.moveRight();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.moveDown();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        java.lang.String str5 = board4.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.String str4 = board3.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "1) test049(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|    2|     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        java.lang.Object obj2 = null;
        boolean boolean3 = board1.equals(obj2);
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell((int) '#');
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str10 = cell9.toString();
        boolean boolean11 = cell9.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell9);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(10, 100, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean8 = cell6.canMergeWith(cell7);
        board3.setCell((int) (short) 0, 0, cell6);
        boolean boolean10 = board3.moveRight();
        boolean boolean12 = board3.equals((java.lang.Object) (-1L));
        boolean boolean13 = board3.isFull();
        boolean boolean14 = nonDeterministicPlacement1.addTile(board3);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = null;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(1, placementStrategy16);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement20 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement20);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean28 = cell26.canMergeWith(cell27);
        board23.setCell((int) (short) 0, 0, cell26);
        boolean boolean30 = board23.moveRight();
        boolean boolean32 = board23.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell35 = board23.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean37 = nonDeterministicPlacement20.addTile(board36);
        boolean boolean38 = nonDeterministicPlacement1.addTile(board36);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board((-1), (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '#');
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str4 = cell3.toString();
        boolean boolean5 = cell3.isEmpty();
        boolean boolean6 = cell1.canMergeWith(cell3);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean13 = cell11.canMergeWith(cell12);
        board8.setCell((int) (short) 0, 0, cell11);
        boolean boolean16 = cell11.equals((java.lang.Object) (-1L));
        java.lang.String str17 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str20 = cell19.toString();
        boolean boolean21 = cell19.isEmpty();
        boolean boolean22 = cell11.canMergeWith(cell19);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean29 = cell27.canMergeWith(cell28);
        board24.setCell((int) (short) 0, 0, cell27);
        boolean boolean32 = cell27.equals((java.lang.Object) (-1L));
        boolean boolean33 = cell11.canMergeWith(cell27);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell34 = cell1.mergeWith(cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 35 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy2 = board0.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(placementStrategy2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveLeft();
        boolean boolean12 = board1.moveRight();
        java.lang.Class<?> wildcardClass13 = board1.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveLeft();
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell6 = board1.getCell(0, (int) (short) 0);
        boolean boolean7 = board1.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board1.getCell((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean5 = cell3.canMergeWith(cell4);
        boolean boolean6 = board2.equals((java.lang.Object) boolean5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 0)" + "'", str5, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 0)" + "'", str7, "(100, 0)");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveUp();
        boolean boolean2 = board0.moveDown();
        int int3 = board0.getScore();
        int int4 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "1) test058(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
// flaky "1) test058(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        int int4 = cell3.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = null;
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(1, placementStrategy6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board7.getStrategy();
        boolean boolean9 = board7.moveRight();
        boolean boolean10 = cell3.equals((java.lang.Object) board7);
        boolean boolean11 = board7.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean13 = board1.equals((java.lang.Object) board7);
        boolean boolean14 = board7.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell14 = board2.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet17 = board2.getEmptyPositions();
        boolean boolean18 = nonDeterministicPlacement0.addTile(board2);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet19 = board2.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(positionSet19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(10, 52);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveUp();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell9.canMergeWith(cell10);
        board6.setCell((int) (short) 0, 0, cell9);
        boolean boolean14 = cell9.equals((java.lang.Object) (-1L));
        java.lang.String str15 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str18 = cell17.toString();
        boolean boolean19 = cell17.isEmpty();
        boolean boolean20 = cell9.canMergeWith(cell17);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.canMergeWith(cell26);
        board22.setCell((int) (short) 0, 0, cell25);
        boolean boolean30 = cell25.equals((java.lang.Object) (-1L));
        boolean boolean31 = cell9.canMergeWith(cell25);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((-1), (int) (short) 0, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        boolean boolean3 = deterministicPlacement1.addTile(board2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean5 = board4.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = board2.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (byte) 0, placementStrategy5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(placementStrategy5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.isFull();
        boolean boolean6 = board2.isLosingBoard();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        boolean boolean3 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        board2.setCell((int) (short) 0, 0, cell10);
        boolean boolean15 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        board1.setCell(10, 0, cell10);
        int int15 = board1.getSize();
        boolean boolean16 = board1.isWinningBoard();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy17 = board1.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(placementStrategy17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveLeft();
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell6 = board1.getCell(0, (int) (short) 0);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.canMergeWith(cell14);
        board10.setCell((int) (short) 0, 0, cell13);
        boolean boolean18 = cell13.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(100, 2048, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 2048) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = board16.getCell(100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean20 = board19.isFull();
        boolean boolean21 = board19.isWinningBoard();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.canMergeWith(cell29);
        board25.setCell((int) (short) 0, 0, cell28);
        board19.setCell(10, 0, cell28);
        boolean boolean33 = nonDeterministicPlacement0.addTile(board19);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy36 = board35.getStrategy();
        boolean boolean37 = board19.equals((java.lang.Object) placementStrategy36);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(placementStrategy36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean14 = cell12.canMergeWith(cell13);
        board9.setCell((int) (short) 0, 0, cell12);
        boolean boolean17 = cell12.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(0);
        int int20 = cell19.getValue();
        boolean boolean21 = cell12.canMergeWith(cell19);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(0, (int) (short) 10, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 10) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell8.canMergeWith(cell9);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(1, (int) (short) 10, cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 10) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        boolean boolean10 = cell4.isEmpty();
        int int11 = cell4.getValue();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean14 = board13.isFull();
        boolean boolean15 = board13.isWinningBoard();
        boolean boolean16 = cell4.equals((java.lang.Object) boolean15);
        boolean boolean18 = cell4.equals((java.lang.Object) "");
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean28 = cell23.equals((java.lang.Object) (-1L));
        java.lang.String str29 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell31 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str32 = cell31.toString();
        boolean boolean33 = cell31.isEmpty();
        boolean boolean34 = cell23.canMergeWith(cell31);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean41 = cell39.canMergeWith(cell40);
        board36.setCell((int) (short) 0, 0, cell39);
        boolean boolean44 = cell39.equals((java.lang.Object) (-1L));
        boolean boolean45 = cell23.canMergeWith(cell39);
        java.lang.String str46 = cell23.toString();
        boolean boolean47 = cell4.canMergeWith(cell23);
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean54 = cell52.canMergeWith(cell53);
        board49.setCell((int) (short) 0, 0, cell52);
        java.lang.String str56 = cell52.toString();
        boolean boolean57 = cell23.canMergeWith(cell52);
        java.lang.String str58 = cell23.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "." + "'", str56, ".");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "." + "'", str58, ".");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveLeft();
        boolean boolean3 = board1.isFull();
        int int4 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean27 = board20.moveRight();
        boolean boolean29 = board20.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell32 = board20.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean34 = board20.moveUp();
        boolean boolean35 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveLeft();
        boolean boolean39 = board37.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell42 = board37.getCell(0, (int) (short) 0);
        boolean boolean43 = board37.moveUp();
        boolean boolean44 = board37.moveUp();
        boolean boolean45 = nonDeterministicPlacement1.addTile(board37);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean50 = cell48.canMergeWith(cell49);
        board37.setCell(0, (int) (short) 1, cell49);
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean53 = board52.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(0, (int) (byte) -1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.moveDown();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean5 = board4.moveDown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 100);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean8 = cell6.canMergeWith(cell7);
        board3.setCell((int) (short) 0, 0, cell6);
        boolean boolean10 = board3.moveRight();
        boolean boolean12 = board3.equals((java.lang.Object) (-1L));
        boolean boolean13 = board3.isFull();
        boolean boolean14 = nonDeterministicPlacement1.addTile(board3);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = null;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(1, placementStrategy16);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean21 = board20.isFull();
        boolean boolean22 = board20.isWinningBoard();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean31 = cell29.canMergeWith(cell30);
        board26.setCell((int) (short) 0, 0, cell29);
        board20.setCell(10, 0, cell29);
        boolean boolean34 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        int int2 = board1.getScore();
        boolean boolean3 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell8.canMergeWith(cell9);
        board5.setCell((int) (short) 0, 0, cell8);
        boolean boolean13 = cell8.equals((java.lang.Object) (-1L));
        boolean boolean14 = cell8.isEmpty();
        boolean boolean15 = board1.equals((java.lang.Object) cell8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(4, (int) (byte) 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean15 = board14.isLosingBoard();
        boolean boolean16 = board14.moveLeft();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell14 = board2.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet17 = board2.getEmptyPositions();
        boolean boolean18 = nonDeterministicPlacement0.addTile(board2);
        boolean boolean19 = board2.moveDown();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.isFull();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement19 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement19);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.canMergeWith(cell26);
        board22.setCell((int) (short) 0, 0, cell25);
        boolean boolean29 = board22.moveRight();
        boolean boolean31 = board22.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell34 = board22.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean36 = nonDeterministicPlacement19.addTile(board35);
        boolean boolean37 = nonDeterministicPlacement0.addTile(board35);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement39 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        boolean boolean41 = deterministicPlacement39.addTile(board40);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement39);
        boolean boolean43 = nonDeterministicPlacement0.addTile(board42);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean46 = board45.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy48 = null;
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(1, placementStrategy48);
        boolean boolean50 = board49.moveDown();
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(board49);
        boolean boolean52 = board45.equals((java.lang.Object) board49);
        int int53 = board49.getSize();
        boolean boolean54 = nonDeterministicPlacement0.addTile(board49);
        boolean boolean55 = board49.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean4 = board3.moveLeft();
        boolean boolean5 = board3.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 100, placementStrategy6);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(52, placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(placementStrategy6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        board1.setCell(10, 0, cell10);
        int int15 = board1.getSize();
        boolean boolean16 = board1.isWinningBoard();
        boolean boolean17 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        int int4 = board3.getScore();
        boolean boolean5 = board3.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        boolean boolean5 = deterministicPlacement3.addTile(board4);
        boolean boolean6 = deterministicPlacement0.addTile(board4);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy12 = board9.getStrategy();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (short) 100, placementStrategy12);
        boolean boolean14 = board4.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(placementStrategy12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str2 = cell1.toString();
        boolean boolean3 = cell1.isEmpty();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell8.canMergeWith(cell9);
        board5.setCell((int) (short) 0, 0, cell8);
        boolean boolean13 = cell8.equals((java.lang.Object) (-1L));
        java.lang.String str14 = cell8.toString();
        boolean boolean15 = cell8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = cell1.mergeWith(cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        boolean boolean9 = cell1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        int int6 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveDown();
        int int12 = board1.getScore();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean2 = board1.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        boolean boolean6 = board5.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean8 = board1.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean2 = board1.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        boolean boolean6 = board5.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean8 = board1.equals((java.lang.Object) board5);
        int int9 = board1.getSize();
        int int10 = board1.getSize();
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) (byte) 0);
        int int14 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement15 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement15);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean23 = cell21.canMergeWith(cell22);
        board18.setCell((int) (short) 0, 0, cell21);
        boolean boolean25 = board18.moveRight();
        boolean boolean27 = board18.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell30 = board18.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean32 = nonDeterministicPlacement15.addTile(board31);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean39 = cell37.canMergeWith(cell38);
        board34.setCell((int) (short) 0, 0, cell37);
        boolean boolean41 = board34.moveRight();
        boolean boolean43 = board34.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell46 = board34.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(board34);
        boolean boolean48 = board34.moveUp();
        boolean boolean49 = nonDeterministicPlacement15.addTile(board34);
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean52 = board51.moveLeft();
        boolean boolean53 = board51.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell56 = board51.getCell(0, (int) (short) 0);
        boolean boolean57 = board51.moveUp();
        boolean boolean58 = board51.moveUp();
        boolean boolean59 = nonDeterministicPlacement15.addTile(board51);
        ar.edu.unrc.game2048.Cell cell62 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell63 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean64 = cell62.canMergeWith(cell63);
        board51.setCell(0, (int) (short) 1, cell63);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell66 = cell13.mergeWith(cell63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(cell62);
        org.junit.Assert.assertNotNull(cell63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = null;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(1, placementStrategy5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board6.getStrategy();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy7);
        boolean boolean9 = cell1.equals((java.lang.Object) placementStrategy7);
        boolean boolean10 = cell1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell((int) '#');
        int int8 = cell7.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) -1, 0, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean5 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean26 = cell24.canMergeWith(cell25);
        board21.setCell((int) (short) 0, 0, cell24);
        boolean boolean29 = cell24.equals((java.lang.Object) (-1L));
        java.lang.String str30 = cell24.toString();
        boolean boolean31 = cell24.isEmpty();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean38 = cell36.canMergeWith(cell37);
        board33.setCell((int) (short) 0, 0, cell36);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement40 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board();
        boolean boolean42 = deterministicPlacement40.addTile(board41);
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell47 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean49 = cell47.canMergeWith(cell48);
        board44.setCell((int) (short) 0, 0, cell47);
        boolean boolean51 = board44.moveRight();
        boolean boolean52 = deterministicPlacement40.addTile(board44);
        boolean boolean53 = cell36.equals((java.lang.Object) board44);
        boolean boolean54 = cell24.canMergeWith(cell36);
        // The following exception was thrown during execution in test generation
        try {
            board14.setCell((int) 'a', 100, cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 100) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(97);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement19 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement19);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.canMergeWith(cell26);
        board22.setCell((int) (short) 0, 0, cell25);
        boolean boolean29 = board22.moveRight();
        boolean boolean31 = board22.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell34 = board22.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean36 = nonDeterministicPlacement19.addTile(board35);
        boolean boolean37 = nonDeterministicPlacement0.addTile(board35);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement39 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        boolean boolean41 = deterministicPlacement39.addTile(board40);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement39);
        boolean boolean43 = nonDeterministicPlacement0.addTile(board42);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean46 = board45.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy48 = null;
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(1, placementStrategy48);
        boolean boolean50 = board49.moveDown();
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(board49);
        boolean boolean52 = board45.equals((java.lang.Object) board49);
        int int53 = board49.getSize();
        boolean boolean54 = nonDeterministicPlacement0.addTile(board49);
        int int55 = board49.getScore();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = null;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(1, placementStrategy7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board8.getStrategy();
        boolean boolean10 = board8.moveRight();
        boolean boolean11 = board8.hasEmptyCells();
        boolean boolean12 = position2.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell16 = null;
        // The following exception was thrown during execution in test generation
        try {
            board8.setCell((int) (short) -1, (int) (short) 0, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(0);
        int int3 = cell2.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = null;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(1, placementStrategy5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board6.getStrategy();
        boolean boolean8 = board6.moveRight();
        boolean boolean9 = cell2.equals((java.lang.Object) board6);
        boolean boolean10 = board6.moveDown();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean12 = deterministicPlacement0.addTile(board6);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        boolean boolean14 = board13.isFull();
        boolean boolean15 = deterministicPlacement0.addTile(board13);
        java.lang.String str16 = board13.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "2) test106(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        boolean boolean3 = board1.moveDown();
        boolean boolean4 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 10.0d);
        java.lang.String str8 = position2.toString();
        int int9 = position2.col;
        int int10 = position2.col;
        int int11 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, 0)" + "'", str8, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveRight();
        java.lang.Class<?> wildcardClass10 = board1.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(4, (int) (short) 10);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.isLosingBoard();
        java.lang.String str4 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "1) test111(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str4, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        int int15 = board1.getScore();
        boolean boolean16 = board1.moveUp();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(0);
        int int12 = cell11.getValue();
        boolean boolean13 = cell4.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean20 = cell18.canMergeWith(cell19);
        board15.setCell((int) (short) 0, 0, cell18);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell22 = cell4.mergeWith(cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        int int18 = board4.getScore();
        boolean boolean19 = cell1.equals((java.lang.Object) int18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        int int7 = position2.row;
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement8 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.canMergeWith(cell14);
        board10.setCell((int) (short) 0, 0, cell13);
        boolean boolean17 = board10.moveRight();
        boolean boolean19 = board10.equals((java.lang.Object) (-1L));
        boolean boolean20 = board10.isFull();
        boolean boolean21 = nonDeterministicPlacement8.addTile(board10);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy23 = null;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(1, placementStrategy23);
        boolean boolean25 = nonDeterministicPlacement8.addTile(board24);
        boolean boolean26 = board24.isLosingBoard();
        boolean boolean27 = board24.moveUp();
        boolean boolean28 = board24.moveLeft();
        boolean boolean29 = position2.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 0)" + "'", str6, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        java.lang.String str10 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell12.isEmpty();
        boolean boolean15 = cell4.canMergeWith(cell12);
        int int16 = cell12.getValue();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.moveDown();
        int int4 = board2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean7 = board2.isLosingBoard();
        boolean boolean8 = board2.moveLeft();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell9.canMergeWith(cell10);
        board6.setCell((int) (short) 0, 0, cell9);
        boolean boolean14 = cell9.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(0);
        int int17 = cell16.getValue();
        boolean boolean18 = cell9.canMergeWith(cell16);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (short) 100, 100, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean3 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean8 = cell6.canMergeWith(cell7);
        boolean boolean9 = cell6.isEmpty();
        java.lang.String str10 = cell6.toString();
        board1.setCell((int) ' ', 35, cell6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        board1.setCell(10, 0, cell10);
        int int15 = board1.getSize();
        boolean boolean16 = board1.isWinningBoard();
        boolean boolean17 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet18 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(positionSet18);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = null;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(1, placementStrategy7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board8.getStrategy();
        boolean boolean10 = board8.moveRight();
        boolean boolean11 = board8.hasEmptyCells();
        boolean boolean12 = position2.equals((java.lang.Object) board8);
        boolean boolean13 = board8.moveRight();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(0);
        int int12 = cell11.getValue();
        boolean boolean13 = cell4.canMergeWith(cell11);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement14 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.canMergeWith(cell20);
        board16.setCell((int) (short) 0, 0, cell19);
        boolean boolean23 = board16.moveRight();
        boolean boolean25 = board16.equals((java.lang.Object) (-1L));
        boolean boolean26 = board16.isFull();
        boolean boolean27 = nonDeterministicPlacement14.addTile(board16);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy29 = null;
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(1, placementStrategy29);
        boolean boolean31 = nonDeterministicPlacement14.addTile(board30);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement33 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement33);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean41 = cell39.canMergeWith(cell40);
        board36.setCell((int) (short) 0, 0, cell39);
        boolean boolean43 = board36.moveRight();
        boolean boolean45 = board36.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell48 = board36.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean50 = nonDeterministicPlacement33.addTile(board49);
        boolean boolean51 = nonDeterministicPlacement14.addTile(board49);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement53 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board();
        boolean boolean55 = deterministicPlacement53.addTile(board54);
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement53);
        boolean boolean57 = nonDeterministicPlacement14.addTile(board56);
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean60 = board59.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy62 = null;
        ar.edu.unrc.game2048.Board board63 = new ar.edu.unrc.game2048.Board(1, placementStrategy62);
        boolean boolean64 = board63.moveDown();
        ar.edu.unrc.game2048.Board board65 = new ar.edu.unrc.game2048.Board(board63);
        boolean boolean66 = board59.equals((java.lang.Object) board63);
        int int67 = board63.getSize();
        boolean boolean68 = nonDeterministicPlacement14.addTile(board63);
        boolean boolean69 = cell4.equals((java.lang.Object) board63);
        int int70 = board63.getScore();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        board1.setCell(10, 0, cell10);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean17 = board16.isFull();
        boolean boolean18 = board16.isWinningBoard();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.canMergeWith(cell26);
        board22.setCell((int) (short) 0, 0, cell25);
        board16.setCell(10, 0, cell25);
        boolean boolean30 = cell25.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell31 = cell10.mergeWith(cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean8 = cell6.canMergeWith(cell7);
        board3.setCell((int) (short) 0, 0, cell6);
        boolean boolean10 = board3.moveRight();
        boolean boolean12 = board3.equals((java.lang.Object) (-1L));
        boolean boolean13 = board3.isFull();
        boolean boolean14 = nonDeterministicPlacement1.addTile(board3);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = null;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(1, placementStrategy16);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean21 = board20.isFull();
        boolean boolean22 = board20.isWinningBoard();
        boolean boolean23 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement25 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean32 = cell30.canMergeWith(cell31);
        board27.setCell((int) (short) 0, 0, cell30);
        boolean boolean34 = board27.moveRight();
        boolean boolean36 = board27.equals((java.lang.Object) (-1L));
        boolean boolean37 = board27.isFull();
        boolean boolean38 = nonDeterministicPlacement25.addTile(board27);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy40 = null;
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(1, placementStrategy40);
        boolean boolean42 = nonDeterministicPlacement25.addTile(board41);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement44 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement44);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell51 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean52 = cell50.canMergeWith(cell51);
        board47.setCell((int) (short) 0, 0, cell50);
        boolean boolean54 = board47.moveRight();
        boolean boolean56 = board47.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell59 = board47.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(board47);
        boolean boolean61 = nonDeterministicPlacement44.addTile(board60);
        boolean boolean62 = nonDeterministicPlacement25.addTile(board60);
        boolean boolean63 = nonDeterministicPlacement1.addTile(board60);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell66 = board60.getCell((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 10) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cell59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        boolean boolean11 = board1.isFull();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean7 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean14 = cell12.canMergeWith(cell13);
        board9.setCell((int) (short) 0, 0, cell12);
        boolean boolean16 = board2.equals((java.lang.Object) board9);
        boolean boolean17 = board9.hasEmptyCells();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(10, 2048);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell((int) 'a');
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement13 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement13);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.canMergeWith(cell20);
        board16.setCell((int) (short) 0, 0, cell19);
        boolean boolean23 = board16.moveRight();
        boolean boolean25 = board16.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell28 = board16.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean30 = nonDeterministicPlacement13.addTile(board29);
        boolean boolean31 = cell11.equals((java.lang.Object) nonDeterministicPlacement13);
        boolean boolean32 = cell4.canMergeWith(cell11);
        boolean boolean33 = cell4.isEmpty();
        java.lang.String str34 = cell4.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean2 = board1.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        boolean boolean6 = board5.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean8 = board1.equals((java.lang.Object) board5);
        int int9 = board5.getSize();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board5.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        java.lang.Object obj2 = null;
        boolean boolean3 = board1.equals(obj2);
        boolean boolean4 = board1.hasEmptyCells();
        boolean boolean5 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        java.lang.String str10 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell12.isEmpty();
        boolean boolean15 = cell4.canMergeWith(cell12);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = cell20.canMergeWith(cell21);
        board17.setCell((int) (short) 0, 0, cell20);
        boolean boolean25 = cell20.equals((java.lang.Object) (-1L));
        boolean boolean26 = cell4.canMergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell((int) '#');
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str31 = cell30.toString();
        boolean boolean32 = cell30.isEmpty();
        boolean boolean33 = cell28.canMergeWith(cell30);
        int int34 = cell30.getValue();
        boolean boolean35 = cell20.canMergeWith(cell30);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean42 = cell40.canMergeWith(cell41);
        board37.setCell((int) (short) 0, 0, cell40);
        boolean boolean45 = cell40.equals((java.lang.Object) (-1L));
        boolean boolean46 = cell40.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell47 = cell30.mergeWith(cell40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean27 = board20.moveRight();
        boolean boolean29 = board20.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell32 = board20.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean34 = board20.moveUp();
        boolean boolean35 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveLeft();
        boolean boolean39 = board37.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell42 = board37.getCell(0, (int) (short) 0);
        boolean boolean43 = board37.moveUp();
        boolean boolean44 = board37.moveUp();
        boolean boolean45 = nonDeterministicPlacement1.addTile(board37);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean50 = cell48.canMergeWith(cell49);
        board37.setCell(0, (int) (short) 1, cell49);
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board37);
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board();
        boolean boolean54 = board53.isFull();
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(board53);
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(board55);
        boolean boolean57 = board37.equals((java.lang.Object) board55);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        boolean boolean5 = deterministicPlacement3.addTile(board4);
        boolean boolean6 = deterministicPlacement0.addTile(board4);
        boolean boolean7 = board4.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean20 = board19.isFull();
        boolean boolean21 = board19.isWinningBoard();
        boolean boolean22 = nonDeterministicPlacement0.addTile(board19);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet23 = board19.getEmptyPositions();
        boolean boolean24 = board19.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board1.equals((java.lang.Object) (byte) 0);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = board1.getStrategy();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        boolean boolean14 = board1.equals((java.lang.Object) cell10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(placementStrategy5);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.row;
        int int6 = position2.row;
        int int7 = position2.col;
        java.lang.Class<?> wildcardClass8 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        int int7 = position2.row;
        int int8 = position2.row;
        java.lang.String str9 = position2.toString();
        java.lang.String str10 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 0)" + "'", str6, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, 0)" + "'", str9, "(100, 0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(100, 0)" + "'", str10, "(100, 0)");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        boolean boolean3 = deterministicPlacement1.addTile(board2);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(0, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean7 = board6.moveUp();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean20 = board19.isFull();
        boolean boolean21 = board19.isWinningBoard();
        boolean boolean22 = nonDeterministicPlacement0.addTile(board19);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet23 = board19.getEmptyPositions();
        boolean boolean24 = board19.moveDown();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell(0, (int) (byte) 0);
        boolean boolean18 = board14.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet19 = board14.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(positionSet19);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement19 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement19);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.canMergeWith(cell26);
        board22.setCell((int) (short) 0, 0, cell25);
        boolean boolean29 = board22.moveRight();
        boolean boolean31 = board22.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell34 = board22.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean36 = nonDeterministicPlacement19.addTile(board35);
        boolean boolean37 = nonDeterministicPlacement0.addTile(board35);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement39 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        boolean boolean41 = deterministicPlacement39.addTile(board40);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement39);
        boolean boolean43 = nonDeterministicPlacement0.addTile(board42);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean50 = cell48.canMergeWith(cell49);
        board45.setCell((int) (short) 0, 0, cell48);
        boolean boolean52 = board45.moveRight();
        boolean boolean54 = board45.equals((java.lang.Object) (-1L));
        boolean boolean55 = nonDeterministicPlacement0.addTile(board45);
        boolean boolean56 = board45.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.isLosingBoard();
        java.lang.String str6 = board2.toString();
        int int7 = board2.getSize();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "1) test147(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str6, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = board2.getStrategy();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 100, placementStrategy5);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement10 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement10);
        boolean boolean12 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.canMergeWith(cell20);
        board16.setCell((int) (short) 0, 0, cell19);
        board11.setCell((int) (short) 0, 0, cell19);
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell((int) (short) -1, (int) (short) -1, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(placementStrategy5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        boolean boolean11 = board1.isFull();
        boolean boolean12 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy10 = null;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(1, placementStrategy10);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy12 = board11.getStrategy();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = cell1.equals((java.lang.Object) board11);
        java.lang.String str15 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = cell1.canMergeWith(cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ar.edu.unrc.game2048.Cell.isEmpty()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(placementStrategy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        int int6 = position5.row;
        boolean boolean7 = position2.equals((java.lang.Object) int6);
        int int8 = position2.col;
        int int9 = position2.col;
        java.lang.String str10 = position2.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0, 97)" + "'", str10, "(0, 97)");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 100);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean12 = cell7.equals((java.lang.Object) (-1L));
        java.lang.String str13 = cell7.toString();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str16 = cell15.toString();
        boolean boolean17 = cell15.isEmpty();
        boolean boolean18 = cell7.canMergeWith(cell15);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean28 = cell23.equals((java.lang.Object) (-1L));
        boolean boolean29 = cell7.canMergeWith(cell23);
        java.lang.String str30 = cell7.toString();
        boolean boolean31 = cell1.canMergeWith(cell7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        java.lang.String str9 = cell1.toString();
        int int10 = cell1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveLeft();
        boolean boolean6 = board4.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell9 = board4.getCell(0, (int) (short) 0);
        boolean boolean10 = position2.equals((java.lang.Object) cell9);
        java.lang.Class<?> wildcardClass11 = cell9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean16 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell19 = board1.getCell((int) '#', (int) (byte) 0);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        boolean boolean3 = deterministicPlacement1.addTile(board2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = board4.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(placementStrategy5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean27 = board20.moveRight();
        boolean boolean29 = board20.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell32 = board20.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean34 = board20.moveUp();
        boolean boolean35 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveLeft();
        boolean boolean39 = board37.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell42 = board37.getCell(0, (int) (short) 0);
        boolean boolean43 = board37.moveUp();
        boolean boolean44 = board37.moveUp();
        boolean boolean45 = nonDeterministicPlacement1.addTile(board37);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean50 = cell48.canMergeWith(cell49);
        board37.setCell(0, (int) (short) 1, cell49);
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board37);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell55 = board37.getCell(97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 0) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        boolean boolean5 = deterministicPlacement3.addTile(board4);
        boolean boolean6 = deterministicPlacement0.addTile(board4);
        boolean boolean7 = board4.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean13 = board1.moveDown();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "1) test160(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy10 = null;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(1, placementStrategy10);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy12 = board11.getStrategy();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = cell1.equals((java.lang.Object) board11);
        java.lang.String str15 = board11.toString();
        boolean boolean16 = board11.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(placementStrategy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "2) test161(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str15, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean15 = board1.moveUp();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = board1.getStrategy();
        boolean boolean17 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(placementStrategy16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        boolean boolean5 = deterministicPlacement3.addTile(board4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean13 = cell11.canMergeWith(cell12);
        board8.setCell((int) (short) 0, 0, cell11);
        boolean boolean15 = board8.moveRight();
        boolean boolean17 = board8.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell20 = board8.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Cell cell24 = board21.getCell(0, (int) (byte) 0);
        boolean boolean25 = deterministicPlacement3.addTile(board21);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean27 = board1.equals((java.lang.Object) board26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.isLosingBoard();
        boolean boolean4 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet5 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = board1.getStrategy();
        boolean boolean16 = board1.hasEmptyCells();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(placementStrategy15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '4');
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        boolean boolean3 = board1.moveRight();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board1.getCell(4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        int int6 = position5.row;
        boolean boolean7 = position2.equals((java.lang.Object) int6);
        int int8 = position2.col;
        int int9 = position2.col;
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement10 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean17 = cell15.canMergeWith(cell16);
        board12.setCell((int) (short) 0, 0, cell15);
        boolean boolean19 = board12.moveRight();
        boolean boolean21 = board12.equals((java.lang.Object) (-1L));
        boolean boolean22 = board12.isFull();
        boolean boolean23 = nonDeterministicPlacement10.addTile(board12);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy25 = null;
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(1, placementStrategy25);
        boolean boolean27 = nonDeterministicPlacement10.addTile(board26);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement29 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement29);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean37 = cell35.canMergeWith(cell36);
        board32.setCell((int) (short) 0, 0, cell35);
        boolean boolean39 = board32.moveRight();
        boolean boolean41 = board32.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell44 = board32.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(board32);
        boolean boolean46 = nonDeterministicPlacement29.addTile(board45);
        boolean boolean47 = nonDeterministicPlacement10.addTile(board45);
        boolean boolean48 = position2.equals((java.lang.Object) nonDeterministicPlacement10);
        int int49 = position2.row;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        int int4 = cell3.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = null;
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(1, placementStrategy6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board7.getStrategy();
        boolean boolean9 = board7.moveRight();
        boolean boolean10 = cell3.equals((java.lang.Object) board7);
        boolean boolean11 = board7.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean13 = board1.equals((java.lang.Object) board7);
        java.lang.String str14 = board7.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str14, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(0);
        int int12 = cell11.getValue();
        boolean boolean13 = cell4.canMergeWith(cell11);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement14 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell19.canMergeWith(cell20);
        board16.setCell((int) (short) 0, 0, cell19);
        boolean boolean23 = board16.moveRight();
        boolean boolean25 = board16.equals((java.lang.Object) (-1L));
        boolean boolean26 = board16.isFull();
        boolean boolean27 = nonDeterministicPlacement14.addTile(board16);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy29 = null;
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(1, placementStrategy29);
        boolean boolean31 = nonDeterministicPlacement14.addTile(board30);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement33 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement33);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean41 = cell39.canMergeWith(cell40);
        board36.setCell((int) (short) 0, 0, cell39);
        boolean boolean43 = board36.moveRight();
        boolean boolean45 = board36.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell48 = board36.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean50 = nonDeterministicPlacement33.addTile(board49);
        boolean boolean51 = nonDeterministicPlacement14.addTile(board49);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement53 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board();
        boolean boolean55 = deterministicPlacement53.addTile(board54);
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement53);
        boolean boolean57 = nonDeterministicPlacement14.addTile(board56);
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean60 = board59.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy62 = null;
        ar.edu.unrc.game2048.Board board63 = new ar.edu.unrc.game2048.Board(1, placementStrategy62);
        boolean boolean64 = board63.moveDown();
        ar.edu.unrc.game2048.Board board65 = new ar.edu.unrc.game2048.Board(board63);
        boolean boolean66 = board59.equals((java.lang.Object) board63);
        int int67 = board63.getSize();
        boolean boolean68 = nonDeterministicPlacement14.addTile(board63);
        boolean boolean69 = cell4.equals((java.lang.Object) board63);
        ar.edu.unrc.game2048.Board board71 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell74 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell75 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean76 = cell74.canMergeWith(cell75);
        board71.setCell((int) (short) 0, 0, cell74);
        boolean boolean79 = cell74.equals((java.lang.Object) (-1L));
        java.lang.String str80 = cell74.toString();
        boolean boolean81 = cell74.isEmpty();
        boolean boolean82 = cell4.canMergeWith(cell74);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(cell74);
        org.junit.Assert.assertNotNull(cell75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "." + "'", str80, ".");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(97);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement19 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement19);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.canMergeWith(cell26);
        board22.setCell((int) (short) 0, 0, cell25);
        boolean boolean29 = board22.moveRight();
        boolean boolean31 = board22.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell34 = board22.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean36 = nonDeterministicPlacement19.addTile(board35);
        boolean boolean37 = nonDeterministicPlacement0.addTile(board35);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement39 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        boolean boolean41 = deterministicPlacement39.addTile(board40);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement39);
        boolean boolean43 = nonDeterministicPlacement0.addTile(board42);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean50 = cell48.canMergeWith(cell49);
        board45.setCell((int) (short) 0, 0, cell48);
        boolean boolean52 = board45.moveRight();
        boolean boolean54 = board45.equals((java.lang.Object) (-1L));
        boolean boolean55 = nonDeterministicPlacement0.addTile(board45);
        boolean boolean56 = board45.moveRight();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky "3) test172(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveLeft();
        boolean boolean6 = board4.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell9 = board4.getCell(0, (int) (short) 0);
        boolean boolean10 = position2.equals((java.lang.Object) cell9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy12 = null;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(1, placementStrategy12);
        boolean boolean14 = board13.isLosingBoard();
        boolean boolean15 = board13.isWinningBoard();
        boolean boolean16 = board13.moveRight();
        boolean boolean17 = cell9.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Cell cell18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = cell9.canMergeWith(cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ar.edu.unrc.game2048.Cell.isEmpty()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        int int4 = cell3.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = null;
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(1, placementStrategy6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board7.getStrategy();
        boolean boolean9 = board7.moveRight();
        boolean boolean10 = cell3.equals((java.lang.Object) board7);
        boolean boolean11 = board7.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean13 = board1.equals((java.lang.Object) board7);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet14 = board1.getEmptyPositions();
        boolean boolean15 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell((int) '#');
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str22 = cell21.toString();
        boolean boolean23 = cell21.isEmpty();
        boolean boolean24 = cell19.canMergeWith(cell21);
        int int25 = cell21.getValue();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean32 = cell30.canMergeWith(cell31);
        board27.setCell((int) (short) 0, 0, cell30);
        boolean boolean35 = cell30.equals((java.lang.Object) (-1L));
        boolean boolean36 = cell30.isEmpty();
        boolean boolean37 = cell21.canMergeWith(cell30);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) -1, (int) 'a', cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 97) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        boolean boolean3 = deterministicPlacement1.addTile(board2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell9.canMergeWith(cell10);
        board6.setCell((int) (short) 0, 0, cell9);
        boolean boolean13 = board6.moveRight();
        boolean boolean15 = board6.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell18 = board6.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Cell cell22 = board19.getCell(0, (int) (byte) 0);
        boolean boolean23 = deterministicPlacement1.addTile(board19);
        int int24 = board19.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.isLosingBoard();
        boolean boolean4 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 10, 10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy18 = board14.getStrategy();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board14);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(placementStrategy18);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean5 = board4.moveUp();
        boolean boolean6 = board4.moveUp();
        boolean boolean7 = board4.moveRight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(0);
        int int12 = cell11.getValue();
        boolean boolean13 = cell4.canMergeWith(cell11);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = null;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(1, placementStrategy16);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy18 = board17.getStrategy();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy18);
        boolean boolean20 = cell11.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(placementStrategy18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        boolean boolean9 = board5.moveUp();
        boolean boolean10 = board5.moveLeft();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(0);
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = null;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(1, placementStrategy8);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy10 = board9.getStrategy();
        boolean boolean11 = board9.moveRight();
        boolean boolean12 = cell5.equals((java.lang.Object) board9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = null;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(1, placementStrategy14);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = board15.getStrategy();
        boolean boolean17 = board15.moveRight();
        boolean boolean18 = cell5.equals((java.lang.Object) board15);
        boolean boolean19 = board2.equals((java.lang.Object) boolean18);
        boolean boolean20 = nonDeterministicPlacement0.addTile(board2);
        int int21 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(placementStrategy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(placementStrategy16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 97)" + "'", str3, "(0, 97)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 97)" + "'", str4, "(0, 97)");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        boolean boolean9 = board5.isWinningBoard();
        boolean boolean10 = board5.moveLeft();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.isFull();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean27 = board20.moveRight();
        boolean boolean29 = board20.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell32 = board20.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean34 = board20.moveUp();
        boolean boolean35 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveLeft();
        boolean boolean39 = board37.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell42 = board37.getCell(0, (int) (short) 0);
        boolean boolean43 = board37.moveUp();
        boolean boolean44 = board37.moveUp();
        boolean boolean45 = nonDeterministicPlacement1.addTile(board37);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell51 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean52 = cell50.canMergeWith(cell51);
        board47.setCell((int) (short) 0, 0, cell50);
        boolean boolean54 = board47.moveRight();
        boolean boolean56 = board47.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell59 = board47.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(board47);
        boolean boolean61 = board47.moveUp();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy62 = board47.getStrategy();
        int int63 = board47.getSize();
        boolean boolean64 = nonDeterministicPlacement1.addTile(board47);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cell59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(placementStrategy62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Cell cell20 = board17.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board17);
        int int22 = board21.getSize();
        boolean boolean23 = nonDeterministicPlacement1.addTile(board21);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveLeft();
        boolean boolean12 = board1.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board1.getStrategy();
        boolean boolean14 = board1.moveRight();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        boolean boolean14 = board1.moveUp();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        boolean boolean10 = cell4.isEmpty();
        int int11 = cell4.getValue();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean14 = board13.isFull();
        boolean boolean15 = board13.isWinningBoard();
        boolean boolean16 = cell4.equals((java.lang.Object) boolean15);
        boolean boolean18 = cell4.equals((java.lang.Object) "");
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean28 = cell23.equals((java.lang.Object) (-1L));
        java.lang.String str29 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell31 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str32 = cell31.toString();
        boolean boolean33 = cell31.isEmpty();
        boolean boolean34 = cell23.canMergeWith(cell31);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean41 = cell39.canMergeWith(cell40);
        board36.setCell((int) (short) 0, 0, cell39);
        boolean boolean44 = cell39.equals((java.lang.Object) (-1L));
        boolean boolean45 = cell23.canMergeWith(cell39);
        java.lang.String str46 = cell23.toString();
        boolean boolean47 = cell4.canMergeWith(cell23);
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean54 = cell52.canMergeWith(cell53);
        board49.setCell((int) (short) 0, 0, cell52);
        java.lang.String str56 = cell52.toString();
        boolean boolean57 = cell23.canMergeWith(cell52);
        boolean boolean58 = cell52.isEmpty();
        ar.edu.unrc.game2048.Position position61 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        ar.edu.unrc.game2048.Board board63 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell66 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell67 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean68 = cell66.canMergeWith(cell67);
        board63.setCell((int) (short) 0, 0, cell66);
        boolean boolean71 = cell66.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell73 = new ar.edu.unrc.game2048.Cell((int) 'a');
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement75 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board76 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement75);
        ar.edu.unrc.game2048.Board board78 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell81 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell82 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean83 = cell81.canMergeWith(cell82);
        board78.setCell((int) (short) 0, 0, cell81);
        boolean boolean85 = board78.moveRight();
        boolean boolean87 = board78.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell90 = board78.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board91 = new ar.edu.unrc.game2048.Board(board78);
        boolean boolean92 = nonDeterministicPlacement75.addTile(board91);
        boolean boolean93 = cell73.equals((java.lang.Object) nonDeterministicPlacement75);
        boolean boolean94 = cell66.canMergeWith(cell73);
        boolean boolean95 = position61.equals((java.lang.Object) cell66);
        java.lang.String str96 = cell66.toString();
        boolean boolean97 = cell52.equals((java.lang.Object) cell66);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "." + "'", str56, ".");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertNotNull(cell67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(cell81);
        org.junit.Assert.assertNotNull(cell82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(cell90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "." + "'", str96, ".");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveLeft();
        boolean boolean12 = board1.moveRight();
        boolean boolean13 = board1.moveRight();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = board1.getCell((int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 35) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        int int4 = cell3.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = null;
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(1, placementStrategy6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board7.getStrategy();
        boolean boolean9 = board7.moveRight();
        boolean boolean10 = cell3.equals((java.lang.Object) board7);
        boolean boolean11 = board7.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean13 = deterministicPlacement1.addTile(board7);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean20 = cell18.canMergeWith(cell19);
        board15.setCell((int) (short) 0, 0, cell18);
        boolean boolean22 = board15.moveRight();
        boolean boolean23 = board15.isWinningBoard();
        boolean boolean24 = deterministicPlacement1.addTile(board15);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(35, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell14 = board2.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet17 = board2.getEmptyPositions();
        boolean boolean18 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell(0, (int) (byte) 0);
        boolean boolean18 = board14.hasEmptyCells();
        boolean boolean19 = board14.moveLeft();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.isLosingBoard();
        java.lang.String str6 = board2.toString();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet7 = board2.getEmptyPositions();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "2) test195(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str6, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.isWinningBoard();
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        int int13 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean2 = board1.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        boolean boolean6 = board5.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean8 = board1.equals((java.lang.Object) board5);
        int int9 = board1.getSize();
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveLeft();
        int int12 = board1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        int int4 = board3.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ar.edu.unrc.game2048.Board board0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"size\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveRight();
        boolean boolean3 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "4) test201(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        boolean boolean3 = deterministicPlacement1.addTile(board2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        boolean boolean6 = deterministicPlacement4.addTile(board5);
        boolean boolean7 = deterministicPlacement1.addTile(board5);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(0, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        boolean boolean3 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        board2.setCell((int) (short) 0, 0, cell10);
        int int15 = cell10.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean27 = board20.moveRight();
        boolean boolean29 = board20.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell32 = board20.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean34 = board20.moveUp();
        boolean boolean35 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveLeft();
        boolean boolean39 = board37.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell42 = board37.getCell(0, (int) (short) 0);
        boolean boolean43 = board37.moveUp();
        boolean boolean44 = board37.moveUp();
        boolean boolean45 = nonDeterministicPlacement1.addTile(board37);
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board37);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        boolean boolean18 = board16.isLosingBoard();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board16.getStrategy();
        boolean boolean20 = board16.isLosingBoard();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 10);
        boolean boolean2 = cell1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "5) test208(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveLeft();
        boolean boolean3 = board1.moveRight();
        boolean boolean4 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = null;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(1, placementStrategy7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board8.getStrategy();
        boolean boolean10 = board8.moveRight();
        boolean boolean11 = board8.hasEmptyCells();
        boolean boolean12 = position2.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = null;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(1, placementStrategy14);
        boolean boolean16 = board15.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board15);
        int int18 = board17.getScore();
        boolean boolean19 = position2.equals((java.lang.Object) int18);
        int int20 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        boolean boolean9 = board5.moveDown();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean11 = board10.moveLeft();
        boolean boolean12 = board10.hasEmptyCells();
        boolean boolean13 = board10.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        boolean boolean18 = board16.isLosingBoard();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board16.getStrategy();
        boolean boolean20 = board16.moveDown();
        boolean boolean21 = board16.moveDown();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean27 = board20.moveRight();
        boolean boolean29 = board20.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell32 = board20.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean34 = board20.moveUp();
        boolean boolean35 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveLeft();
        boolean boolean39 = board37.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell42 = board37.getCell(0, (int) (short) 0);
        boolean boolean43 = board37.moveUp();
        boolean boolean44 = board37.moveUp();
        boolean boolean45 = nonDeterministicPlacement1.addTile(board37);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean50 = cell48.canMergeWith(cell49);
        board37.setCell(0, (int) (short) 1, cell49);
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean53 = board37.isLosingBoard();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell14 = board2.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet17 = board2.getEmptyPositions();
        boolean boolean18 = nonDeterministicPlacement0.addTile(board2);
        java.lang.Class<?> wildcardClass19 = board2.getClass();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        boolean boolean15 = cell10.equals((java.lang.Object) (-1L));
        java.lang.String str16 = cell10.toString();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str19 = cell18.toString();
        boolean boolean20 = cell18.isEmpty();
        boolean boolean21 = cell10.canMergeWith(cell18);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean28 = cell26.canMergeWith(cell27);
        board23.setCell((int) (short) 0, 0, cell26);
        boolean boolean31 = cell26.equals((java.lang.Object) (-1L));
        boolean boolean32 = cell10.canMergeWith(cell26);
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell((int) (short) 1, 100, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean7 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean14 = cell12.canMergeWith(cell13);
        board9.setCell((int) (short) 0, 0, cell12);
        boolean boolean16 = board2.equals((java.lang.Object) board9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy17 = board9.getStrategy();
        boolean boolean18 = board9.moveLeft();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(placementStrategy17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '#');
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str4 = cell3.toString();
        boolean boolean5 = cell3.isEmpty();
        boolean boolean6 = cell1.canMergeWith(cell3);
        int int7 = cell3.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = null;
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(1, placementStrategy9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy11 = board10.getStrategy();
        boolean boolean12 = board10.moveRight();
        boolean boolean13 = board10.hasEmptyCells();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean17 = board10.equals((java.lang.Object) board16);
        boolean boolean18 = board10.moveRight();
        boolean boolean19 = cell3.equals((java.lang.Object) boolean18);
        int int20 = cell3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(placementStrategy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(0);
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = null;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(1, placementStrategy7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board8.getStrategy();
        boolean boolean10 = board8.moveRight();
        boolean boolean11 = cell4.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = null;
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(1, placementStrategy13);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = board14.getStrategy();
        boolean boolean16 = board14.moveRight();
        boolean boolean17 = cell4.equals((java.lang.Object) board14);
        boolean boolean18 = board1.equals((java.lang.Object) boolean17);
        boolean boolean19 = board1.moveRight();
        boolean boolean20 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(placementStrategy15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        boolean boolean3 = deterministicPlacement1.addTile(board2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean5 = board4.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        java.lang.String str5 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean27 = board20.moveRight();
        boolean boolean29 = board20.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell32 = board20.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean34 = board20.moveUp();
        boolean boolean35 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveLeft();
        boolean boolean39 = board37.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell42 = board37.getCell(0, (int) (short) 0);
        boolean boolean43 = board37.moveUp();
        boolean boolean44 = board37.moveUp();
        boolean boolean45 = nonDeterministicPlacement1.addTile(board37);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell51 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean52 = cell50.canMergeWith(cell51);
        board47.setCell((int) (short) 0, 0, cell50);
        boolean boolean54 = board47.moveRight();
        boolean boolean55 = board47.moveRight();
        boolean boolean56 = board47.isLosingBoard();
        boolean boolean57 = board47.moveLeft();
        boolean boolean58 = nonDeterministicPlacement1.addTile(board47);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        boolean boolean19 = board14.equals((java.lang.Object) board18);
        boolean boolean20 = board18.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet21 = board18.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "6) test222(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(positionSet21);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        boolean boolean9 = board5.moveDown();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board5);
        int int11 = board10.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) 1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy2 = board1.getStrategy();
        boolean boolean3 = board1.isWinningBoard();
        org.junit.Assert.assertNotNull(placementStrategy2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        int int7 = position2.row;
        int int8 = position2.row;
        java.lang.String str9 = position2.toString();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean16 = cell14.canMergeWith(cell15);
        board11.setCell((int) (short) 0, 0, cell14);
        boolean boolean19 = cell14.equals((java.lang.Object) (-1L));
        boolean boolean20 = cell14.isEmpty();
        int int21 = cell14.getValue();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean24 = board23.isFull();
        boolean boolean25 = board23.isWinningBoard();
        boolean boolean26 = cell14.equals((java.lang.Object) boolean25);
        boolean boolean28 = cell14.equals((java.lang.Object) "");
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean35 = cell33.canMergeWith(cell34);
        board30.setCell((int) (short) 0, 0, cell33);
        boolean boolean38 = cell33.equals((java.lang.Object) (-1L));
        java.lang.String str39 = cell33.toString();
        ar.edu.unrc.game2048.Cell cell41 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str42 = cell41.toString();
        boolean boolean43 = cell41.isEmpty();
        boolean boolean44 = cell33.canMergeWith(cell41);
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean51 = cell49.canMergeWith(cell50);
        board46.setCell((int) (short) 0, 0, cell49);
        boolean boolean54 = cell49.equals((java.lang.Object) (-1L));
        boolean boolean55 = cell33.canMergeWith(cell49);
        java.lang.String str56 = cell33.toString();
        boolean boolean57 = cell14.canMergeWith(cell33);
        boolean boolean58 = position2.equals((java.lang.Object) cell14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 0)" + "'", str6, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, 0)" + "'", str9, "(100, 0)");
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "." + "'", str56, ".");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.moveLeft();
        boolean boolean3 = board1.moveRight();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board1.getCell(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        int int6 = position5.row;
        boolean boolean7 = position2.equals((java.lang.Object) int6);
        int int8 = position2.col;
        int int9 = position2.row;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(0);
        int int14 = cell13.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = null;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(1, placementStrategy16);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy18 = board17.getStrategy();
        boolean boolean19 = board17.moveRight();
        boolean boolean20 = cell13.equals((java.lang.Object) board17);
        boolean boolean21 = board17.moveDown();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean23 = board11.equals((java.lang.Object) board17);
        boolean boolean24 = position2.equals((java.lang.Object) board11);
        boolean boolean25 = board11.hasEmptyCells();
        java.lang.Class<?> wildcardClass26 = board11.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(placementStrategy18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean9 = board2.equals((java.lang.Object) board8);
        boolean boolean10 = board2.moveRight();
        boolean boolean11 = board2.moveDown();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '#');
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str4 = cell3.toString();
        boolean boolean5 = cell3.isEmpty();
        boolean boolean6 = cell1.canMergeWith(cell3);
        int int7 = cell1.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        java.lang.String str10 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell12.isEmpty();
        boolean boolean15 = cell4.canMergeWith(cell12);
        int int16 = cell4.getValue();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean23 = cell21.canMergeWith(cell22);
        board18.setCell((int) (short) 0, 0, cell21);
        boolean boolean26 = cell21.equals((java.lang.Object) (-1L));
        boolean boolean27 = cell21.isEmpty();
        int int28 = cell21.getValue();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean31 = board30.isFull();
        boolean boolean32 = board30.isWinningBoard();
        boolean boolean33 = cell21.equals((java.lang.Object) boolean32);
        boolean boolean35 = cell21.equals((java.lang.Object) "");
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean42 = cell40.canMergeWith(cell41);
        board37.setCell((int) (short) 0, 0, cell40);
        boolean boolean45 = cell40.equals((java.lang.Object) (-1L));
        java.lang.String str46 = cell40.toString();
        ar.edu.unrc.game2048.Cell cell48 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str49 = cell48.toString();
        boolean boolean50 = cell48.isEmpty();
        boolean boolean51 = cell40.canMergeWith(cell48);
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell56 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell57 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean58 = cell56.canMergeWith(cell57);
        board53.setCell((int) (short) 0, 0, cell56);
        boolean boolean61 = cell56.equals((java.lang.Object) (-1L));
        boolean boolean62 = cell40.canMergeWith(cell56);
        java.lang.String str63 = cell40.toString();
        boolean boolean64 = cell21.canMergeWith(cell40);
        boolean boolean65 = cell4.canMergeWith(cell40);
        boolean boolean66 = cell4.isEmpty();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "." + "'", str63, ".");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean13 = board12.isWinningBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean8 = cell6.canMergeWith(cell7);
        board3.setCell((int) (short) 0, 0, cell6);
        boolean boolean10 = board3.moveRight();
        boolean boolean12 = board3.equals((java.lang.Object) (-1L));
        boolean boolean13 = board3.isFull();
        boolean boolean14 = nonDeterministicPlacement1.addTile(board3);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = null;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(1, placementStrategy16);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement20 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement20);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean28 = cell26.canMergeWith(cell27);
        board23.setCell((int) (short) 0, 0, cell26);
        boolean boolean30 = board23.moveRight();
        boolean boolean32 = board23.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell35 = board23.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean37 = nonDeterministicPlacement20.addTile(board36);
        boolean boolean38 = nonDeterministicPlacement1.addTile(board36);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement40 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board();
        boolean boolean42 = deterministicPlacement40.addTile(board41);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement40);
        boolean boolean44 = nonDeterministicPlacement1.addTile(board43);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(1, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(35);
        boolean boolean48 = nonDeterministicPlacement1.addTile(board47);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        boolean boolean9 = board5.moveDown();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy12 = board10.getStrategy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(placementStrategy12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean13 = board1.isLosingBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        int int6 = position5.row;
        boolean boolean7 = position2.equals((java.lang.Object) int6);
        int int8 = position2.col;
        int int9 = position2.row;
        java.lang.String str10 = position2.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0, 97)" + "'", str10, "(0, 97)");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveRight();
        boolean boolean3 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
// flaky "1) test237(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement19 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement19);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.canMergeWith(cell26);
        board22.setCell((int) (short) 0, 0, cell25);
        boolean boolean29 = board22.moveRight();
        boolean boolean31 = board22.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell34 = board22.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean36 = nonDeterministicPlacement19.addTile(board35);
        boolean boolean37 = nonDeterministicPlacement0.addTile(board35);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement39 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        boolean boolean41 = deterministicPlacement39.addTile(board40);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement39);
        boolean boolean43 = nonDeterministicPlacement0.addTile(board42);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean46 = board45.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy48 = null;
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(1, placementStrategy48);
        boolean boolean50 = board49.moveDown();
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(board49);
        boolean boolean52 = board45.equals((java.lang.Object) board49);
        int int53 = board49.getSize();
        boolean boolean54 = nonDeterministicPlacement0.addTile(board49);
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean57 = board56.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy59 = null;
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(1, placementStrategy59);
        boolean boolean61 = board60.moveDown();
        ar.edu.unrc.game2048.Board board62 = new ar.edu.unrc.game2048.Board(board60);
        boolean boolean63 = board56.equals((java.lang.Object) board60);
        int int64 = board60.getSize();
        boolean boolean65 = nonDeterministicPlacement0.addTile(board60);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean8 = cell6.canMergeWith(cell7);
        board3.setCell((int) (short) 0, 0, cell6);
        boolean boolean10 = board3.moveRight();
        boolean boolean12 = board3.equals((java.lang.Object) (-1L));
        boolean boolean13 = board3.isFull();
        boolean boolean14 = nonDeterministicPlacement1.addTile(board3);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = null;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(1, placementStrategy16);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement20 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement20);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean28 = cell26.canMergeWith(cell27);
        board23.setCell((int) (short) 0, 0, cell26);
        boolean boolean30 = board23.moveRight();
        boolean boolean32 = board23.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell35 = board23.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean37 = nonDeterministicPlacement20.addTile(board36);
        boolean boolean38 = nonDeterministicPlacement1.addTile(board36);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement40 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board();
        boolean boolean42 = deterministicPlacement40.addTile(board41);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement40);
        boolean boolean44 = nonDeterministicPlacement1.addTile(board43);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(1, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        int int46 = board45.getScore();
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str2 = cell1.toString();
        boolean boolean3 = cell1.isEmpty();
        java.lang.Class<?> wildcardClass4 = cell1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.isLosingBoard();
        boolean boolean4 = board2.isWinningBoard();
        boolean boolean5 = board2.isFull();
        boolean boolean6 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean12 = cell7.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell((int) 'a');
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement16 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean24 = cell22.canMergeWith(cell23);
        board19.setCell((int) (short) 0, 0, cell22);
        boolean boolean26 = board19.moveRight();
        boolean boolean28 = board19.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell31 = board19.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean33 = nonDeterministicPlacement16.addTile(board32);
        boolean boolean34 = cell14.equals((java.lang.Object) nonDeterministicPlacement16);
        boolean boolean35 = cell7.canMergeWith(cell14);
        boolean boolean36 = position2.equals((java.lang.Object) cell7);
        java.lang.String str37 = position2.toString();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(100, 0)" + "'", str37, "(100, 0)");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 97)" + "'", str4, "(0, 97)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0, 97)" + "'", str5, "(0, 97)");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) -1, (int) '#');
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        int int4 = board3.getScore();
        boolean boolean5 = board3.isFull();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet6 = board3.getEmptyPositions();
        boolean boolean7 = position2.equals((java.lang.Object) positionSet6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet16 = board1.getEmptyPositions();
        boolean boolean17 = board1.moveRight();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell9.canMergeWith(cell10);
        board6.setCell((int) (short) 0, 0, cell9);
        boolean boolean13 = board6.moveRight();
        boolean boolean14 = board6.moveRight();
        boolean boolean15 = board6.isLosingBoard();
        boolean boolean16 = board6.moveLeft();
        boolean boolean17 = board6.moveRight();
        boolean boolean18 = position2.equals((java.lang.Object) board6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement19 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement19);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean27 = cell25.canMergeWith(cell26);
        board22.setCell((int) (short) 0, 0, cell25);
        boolean boolean29 = board22.moveRight();
        boolean boolean31 = board22.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell34 = board22.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean36 = nonDeterministicPlacement19.addTile(board35);
        boolean boolean37 = nonDeterministicPlacement0.addTile(board35);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement39 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        boolean boolean41 = deterministicPlacement39.addTile(board40);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement39);
        boolean boolean43 = nonDeterministicPlacement0.addTile(board42);
        boolean boolean44 = board42.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy45 = board42.getStrategy();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(placementStrategy45);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean27 = board20.moveRight();
        boolean boolean29 = board20.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell32 = board20.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean34 = board20.moveUp();
        boolean boolean35 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveLeft();
        boolean boolean39 = board37.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell42 = board37.getCell(0, (int) (short) 0);
        boolean boolean43 = board37.moveUp();
        boolean boolean44 = board37.moveUp();
        boolean boolean45 = nonDeterministicPlacement1.addTile(board37);
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board();
        boolean boolean47 = board46.isFull();
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(board46);
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(board48);
        boolean boolean50 = nonDeterministicPlacement1.addTile(board49);
        boolean boolean51 = board49.moveUp();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((-1), (int) '#', cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean12 = deterministicPlacement0.addTile(board4);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement14 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement14);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = cell20.canMergeWith(cell21);
        board17.setCell((int) (short) 0, 0, cell20);
        boolean boolean24 = board17.moveRight();
        boolean boolean26 = board17.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell29 = board17.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean31 = nonDeterministicPlacement14.addTile(board30);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean38 = cell36.canMergeWith(cell37);
        board33.setCell((int) (short) 0, 0, cell36);
        boolean boolean40 = board33.moveRight();
        boolean boolean42 = board33.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell45 = board33.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board33);
        boolean boolean47 = board33.moveUp();
        boolean boolean48 = nonDeterministicPlacement14.addTile(board33);
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean51 = board50.moveLeft();
        boolean boolean52 = board50.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell55 = board50.getCell(0, (int) (short) 0);
        boolean boolean56 = board50.moveUp();
        boolean boolean57 = board50.moveUp();
        boolean boolean58 = nonDeterministicPlacement14.addTile(board50);
        boolean boolean59 = deterministicPlacement0.addTile(board50);
        ar.edu.unrc.game2048.Board board61 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell64 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell65 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean66 = cell64.canMergeWith(cell65);
        board61.setCell((int) (short) 0, 0, cell64);
        boolean boolean68 = board61.moveRight();
        boolean boolean70 = board61.equals((java.lang.Object) (-1L));
        boolean boolean71 = deterministicPlacement0.addTile(board61);
        boolean boolean72 = board61.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement6 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean14 = cell12.canMergeWith(cell13);
        board9.setCell((int) (short) 0, 0, cell12);
        boolean boolean16 = board9.moveRight();
        boolean boolean18 = board9.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell21 = board9.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean23 = nonDeterministicPlacement6.addTile(board22);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.canMergeWith(cell29);
        board25.setCell((int) (short) 0, 0, cell28);
        boolean boolean32 = board25.moveRight();
        boolean boolean34 = board25.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell37 = board25.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean39 = board25.moveUp();
        boolean boolean40 = nonDeterministicPlacement6.addTile(board25);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean43 = board42.moveLeft();
        boolean boolean44 = board42.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell47 = board42.getCell(0, (int) (short) 0);
        boolean boolean48 = board42.moveUp();
        boolean boolean49 = board42.moveUp();
        boolean boolean50 = nonDeterministicPlacement6.addTile(board42);
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean55 = cell53.canMergeWith(cell54);
        board42.setCell(0, (int) (short) 1, cell54);
        boolean boolean57 = board42.moveUp();
        boolean boolean58 = position2.equals((java.lang.Object) board42);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement59 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board();
        boolean boolean61 = deterministicPlacement59.addTile(board60);
        ar.edu.unrc.game2048.Board board62 = new ar.edu.unrc.game2048.Board(board60);
        boolean boolean63 = position2.equals((java.lang.Object) board62);
        ar.edu.unrc.game2048.Position position66 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) '4');
        boolean boolean67 = position2.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement6 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean14 = cell12.canMergeWith(cell13);
        board9.setCell((int) (short) 0, 0, cell12);
        boolean boolean16 = board9.moveRight();
        boolean boolean18 = board9.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell21 = board9.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean23 = nonDeterministicPlacement6.addTile(board22);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.canMergeWith(cell29);
        board25.setCell((int) (short) 0, 0, cell28);
        boolean boolean32 = board25.moveRight();
        boolean boolean34 = board25.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell37 = board25.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean39 = board25.moveUp();
        boolean boolean40 = nonDeterministicPlacement6.addTile(board25);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean43 = board42.moveLeft();
        boolean boolean44 = board42.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell47 = board42.getCell(0, (int) (short) 0);
        boolean boolean48 = board42.moveUp();
        boolean boolean49 = board42.moveUp();
        boolean boolean50 = nonDeterministicPlacement6.addTile(board42);
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean55 = cell53.canMergeWith(cell54);
        board42.setCell(0, (int) (short) 1, cell54);
        boolean boolean57 = board42.moveUp();
        boolean boolean58 = position2.equals((java.lang.Object) board42);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement59 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board();
        boolean boolean61 = deterministicPlacement59.addTile(board60);
        ar.edu.unrc.game2048.Board board62 = new ar.edu.unrc.game2048.Board(board60);
        boolean boolean63 = position2.equals((java.lang.Object) board62);
        java.lang.String str64 = board62.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
// flaky "7) test253(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str64, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(4, (int) '#');
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.moveRight();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean9 = board8.isFull();
        boolean boolean10 = board8.isWinningBoard();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell17.canMergeWith(cell18);
        board14.setCell((int) (short) 0, 0, cell17);
        board8.setCell(10, 0, cell17);
        java.lang.String str22 = cell17.toString();
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(0);
        int int25 = cell24.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy27 = null;
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(1, placementStrategy27);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy29 = board28.getStrategy();
        boolean boolean30 = board28.moveRight();
        boolean boolean31 = cell24.equals((java.lang.Object) board28);
        boolean boolean32 = cell17.canMergeWith(cell24);
        board3.setCell(0, 1, cell24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(placementStrategy29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        boolean boolean3 = deterministicPlacement1.addTile(board2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = deterministicPlacement5.addTile(board6);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        boolean boolean10 = deterministicPlacement8.addTile(board9);
        boolean boolean11 = deterministicPlacement5.addTile(board9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean18 = cell16.canMergeWith(cell17);
        board13.setCell((int) (short) 0, 0, cell16);
        boolean boolean20 = board13.moveRight();
        boolean boolean22 = board13.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell25 = board13.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board13);
        ar.edu.unrc.game2048.Cell cell29 = board26.getCell(0, (int) (byte) 0);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        boolean boolean31 = board26.equals((java.lang.Object) board30);
        boolean boolean32 = deterministicPlacement5.addTile(board26);
        boolean boolean33 = deterministicPlacement1.addTile(board26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean5 = board4.moveLeft();
        boolean boolean6 = board4.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell9 = board4.getCell(0, (int) (short) 0);
        boolean boolean10 = position2.equals((java.lang.Object) cell9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy12 = null;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(1, placementStrategy12);
        boolean boolean14 = board13.isLosingBoard();
        boolean boolean15 = board13.isWinningBoard();
        boolean boolean16 = board13.moveRight();
        boolean boolean17 = cell9.equals((java.lang.Object) board13);
        int int18 = cell9.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        int int2 = board1.getScore();
        boolean boolean3 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(0);
        int int6 = cell5.getValue();
        boolean boolean7 = board1.equals((java.lang.Object) cell5);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell14 = board9.getCell(0, (int) (short) 0);
        boolean boolean15 = board9.moveUp();
        int int16 = board9.getScore();
        boolean boolean17 = board1.equals((java.lang.Object) int16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.isLosingBoard();
        java.lang.String str6 = board2.toString();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.canMergeWith(cell14);
        board10.setCell((int) (short) 0, 0, cell13);
        boolean boolean18 = cell13.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell((int) 'a');
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement22 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement22);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell28.canMergeWith(cell29);
        board25.setCell((int) (short) 0, 0, cell28);
        boolean boolean32 = board25.moveRight();
        boolean boolean34 = board25.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell37 = board25.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean39 = nonDeterministicPlacement22.addTile(board38);
        boolean boolean40 = cell20.equals((java.lang.Object) nonDeterministicPlacement22);
        boolean boolean41 = cell13.canMergeWith(cell20);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) '#', (int) (byte) 0, cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "8) test260(randoopTests.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str6, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        boolean boolean18 = board16.isLosingBoard();
        boolean boolean19 = board16.moveUp();
        boolean boolean20 = board16.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet21 = board16.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(positionSet21);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        int int7 = position2.col;
        int int8 = position2.col;
        int int9 = position2.row;
        int int10 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 0)" + "'", str6, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '#');
        boolean boolean2 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet16 = board1.getEmptyPositions();
        java.lang.Class<?> wildcardClass17 = board1.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        boolean boolean3 = board1.moveDown();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = board1.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(placementStrategy4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) '4');
        int int5 = board4.getScore();
        boolean boolean6 = deterministicPlacement0.addTile(board4);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean11 = board8.equals((java.lang.Object) (byte) 0);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy12 = board8.getStrategy();
        boolean boolean13 = deterministicPlacement0.addTile(board8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(placementStrategy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        boolean boolean12 = board2.isFull();
        boolean boolean13 = nonDeterministicPlacement0.addTile(board2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = null;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean17 = nonDeterministicPlacement0.addTile(board16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean20 = board19.isFull();
        boolean boolean21 = board19.isWinningBoard();
        boolean boolean22 = nonDeterministicPlacement0.addTile(board19);
        ar.edu.unrc.game2048.Cell cell25 = board19.getCell((int) '#', (int) (short) 1);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean32 = cell30.canMergeWith(cell31);
        board27.setCell((int) (short) 0, 0, cell30);
        boolean boolean35 = cell30.equals((java.lang.Object) (-1L));
        java.lang.String str36 = cell30.toString();
        boolean boolean37 = cell25.canMergeWith(cell30);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.isLosingBoard();
        boolean boolean4 = board2.isWinningBoard();
        boolean boolean5 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(placementStrategy6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        boolean boolean3 = deterministicPlacement1.addTile(board2);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell8.canMergeWith(cell9);
        board5.setCell((int) (short) 0, 0, cell8);
        boolean boolean12 = board5.moveRight();
        boolean boolean13 = deterministicPlacement1.addTile(board5);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement15 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement15);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean23 = cell21.canMergeWith(cell22);
        board18.setCell((int) (short) 0, 0, cell21);
        boolean boolean25 = board18.moveRight();
        boolean boolean27 = board18.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell30 = board18.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean32 = nonDeterministicPlacement15.addTile(board31);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean39 = cell37.canMergeWith(cell38);
        board34.setCell((int) (short) 0, 0, cell37);
        boolean boolean41 = board34.moveRight();
        boolean boolean43 = board34.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell46 = board34.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(board34);
        boolean boolean48 = board34.moveUp();
        boolean boolean49 = nonDeterministicPlacement15.addTile(board34);
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean52 = board51.moveLeft();
        boolean boolean53 = board51.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell56 = board51.getCell(0, (int) (short) 0);
        boolean boolean57 = board51.moveUp();
        boolean boolean58 = board51.moveUp();
        boolean boolean59 = nonDeterministicPlacement15.addTile(board51);
        boolean boolean60 = deterministicPlacement1.addTile(board51);
        ar.edu.unrc.game2048.Board board62 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell65 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell66 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean67 = cell65.canMergeWith(cell66);
        board62.setCell((int) (short) 0, 0, cell65);
        boolean boolean69 = board62.moveRight();
        boolean boolean71 = board62.equals((java.lang.Object) (-1L));
        boolean boolean72 = deterministicPlacement1.addTile(board62);
        ar.edu.unrc.game2048.Board board73 = new ar.edu.unrc.game2048.Board(2048, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean74 = board73.moveDown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean27 = board20.moveRight();
        boolean boolean29 = board20.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell32 = board20.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean34 = board20.moveUp();
        boolean boolean35 = nonDeterministicPlacement1.addTile(board20);
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean38 = board37.moveLeft();
        boolean boolean39 = board37.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell42 = board37.getCell(0, (int) (short) 0);
        boolean boolean43 = board37.moveUp();
        boolean boolean44 = board37.moveUp();
        boolean boolean45 = nonDeterministicPlacement1.addTile(board37);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean50 = cell48.canMergeWith(cell49);
        board37.setCell(0, (int) (short) 1, cell49);
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean53 = board37.moveLeft();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(0);
        int int12 = cell11.getValue();
        boolean boolean13 = cell4.canMergeWith(cell11);
        int int14 = cell11.getValue();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement0 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean7 = cell5.canMergeWith(cell6);
        board2.setCell((int) (short) 0, 0, cell5);
        boolean boolean9 = board2.moveRight();
        boolean boolean11 = board2.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell14 = board2.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet17 = board2.getEmptyPositions();
        boolean boolean18 = nonDeterministicPlacement0.addTile(board2);
        boolean boolean19 = board2.isFull();
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(0);
        int int12 = cell11.getValue();
        boolean boolean13 = cell4.canMergeWith(cell11);
        java.lang.String str14 = cell4.toString();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean17 = cell15.canMergeWith(cell16);
        boolean boolean18 = cell15.isEmpty();
        int int19 = cell15.getValue();
        boolean boolean20 = cell4.canMergeWith(cell15);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(0, (int) (short) 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) -1, 97);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        boolean boolean6 = board5.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        int int8 = board7.getScore();
        boolean boolean9 = position2.equals((java.lang.Object) int8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        boolean boolean11 = board10.moveUp();
        boolean boolean12 = board10.moveDown();
        int int13 = board10.getScore();
        boolean boolean14 = position2.equals((java.lang.Object) int13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "9) test276(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement3 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell8.canMergeWith(cell9);
        board5.setCell((int) (short) 0, 0, cell8);
        boolean boolean12 = board5.moveRight();
        boolean boolean14 = board5.equals((java.lang.Object) (-1L));
        boolean boolean15 = board5.isFull();
        boolean boolean16 = nonDeterministicPlacement3.addTile(board5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy18 = null;
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(1, placementStrategy18);
        boolean boolean20 = nonDeterministicPlacement3.addTile(board19);
        boolean boolean21 = board19.isLosingBoard();
        boolean boolean22 = deterministicPlacement0.addTile(board19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean12 = deterministicPlacement0.addTile(board4);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement14 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement14);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = cell20.canMergeWith(cell21);
        board17.setCell((int) (short) 0, 0, cell20);
        boolean boolean24 = board17.moveRight();
        boolean boolean26 = board17.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell29 = board17.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean31 = nonDeterministicPlacement14.addTile(board30);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean38 = cell36.canMergeWith(cell37);
        board33.setCell((int) (short) 0, 0, cell36);
        boolean boolean40 = board33.moveRight();
        boolean boolean42 = board33.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell45 = board33.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board33);
        boolean boolean47 = board33.moveUp();
        boolean boolean48 = nonDeterministicPlacement14.addTile(board33);
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean51 = board50.moveLeft();
        boolean boolean52 = board50.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell55 = board50.getCell(0, (int) (short) 0);
        boolean boolean56 = board50.moveUp();
        boolean boolean57 = board50.moveUp();
        boolean boolean58 = nonDeterministicPlacement14.addTile(board50);
        boolean boolean59 = deterministicPlacement0.addTile(board50);
        ar.edu.unrc.game2048.Board board61 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean62 = board61.isFull();
        boolean boolean63 = board61.isWinningBoard();
        ar.edu.unrc.game2048.Board board67 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell70 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell71 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean72 = cell70.canMergeWith(cell71);
        board67.setCell((int) (short) 0, 0, cell70);
        board61.setCell(10, 0, cell70);
        int int75 = board61.getSize();
        boolean boolean76 = board61.isWinningBoard();
        boolean boolean77 = deterministicPlacement0.addTile(board61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(cell70);
        org.junit.Assert.assertNotNull(cell71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean12 = deterministicPlacement0.addTile(board4);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement14 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement14);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = cell20.canMergeWith(cell21);
        board17.setCell((int) (short) 0, 0, cell20);
        boolean boolean24 = board17.moveRight();
        boolean boolean26 = board17.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell29 = board17.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean31 = nonDeterministicPlacement14.addTile(board30);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean38 = cell36.canMergeWith(cell37);
        board33.setCell((int) (short) 0, 0, cell36);
        boolean boolean40 = board33.moveRight();
        boolean boolean42 = board33.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell45 = board33.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board33);
        boolean boolean47 = board33.moveUp();
        boolean boolean48 = nonDeterministicPlacement14.addTile(board33);
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean51 = board50.moveLeft();
        boolean boolean52 = board50.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell55 = board50.getCell(0, (int) (short) 0);
        boolean boolean56 = board50.moveUp();
        boolean boolean57 = board50.moveUp();
        boolean boolean58 = nonDeterministicPlacement14.addTile(board50);
        boolean boolean59 = deterministicPlacement0.addTile(board50);
        ar.edu.unrc.game2048.Board board61 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell64 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell65 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean66 = cell64.canMergeWith(cell65);
        board61.setCell((int) (short) 0, 0, cell64);
        boolean boolean68 = board61.moveRight();
        boolean boolean70 = board61.equals((java.lang.Object) (-1L));
        boolean boolean71 = deterministicPlacement0.addTile(board61);
        boolean boolean73 = board61.equals((java.lang.Object) '4');
        boolean boolean74 = board61.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
// flaky "1) test279(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean2 = board1.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        boolean boolean6 = board5.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean8 = board1.equals((java.lang.Object) board5);
        int int9 = board1.getSize();
        int int10 = board1.getSize();
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) (byte) 0);
        int int14 = cell13.getValue();
        java.lang.Class<?> wildcardClass15 = cell13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(cell13);
// flaky "10) test280(randoopTests.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(1);
        int int2 = board1.getScore();
        boolean boolean3 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        boolean boolean3 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        int int5 = board2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean7 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean14 = cell12.canMergeWith(cell13);
        board9.setCell((int) (short) 0, 0, cell12);
        boolean boolean16 = board2.equals((java.lang.Object) board9);
        boolean boolean17 = board2.isLosingBoard();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.moveUp();
        boolean boolean6 = board2.isLosingBoard();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        boolean boolean2 = deterministicPlacement0.addTile(board1);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        boolean boolean5 = deterministicPlacement3.addTile(board4);
        boolean boolean6 = board4.moveRight();
        boolean boolean7 = deterministicPlacement0.addTile(board4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean9 = board1.moveRight();
        boolean boolean10 = board1.isLosingBoard();
        boolean boolean11 = board1.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean13 = board12.isFull();
        boolean boolean14 = board12.moveDown();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board12);
        java.lang.Object obj16 = null;
        boolean boolean17 = board15.equals(obj16);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        boolean boolean4 = deterministicPlacement2.addTile(board3);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell9.canMergeWith(cell10);
        board6.setCell((int) (short) 0, 0, cell9);
        boolean boolean13 = board6.moveRight();
        boolean boolean14 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement16 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean24 = cell22.canMergeWith(cell23);
        board19.setCell((int) (short) 0, 0, cell22);
        boolean boolean26 = board19.moveRight();
        boolean boolean28 = board19.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell31 = board19.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean33 = nonDeterministicPlacement16.addTile(board32);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean40 = cell38.canMergeWith(cell39);
        board35.setCell((int) (short) 0, 0, cell38);
        boolean boolean42 = board35.moveRight();
        boolean boolean44 = board35.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell47 = board35.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(board35);
        boolean boolean49 = board35.moveUp();
        boolean boolean50 = nonDeterministicPlacement16.addTile(board35);
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean53 = board52.moveLeft();
        boolean boolean54 = board52.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell57 = board52.getCell(0, (int) (short) 0);
        boolean boolean58 = board52.moveUp();
        boolean boolean59 = board52.moveUp();
        boolean boolean60 = nonDeterministicPlacement16.addTile(board52);
        boolean boolean61 = deterministicPlacement2.addTile(board52);
        ar.edu.unrc.game2048.Board board63 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell66 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell67 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean68 = cell66.canMergeWith(cell67);
        board63.setCell((int) (short) 0, 0, cell66);
        boolean boolean70 = board63.moveRight();
        boolean boolean72 = board63.equals((java.lang.Object) (-1L));
        boolean boolean73 = deterministicPlacement2.addTile(board63);
        ar.edu.unrc.game2048.Board board74 = new ar.edu.unrc.game2048.Board(2048, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Board board75 = new ar.edu.unrc.game2048.Board(100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertNotNull(cell67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        ar.edu.unrc.game2048.Position position8 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        int int9 = position8.row;
        boolean boolean10 = position5.equals((java.lang.Object) int9);
        int int11 = position5.col;
        int int12 = position5.row;
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(0);
        int int17 = cell16.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = null;
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(1, placementStrategy19);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy21 = board20.getStrategy();
        boolean boolean22 = board20.moveRight();
        boolean boolean23 = cell16.equals((java.lang.Object) board20);
        boolean boolean24 = board20.moveDown();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean26 = board14.equals((java.lang.Object) board20);
        boolean boolean27 = position5.equals((java.lang.Object) board14);
        boolean boolean28 = nonDeterministicPlacement1.addTile(board14);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(placementStrategy21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        int int3 = position2.col;
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement4 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean11 = cell9.canMergeWith(cell10);
        board6.setCell((int) (short) 0, 0, cell9);
        boolean boolean13 = board6.moveRight();
        boolean boolean15 = board6.equals((java.lang.Object) (-1L));
        boolean boolean16 = board6.isFull();
        boolean boolean17 = nonDeterministicPlacement4.addTile(board6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = null;
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(1, placementStrategy19);
        boolean boolean21 = nonDeterministicPlacement4.addTile(board20);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean24 = board23.isFull();
        boolean boolean25 = board23.isWinningBoard();
        boolean boolean26 = nonDeterministicPlacement4.addTile(board23);
        ar.edu.unrc.game2048.Cell cell29 = board23.getCell((int) '#', (int) (short) 1);
        boolean boolean30 = position2.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean2 = board1.isFull();
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = cell10.canMergeWith(cell11);
        board7.setCell((int) (short) 0, 0, cell10);
        board1.setCell(10, 0, cell10);
        java.lang.String str15 = cell10.toString();
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(0);
        int int18 = cell17.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy20 = null;
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(1, placementStrategy20);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy22 = board21.getStrategy();
        boolean boolean23 = board21.moveRight();
        boolean boolean24 = cell17.equals((java.lang.Object) board21);
        boolean boolean25 = cell10.canMergeWith(cell17);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean32 = cell30.canMergeWith(cell31);
        board27.setCell((int) (short) 0, 0, cell30);
        boolean boolean35 = cell30.equals((java.lang.Object) (-1L));
        java.lang.String str36 = cell30.toString();
        ar.edu.unrc.game2048.Cell cell38 = new ar.edu.unrc.game2048.Cell(0);
        java.lang.String str39 = cell38.toString();
        boolean boolean40 = cell38.isEmpty();
        boolean boolean41 = cell30.canMergeWith(cell38);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell47 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean48 = cell46.canMergeWith(cell47);
        board43.setCell((int) (short) 0, 0, cell46);
        boolean boolean51 = cell46.equals((java.lang.Object) (-1L));
        boolean boolean52 = cell30.canMergeWith(cell46);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell53 = cell17.mergeWith(cell46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(placementStrategy22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        int int5 = position2.col;
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = null;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(1, placementStrategy7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board8.getStrategy();
        boolean boolean10 = board8.moveRight();
        boolean boolean11 = board8.hasEmptyCells();
        boolean boolean12 = position2.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board13.getStrategy();
        boolean boolean15 = board13.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = null;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(1, placementStrategy4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board5.getStrategy();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = cell1.equals((java.lang.Object) board5);
        boolean boolean9 = board5.moveDown();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean11 = board10.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        boolean boolean6 = board2.moveDown();
        boolean boolean7 = board2.moveLeft();
        org.junit.Assert.assertNotNull(placementStrategy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy1 = null;
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, placementStrategy1);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getScore();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        boolean boolean10 = cell4.isEmpty();
        int int11 = cell4.getValue();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean14 = board13.isFull();
        boolean boolean15 = board13.isWinningBoard();
        boolean boolean16 = cell4.equals((java.lang.Object) boolean15);
        ar.edu.unrc.game2048.Position position19 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean21 = position19.equals((java.lang.Object) (-1L));
        int int22 = position19.col;
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy24 = null;
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(1, placementStrategy24);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy26 = board25.getStrategy();
        boolean boolean27 = board25.moveRight();
        boolean boolean28 = board25.hasEmptyCells();
        boolean boolean29 = position19.equals((java.lang.Object) board25);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board25);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy31 = board30.getStrategy();
        boolean boolean32 = cell4.equals((java.lang.Object) board30);
        int int33 = board30.getSize();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(placementStrategy26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(placementStrategy31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 97);
        int int3 = position2.row;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell8.canMergeWith(cell9);
        board5.setCell((int) (short) 0, 0, cell8);
        boolean boolean12 = board5.moveRight();
        boolean boolean14 = board5.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell17 = board5.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board5);
        java.lang.Class<?> wildcardClass19 = board5.getClass();
        boolean boolean20 = position2.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean9 = cell4.equals((java.lang.Object) (-1L));
        boolean boolean10 = cell4.isEmpty();
        int int11 = cell4.getValue();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean14 = board13.isFull();
        boolean boolean15 = board13.isWinningBoard();
        boolean boolean16 = cell4.equals((java.lang.Object) boolean15);
        ar.edu.unrc.game2048.Position position19 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean21 = position19.equals((java.lang.Object) (-1L));
        int int22 = position19.col;
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy24 = null;
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(1, placementStrategy24);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy26 = board25.getStrategy();
        boolean boolean27 = board25.moveRight();
        boolean boolean28 = board25.hasEmptyCells();
        boolean boolean29 = position19.equals((java.lang.Object) board25);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board25);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy31 = board30.getStrategy();
        boolean boolean32 = cell4.equals((java.lang.Object) board30);
        java.lang.String str33 = cell4.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(placementStrategy26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(placementStrategy31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 100);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(0);
        int int4 = cell3.getValue();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = null;
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(1, placementStrategy6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board7.getStrategy();
        boolean boolean9 = board7.moveRight();
        boolean boolean10 = cell3.equals((java.lang.Object) board7);
        boolean boolean11 = board7.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean13 = board12.moveLeft();
        boolean boolean14 = board12.hasEmptyCells();
        boolean boolean15 = cell1.equals((java.lang.Object) boolean14);
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement17 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement17);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell23.canMergeWith(cell24);
        board20.setCell((int) (short) 0, 0, cell23);
        boolean boolean27 = board20.moveRight();
        boolean boolean29 = board20.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell32 = board20.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean34 = nonDeterministicPlacement17.addTile(board33);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean41 = cell39.canMergeWith(cell40);
        board36.setCell((int) (short) 0, 0, cell39);
        boolean boolean43 = board36.moveRight();
        boolean boolean45 = board36.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell48 = board36.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(board36);
        boolean boolean50 = board36.moveUp();
        boolean boolean51 = nonDeterministicPlacement17.addTile(board36);
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board((int) 'a');
        boolean boolean54 = board53.moveLeft();
        boolean boolean55 = board53.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell58 = board53.getCell(0, (int) (short) 0);
        boolean boolean59 = board53.moveUp();
        boolean boolean60 = board53.moveUp();
        boolean boolean61 = nonDeterministicPlacement17.addTile(board53);
        ar.edu.unrc.game2048.Cell cell64 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell65 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean66 = cell64.canMergeWith(cell65);
        board53.setCell(0, (int) (short) 1, cell65);
        ar.edu.unrc.game2048.Board board68 = new ar.edu.unrc.game2048.Board(board53);
        boolean boolean69 = cell1.equals((java.lang.Object) board68);
        ar.edu.unrc.game2048.Position position72 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean74 = position72.equals((java.lang.Object) (-1L));
        int int75 = position72.col;
        boolean boolean77 = position72.equals((java.lang.Object) 10.0d);
        java.lang.String str78 = position72.toString();
        int int79 = position72.col;
        boolean boolean80 = cell1.equals((java.lang.Object) position72);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(100, 0)" + "'", str78, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement1 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean9 = cell7.canMergeWith(cell8);
        board4.setCell((int) (short) 0, 0, cell7);
        boolean boolean11 = board4.moveRight();
        boolean boolean13 = board4.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell16 = board4.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean18 = nonDeterministicPlacement1.addTile(board17);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet19 = board17.getEmptyPositions();
        boolean boolean20 = board17.moveLeft();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (int) (short) 0);
        boolean boolean4 = position2.equals((java.lang.Object) (-1L));
        java.lang.String str5 = position2.toString();
        int int6 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 0)" + "'", str5, "(100, 0)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy2 = null;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(1, placementStrategy2);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy4 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy4);
        boolean boolean6 = board5.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board5.getStrategy();
        org.junit.Assert.assertNotNull(placementStrategy4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(placementStrategy7);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = cell4.canMergeWith(cell5);
        board1.setCell((int) (short) 0, 0, cell4);
        boolean boolean8 = board1.moveRight();
        boolean boolean10 = board1.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell17 = board14.getCell(0, (int) (byte) 0);
        boolean boolean18 = board14.isLosingBoard();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell((int) 'a');
        ar.edu.unrc.game2048.NonDeterministicPlacement nonDeterministicPlacement5 = new ar.edu.unrc.game2048.NonDeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement5);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) 'a');
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean13 = cell11.canMergeWith(cell12);
        board8.setCell((int) (short) 0, 0, cell11);
        boolean boolean15 = board8.moveRight();
        boolean boolean17 = board8.equals((java.lang.Object) (-1L));
        ar.edu.unrc.game2048.Cell cell20 = board8.getCell((int) (short) 0, (int) '4');
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean22 = nonDeterministicPlacement5.addTile(board21);
        boolean boolean23 = cell3.equals((java.lang.Object) nonDeterministicPlacement5);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(2048, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement5);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(97, (ar.edu.unrc.game2048.PlacementStrategy) nonDeterministicPlacement5);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }
}
