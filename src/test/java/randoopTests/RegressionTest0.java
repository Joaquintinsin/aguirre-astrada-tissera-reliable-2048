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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        boolean boolean2 = board1.repOk();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean3 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
        ar.edu.unrc.game2048.Cell cell2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = cell1.canMergeWith(cell2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"value\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
        boolean boolean2 = cell1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
        int int7 = cell6.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (short) -1, (int) '#', cell6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 35) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
        java.lang.String str2 = cell1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        int int2 = board1.getScore();
        boolean boolean3 = board1.moveRight();
        ar.edu.unrc.game2048.Cell cell6 = board1.getCell((int) (short) 10, 1);
        java.lang.String str7 = cell6.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        int int2 = board1.getScore();
        boolean boolean3 = board1.moveRight();
        ar.edu.unrc.game2048.Cell cell6 = board1.getCell((int) (short) 10, 1);
        boolean boolean7 = cell6.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        int int4 = board3.getScore();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy3 = board2.getStrategy();
        org.junit.Assert.assertNotNull(placementStrategy3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board2.isWinningBoard();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(placementStrategy5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean3 = board1.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board1.getCell((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 100) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        int int2 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet3 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) ' ');
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean3 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(10, (int) (short) -1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) ' ');
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board5.moveUp();
        boolean boolean8 = deterministicPlacement1.addTile(board5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board5.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(placementStrategy9);
    }
}

