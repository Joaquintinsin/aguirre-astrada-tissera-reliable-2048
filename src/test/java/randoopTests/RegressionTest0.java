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
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be 0 or a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = cell4.mergeWith(cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        java.lang.Class<?> wildcardClass4 = deterministicPlacement2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board2.getCell((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = cell14.mergeWith(cell16);
        java.lang.String str18 = cell14.toString();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) -1, 1, cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4" + "'", str18, "4");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = cell13.mergeWith(cell15);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = cell11.mergeWith(cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell16);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = cell13.mergeWith(cell15);
        java.lang.String str17 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell22 = cell19.mergeWith(cell21);
        ar.edu.unrc.game2048.Cell cell23 = cell13.mergeWith(cell19);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell24 = cell1.mergeWith(cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 4 and 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertNotNull(cell23);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 100)" + "'", str3, "(1, 100)");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board2.getCell((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        boolean boolean4 = position2.equals((java.lang.Object) "(10, 1)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (byte) 1, 100, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = cell10.mergeWith(cell12);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = cell15.mergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell19 = cell12.mergeWith(cell17);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(2048, (int) (short) 0, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(cell19);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be 0 or a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = cell12.mergeWith(cell14);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = cell17.mergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = cell14.mergeWith(cell19);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 1, 10, cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 10) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        boolean boolean3 = cell1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.Position position7 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean8 = board4.equals((java.lang.Object) position7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board4.getStrategy();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy9);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) (byte) 0, placementStrategy9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(placementStrategy9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be 0 or a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean9 = cell7.equals((java.lang.Object) deterministicPlacement8);
        java.lang.String str10 = cell7.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = cell4.mergeWith(cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy8);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = cell13.mergeWith(cell15);
        java.lang.String str17 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell22 = cell19.mergeWith(cell21);
        ar.edu.unrc.game2048.Cell cell23 = cell13.mergeWith(cell19);
        int int24 = cell19.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell(100, (int) (short) 0, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be 0 or a power of two: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean17 = cell16.isEmpty();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell22 = cell19.mergeWith(cell21);
        java.lang.String str23 = cell21.toString();
        boolean boolean24 = cell21.isEmpty();
        ar.edu.unrc.game2048.Cell cell25 = cell16.mergeWith(cell21);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) 'a', 100, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.isWinningBoard();
        boolean boolean8 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be 0 or a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveRight();
        int int10 = board2.getScore();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        int int12 = cell7.getValue();
        boolean boolean13 = cell7.isEmpty();
        boolean boolean14 = cell7.isEmpty();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board2.getCell((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        java.lang.String str6 = board2.toString();
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = cell10.mergeWith(cell12);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(8, 10, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (8, 10) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str6, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '4', 2048);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2048 + "'", int5 == 2048);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean6 = cell5.isEmpty();
        ar.edu.unrc.game2048.Cell cell7 = cell1.mergeWith(cell5);
        java.lang.Class<?> wildcardClass8 = cell7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        int int9 = board3.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board3.getEmptyPositions();
        java.lang.String str11 = board3.toString();
        boolean boolean12 = board3.isLosingBoard();
        int int13 = board3.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy14);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = board15.getStrategy();
        java.lang.Class<?> wildcardClass17 = placementStrategy16.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertNotNull(placementStrategy16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.isWinningBoard();
        int int8 = board2.getScore();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        java.lang.String str5 = board2.toString();
        java.lang.String str6 = board2.toString();
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((-1), (int) (short) 100, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str6, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        boolean boolean5 = cell3.isEmpty();
        int int6 = cell3.getValue();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '4', 2048);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 1)" + "'", str3, "(10, 1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(10, 1)" + "'", str4, "(10, 1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = cell6.mergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell10 = cell3.mergeWith(cell8);
        int int11 = cell10.getValue();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str14 = cell13.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = cell10.mergeWith(cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        boolean boolean6 = board2.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        boolean boolean8 = board2.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board2.getCell((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        int int9 = board3.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board3.getEmptyPositions();
        java.lang.String str11 = board3.toString();
        boolean boolean12 = board3.isLosingBoard();
        int int13 = board3.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy14);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = board15.getStrategy();
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell23 = cell20.mergeWith(cell22);
        java.lang.String str24 = cell20.toString();
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = cell26.mergeWith(cell28);
        ar.edu.unrc.game2048.Cell cell30 = cell20.mergeWith(cell26);
        // The following exception was thrown during execution in test generation
        try {
            board15.setCell((int) (byte) -1, (int) 'a', cell30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 97) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertNotNull(placementStrategy16);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertNotNull(cell30);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        boolean boolean8 = board2.hasEmptyCells();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 10)" + "'", str4, "(1, 10)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveRight();
        boolean boolean10 = board2.moveDown();
        boolean boolean11 = board2.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board2.getCell(10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 10) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = cell3.mergeWith(cell5);
        java.lang.String str7 = cell3.toString();
        boolean boolean8 = cell1.canMergeWith(cell3);
        ar.edu.unrc.game2048.Position position11 = new ar.edu.unrc.game2048.Position((int) 'a', (int) (byte) 100);
        boolean boolean13 = position11.equals((java.lang.Object) (short) 100);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = cell15.mergeWith(cell17);
        boolean boolean19 = cell17.isEmpty();
        boolean boolean20 = position11.equals((java.lang.Object) cell17);
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell25 = cell22.mergeWith(cell24);
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell30 = cell27.mergeWith(cell29);
        ar.edu.unrc.game2048.Cell cell31 = cell24.mergeWith(cell29);
        boolean boolean32 = cell17.canMergeWith(cell31);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell33 = cell3.mergeWith(cell31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 4 and 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = board2.getStrategy();
        java.lang.Class<?> wildcardClass6 = placementStrategy5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(placementStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getScore();
        boolean boolean9 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        ar.edu.unrc.game2048.Position position9 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean10 = board6.equals((java.lang.Object) position9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy11 = board6.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet12 = board6.getEmptyPositions();
        boolean boolean13 = board6.moveRight();
        boolean boolean14 = board6.moveDown();
        boolean boolean15 = board6.moveLeft();
        boolean boolean16 = deterministicPlacement2.addTile(board6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) (short) 0, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(placementStrategy11);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean5 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        int int12 = cell7.getValue();
        boolean boolean13 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean16 = cell15.isEmpty();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = cell18.mergeWith(cell20);
        java.lang.String str22 = cell20.toString();
        boolean boolean23 = cell20.isEmpty();
        ar.edu.unrc.game2048.Cell cell24 = cell15.mergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell25 = cell7.mergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell30 = cell27.mergeWith(cell29);
        java.lang.String str31 = cell27.toString();
        ar.edu.unrc.game2048.Cell cell33 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell35 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell36 = cell33.mergeWith(cell35);
        ar.edu.unrc.game2048.Cell cell37 = cell27.mergeWith(cell33);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell38 = cell20.mergeWith(cell37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 4 and 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4" + "'", str31, "4");
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertNotNull(cell37);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.moveLeft();
        boolean boolean11 = board2.moveUp();
        boolean boolean12 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = cell4.mergeWith(cell6);
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = cell6.isEmpty();
        boolean boolean10 = board2.equals((java.lang.Object) boolean9);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board2.getCell(8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (8, 35) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((-1), (int) '4');
        int int3 = position2.row;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getScore();
        boolean boolean9 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        int int20 = board14.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet21 = board14.getEmptyPositions();
        java.lang.String str22 = board14.toString();
        ar.edu.unrc.game2048.Cell cell25 = board14.getCell(0, (int) (byte) 0);
        boolean boolean26 = cell7.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str22, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = cell13.mergeWith(cell15);
        java.lang.String str17 = cell13.toString();
        boolean boolean18 = cell11.canMergeWith(cell13);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 1, (int) (byte) 0, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean6 = cell5.isEmpty();
        ar.edu.unrc.game2048.Cell cell7 = cell1.mergeWith(cell5);
        int int8 = cell7.getValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        boolean boolean7 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        java.lang.Class<?> wildcardClass7 = cell3.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = cell6.mergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell10 = cell3.mergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = cell12.mergeWith(cell14);
        int int16 = cell14.getValue();
        boolean boolean17 = cell8.equals((java.lang.Object) int16);
        java.lang.Class<?> wildcardClass18 = cell8.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.isFull();
        boolean boolean4 = board2.isLosingBoard();
        java.lang.String str5 = board2.toString();
        boolean boolean6 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int3 = position2.row;
        int int4 = position2.row;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        ar.edu.unrc.game2048.Position position10 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean11 = board7.equals((java.lang.Object) position10);
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        java.lang.String str13 = position2.toString();
        boolean boolean15 = position2.equals((java.lang.Object) "(1, 10)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 10)" + "'", str4, "(1, 10)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, 10)" + "'", str13, "(1, 10)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        boolean boolean9 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean14 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = cell16.mergeWith(cell18);
        java.lang.String str20 = cell18.toString();
        boolean boolean21 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell22 = cell13.mergeWith(cell18);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(1, 10, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 10) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean6 = cell5.isEmpty();
        ar.edu.unrc.game2048.Cell cell7 = cell1.mergeWith(cell5);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell12.isEmpty();
        boolean boolean15 = cell12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = cell5.mergeWith(cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 4 and 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8" + "'", str13, "8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        boolean boolean8 = board7.moveLeft();
        boolean boolean9 = board7.isFull();
        boolean boolean10 = board7.moveDown();
        boolean boolean11 = board7.hasEmptyCells();
        boolean boolean12 = board7.isWinningBoard();
        boolean boolean13 = deterministicPlacement3.addTile(board7);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((-1), (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 100)" + "'", str4, "(1, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, 100)" + "'", str6, "(1, 100)");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str13 = cell12.toString();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 10, (int) (short) -1, cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        java.lang.String str7 = cell3.toString();
        int int8 = cell3.getValue();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(10, (-1));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) 'a', (int) (byte) 100);
        boolean boolean4 = position2.equals((java.lang.Object) (short) 100);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = cell6.mergeWith(cell8);
        boolean boolean10 = cell8.isEmpty();
        boolean boolean11 = position2.equals((java.lang.Object) cell8);
        java.lang.Class<?> wildcardClass12 = position2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(100, 0);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) '4', 2048);
        boolean boolean7 = position5.equals((java.lang.Object) 10.0f);
        boolean boolean8 = position2.equals((java.lang.Object) boolean7);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet20 = board14.getEmptyPositions();
        boolean boolean21 = board14.hasEmptyCells();
        boolean boolean22 = deterministicPlacement2.addTile(board14);
        java.lang.Class<?> wildcardClass23 = board14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.isWinningBoard();
        boolean boolean8 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(100, (int) (short) -1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board2.getEmptyPositions();
        boolean boolean12 = board2.moveUp();
        boolean boolean13 = board2.moveDown();
        boolean boolean14 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) -1, (int) 'a');
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(2048, 4);
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = cell4.mergeWith(cell6);
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = position2.equals((java.lang.Object) str8);
        java.lang.String str10 = position2.toString();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(2048, 4)" + "'", str10, "(2048, 4)");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 0, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        ar.edu.unrc.game2048.Position position12 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean13 = board9.equals((java.lang.Object) position12);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board9.getStrategy();
        int int15 = board9.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet16 = board9.getEmptyPositions();
        java.lang.String str17 = board9.toString();
        boolean boolean18 = board9.isLosingBoard();
        int int19 = board9.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy20 = board9.getStrategy();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(1, placementStrategy20);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(10, placementStrategy20);
        boolean boolean24 = board23.moveUp();
        boolean boolean25 = deterministicPlacement2.addTile(board23);
        boolean boolean26 = board23.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str17, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(placementStrategy20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean2 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = cell4.mergeWith(cell6);
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell10 = cell1.mergeWith(cell6);
        int int11 = cell1.getValue();
        java.lang.String str12 = cell1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        boolean boolean12 = board6.moveLeft();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement14 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement14);
        ar.edu.unrc.game2048.Position position18 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean19 = board15.equals((java.lang.Object) position18);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy20 = board15.getStrategy();
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell25 = cell22.mergeWith(cell24);
        java.lang.String str26 = cell22.toString();
        java.lang.Class<?> wildcardClass27 = cell22.getClass();
        boolean boolean28 = board15.equals((java.lang.Object) cell22);
        boolean boolean29 = board15.isLosingBoard();
        boolean boolean30 = board15.isLosingBoard();
        boolean boolean31 = board15.hasEmptyCells();
        boolean boolean32 = board6.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(placementStrategy20);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4" + "'", str26, "4");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        java.lang.String str11 = board2.toString();
        boolean boolean12 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        java.lang.String str7 = position5.toString();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = cell15.mergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell19 = cell9.mergeWith(cell15);
        java.lang.String str20 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell25 = cell22.mergeWith(cell24);
        boolean boolean26 = cell22.isEmpty();
        boolean boolean27 = cell15.canMergeWith(cell22);
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell31 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell32 = cell29.mergeWith(cell31);
        ar.edu.unrc.game2048.Cell cell34 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell36 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell37 = cell34.mergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell38 = cell31.mergeWith(cell36);
        boolean boolean39 = cell22.equals((java.lang.Object) cell38);
        boolean boolean40 = position5.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(1, 10)" + "'", str7, "(1, 10)");
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '4', 2048);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        ar.edu.unrc.game2048.Position position7 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int8 = position7.row;
        int int9 = position7.col;
        boolean boolean10 = position2.equals((java.lang.Object) position7);
        int int11 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 0, 52);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '#', 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        int int9 = board3.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board3.getEmptyPositions();
        java.lang.String str11 = board3.toString();
        boolean boolean12 = board3.isLosingBoard();
        int int13 = board3.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy14);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = board15.getStrategy();
        boolean boolean17 = board15.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = board15.getCell((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertNotNull(placementStrategy16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = cell11.mergeWith(cell13);
        java.lang.Class<?> wildcardClass15 = cell11.getClass();
        boolean boolean16 = board2.equals((java.lang.Object) cell11);
        int int17 = board2.getSize();
        boolean boolean18 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean2 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = cell4.mergeWith(cell6);
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell10 = cell1.mergeWith(cell6);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean13 = cell12.isEmpty();
        boolean boolean14 = cell12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = cell10.mergeWith(cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '4', 8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getScore();
        boolean boolean9 = board2.moveRight();
        int int10 = board2.getSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean5 = board2.moveLeft();
        boolean boolean6 = board2.isFull();
        java.lang.String str7 = board2.toString();
        java.lang.String str8 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str7, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = cell15.mergeWith(cell17);
        java.lang.String str19 = cell17.toString();
        boolean boolean20 = cell17.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement22 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement22);
        boolean boolean24 = board23.moveLeft();
        boolean boolean25 = board23.moveLeft();
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean28 = cell27.isEmpty();
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell32 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell33 = cell30.mergeWith(cell32);
        java.lang.String str34 = cell32.toString();
        boolean boolean35 = cell32.isEmpty();
        ar.edu.unrc.game2048.Cell cell36 = cell27.mergeWith(cell32);
        boolean boolean37 = board23.equals((java.lang.Object) cell27);
        ar.edu.unrc.game2048.Cell cell38 = cell17.mergeWith(cell27);
        ar.edu.unrc.game2048.Cell cell40 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell42 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell43 = cell40.mergeWith(cell42);
        boolean boolean44 = cell38.equals((java.lang.Object) cell43);
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell(10, (int) (byte) 10, cell38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 10) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4" + "'", str19, "4");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4" + "'", str34, "4");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        boolean boolean11 = board2.isFull();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy12 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(placementStrategy12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.moveLeft();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean14 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = cell16.mergeWith(cell18);
        java.lang.String str20 = cell18.toString();
        boolean boolean21 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell22 = cell13.mergeWith(cell18);
        boolean boolean23 = board9.equals((java.lang.Object) cell13);
        ar.edu.unrc.game2048.Cell cell24 = cell3.mergeWith(cell13);
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = cell26.mergeWith(cell28);
        boolean boolean30 = cell24.equals((java.lang.Object) cell29);
        int int31 = cell24.getValue();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        boolean boolean9 = board2.hasEmptyCells();
        boolean boolean10 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        int int12 = cell7.getValue();
        boolean boolean13 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean16 = cell15.isEmpty();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = cell18.mergeWith(cell20);
        java.lang.String str22 = cell20.toString();
        boolean boolean23 = cell20.isEmpty();
        ar.edu.unrc.game2048.Cell cell24 = cell15.mergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell25 = cell7.mergeWith(cell20);
        boolean boolean26 = cell20.isEmpty();
        int int27 = cell20.getValue();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(2048, 2048);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(2048, 2048)" + "'", str3, "(2048, 2048)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(2048, 2048)" + "'", str4, "(2048, 2048)");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.isFull();
        int int4 = board2.getScore();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = cell8.mergeWith(cell10);
        java.lang.String str12 = cell11.toString();
        boolean boolean13 = cell11.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean16 = cell11.canMergeWith(cell15);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (byte) 0, 100, cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "8" + "'", str12, "8");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        java.lang.String str12 = cell7.toString();
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = cell14.mergeWith(cell16);
        boolean boolean18 = cell14.isEmpty();
        boolean boolean19 = cell7.canMergeWith(cell14);
        boolean boolean20 = cell14.isEmpty();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        ar.edu.unrc.game2048.Position position10 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean11 = board7.equals((java.lang.Object) position10);
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        java.lang.String str13 = position2.toString();
        int int14 = position2.col;
        java.lang.String str15 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 10)" + "'", str4, "(1, 10)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, 10)" + "'", str13, "(1, 10)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(1, 10)" + "'", str15, "(1, 10)");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        boolean boolean11 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(2048, (int) (short) 10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        ar.edu.unrc.game2048.Position position10 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean11 = board7.equals((java.lang.Object) position10);
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        java.lang.String str13 = position2.toString();
        int int14 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 10)" + "'", str4, "(1, 10)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, 10)" + "'", str13, "(1, 10)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board2.getEmptyPositions();
        boolean boolean12 = board2.moveUp();
        boolean boolean13 = board2.moveDown();
        boolean boolean14 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean9 = board6.moveLeft();
        boolean boolean10 = board6.isFull();
        java.lang.String str11 = board6.toString();
        boolean boolean12 = cell1.equals((java.lang.Object) str11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveUp();
        int int10 = board2.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board2.getCell(4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '4', 2048);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2048 + "'", int3 == 2048);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean2 = cell1.isEmpty();
        boolean boolean3 = cell1.isEmpty();
        int int4 = cell1.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be 0 or a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet5 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        boolean boolean13 = board2.equals((java.lang.Object) 100.0f);
        boolean boolean14 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int3 = position2.row;
        int int4 = position2.col;
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        ar.edu.unrc.game2048.Position position10 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean11 = board7.equals((java.lang.Object) position10);
        boolean boolean12 = board7.moveRight();
        int int13 = board7.getScore();
        boolean boolean14 = board7.moveRight();
        boolean boolean15 = position2.equals((java.lang.Object) board7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 0, 100);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.Class<?> wildcardClass5 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 100)" + "'", str4, "(0, 100)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        int int5 = board2.getSize();
        java.lang.String str6 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str6, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        boolean boolean14 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = cell18.mergeWith(cell20);
        java.lang.String str22 = cell18.toString();
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell27 = cell24.mergeWith(cell26);
        ar.edu.unrc.game2048.Cell cell28 = cell18.mergeWith(cell24);
        java.lang.String str29 = cell24.toString();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 100, (int) (short) -1, cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4" + "'", str29, "4");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveRight();
        boolean boolean10 = board2.moveDown();
        boolean boolean11 = board2.moveLeft();
        boolean boolean12 = board2.moveLeft();
        boolean boolean13 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.isWinningBoard();
        boolean boolean8 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        int int9 = board3.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board3.getEmptyPositions();
        java.lang.String str11 = board3.toString();
        boolean boolean12 = board3.isLosingBoard();
        int int13 = board3.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board3.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(0, placementStrategy14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(placementStrategy14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement9 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean10 = cell8.equals((java.lang.Object) deterministicPlacement9);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement12 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement12);
        ar.edu.unrc.game2048.Position position16 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean17 = board13.equals((java.lang.Object) position16);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy18 = board13.getStrategy();
        int int19 = board13.getScore();
        boolean boolean20 = board13.moveLeft();
        boolean boolean21 = deterministicPlacement9.addTile(board13);
        boolean boolean22 = board2.equals((java.lang.Object) deterministicPlacement9);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement24 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement24);
        ar.edu.unrc.game2048.Position position28 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean29 = board25.equals((java.lang.Object) position28);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy30 = board25.getStrategy();
        int int31 = board25.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet32 = board25.getEmptyPositions();
        java.lang.String str33 = board25.toString();
        boolean boolean34 = board25.moveUp();
        boolean boolean35 = deterministicPlacement9.addTile(board25);
        int int36 = board25.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(placementStrategy18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(placementStrategy30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str33, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = cell8.mergeWith(cell10);
        java.lang.String str12 = cell10.toString();
        boolean boolean13 = cell10.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement15 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement15);
        boolean boolean17 = board16.moveLeft();
        boolean boolean18 = board16.moveLeft();
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean21 = cell20.isEmpty();
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell25 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell26 = cell23.mergeWith(cell25);
        java.lang.String str27 = cell25.toString();
        boolean boolean28 = cell25.isEmpty();
        ar.edu.unrc.game2048.Cell cell29 = cell20.mergeWith(cell25);
        boolean boolean30 = board16.equals((java.lang.Object) cell20);
        ar.edu.unrc.game2048.Cell cell31 = cell10.mergeWith(cell20);
        boolean boolean32 = cell3.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell34 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell36 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell37 = cell34.mergeWith(cell36);
        java.lang.String str38 = cell34.toString();
        ar.edu.unrc.game2048.Cell cell40 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell42 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell43 = cell40.mergeWith(cell42);
        ar.edu.unrc.game2048.Cell cell44 = cell34.mergeWith(cell40);
        int int45 = cell40.getValue();
        int int46 = cell40.getValue();
        boolean boolean47 = cell10.canMergeWith(cell40);
        ar.edu.unrc.game2048.Position position50 = new ar.edu.unrc.game2048.Position((int) 'a', (int) (byte) 100);
        boolean boolean52 = position50.equals((java.lang.Object) (short) 100);
        ar.edu.unrc.game2048.Cell cell54 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell56 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell57 = cell54.mergeWith(cell56);
        boolean boolean58 = cell56.isEmpty();
        boolean boolean59 = position50.equals((java.lang.Object) cell56);
        ar.edu.unrc.game2048.Cell cell61 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell63 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell64 = cell61.mergeWith(cell63);
        ar.edu.unrc.game2048.Cell cell66 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell68 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell69 = cell66.mergeWith(cell68);
        ar.edu.unrc.game2048.Cell cell70 = cell63.mergeWith(cell68);
        boolean boolean71 = cell56.canMergeWith(cell70);
        ar.edu.unrc.game2048.Cell cell73 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell75 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell76 = cell73.mergeWith(cell75);
        ar.edu.unrc.game2048.Cell cell78 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell80 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell81 = cell78.mergeWith(cell80);
        java.lang.String str82 = cell78.toString();
        ar.edu.unrc.game2048.Cell cell84 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell86 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell87 = cell84.mergeWith(cell86);
        ar.edu.unrc.game2048.Cell cell88 = cell78.mergeWith(cell84);
        int int89 = cell84.getValue();
        boolean boolean90 = cell84.isEmpty();
        boolean boolean91 = cell76.canMergeWith(cell84);
        boolean boolean92 = cell56.canMergeWith(cell84);
        ar.edu.unrc.game2048.Cell cell93 = cell40.mergeWith(cell84);
        boolean boolean94 = cell84.isEmpty();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4" + "'", str27, "4");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4" + "'", str38, "4");
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertNotNull(cell69);
        org.junit.Assert.assertNotNull(cell70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(cell76);
        org.junit.Assert.assertNotNull(cell81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "4" + "'", str82, "4");
        org.junit.Assert.assertNotNull(cell87);
        org.junit.Assert.assertNotNull(cell88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 4 + "'", int89 == 4);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(cell93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        int int9 = board3.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board3.getEmptyPositions();
        java.lang.String str11 = board3.toString();
        boolean boolean12 = board3.isLosingBoard();
        int int13 = board3.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy14);
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell22 = cell19.mergeWith(cell21);
        java.lang.String str23 = cell22.toString();
        boolean boolean24 = cell22.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board15.setCell((int) 'a', 0, cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 0) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "8" + "'", str23, "8");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        boolean boolean5 = board3.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean6 = board3.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board3.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (byte) -1, placementStrategy7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.lang.String str8 = board2.toString();
        boolean boolean9 = board2.moveRight();
        boolean boolean10 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 52);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(2048, 4);
        boolean boolean4 = position2.equals((java.lang.Object) '4');
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        java.lang.String str4 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = cell6.mergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = cell11.mergeWith(cell13);
        ar.edu.unrc.game2048.Cell cell15 = cell8.mergeWith(cell13);
        int int16 = cell15.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = cell1.mergeWith(cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 4 and 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) -1, (int) (short) 10);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '4', 2048);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 2048)" + "'", str5, "(52, 2048)");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        java.lang.String str7 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell11.toString();
        java.lang.String str14 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell15 = cell3.mergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean18 = cell17.isEmpty();
        int int19 = cell17.getValue();
        boolean boolean20 = cell17.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell21 = cell15.mergeWith(cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int3 = position2.row;
        int int4 = position2.col;
        int int5 = position2.col;
        int int6 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.moveLeft();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean14 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = cell16.mergeWith(cell18);
        java.lang.String str20 = cell18.toString();
        boolean boolean21 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell22 = cell13.mergeWith(cell18);
        boolean boolean23 = board9.equals((java.lang.Object) cell13);
        ar.edu.unrc.game2048.Cell cell24 = cell3.mergeWith(cell13);
        boolean boolean25 = cell3.isEmpty();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        java.lang.String str5 = board2.toString();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        java.lang.String str12 = cell11.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "8" + "'", str12, "8");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '4', 2048);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, 2048)" + "'", str3, "(52, 2048)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 2048)" + "'", str4, "(52, 2048)");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        boolean boolean5 = board3.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (byte) 10, placementStrategy6);
        boolean boolean8 = board7.isFull();
        int int9 = board7.getScore();
        int int10 = board7.getSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.moveDown();
        boolean boolean11 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, (int) (short) 10);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(52, (int) (short) 1);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, 1)" + "'", str3, "(52, 1)");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        boolean boolean13 = board2.equals((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = board2.getCell((int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 52) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        int int12 = cell7.getValue();
        boolean boolean13 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean16 = cell15.isEmpty();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = cell18.mergeWith(cell20);
        java.lang.String str22 = cell20.toString();
        boolean boolean23 = cell20.isEmpty();
        ar.edu.unrc.game2048.Cell cell24 = cell15.mergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell25 = cell7.mergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell30 = cell27.mergeWith(cell29);
        boolean boolean31 = cell7.canMergeWith(cell30);
        ar.edu.unrc.game2048.Cell cell33 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell35 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell36 = cell33.mergeWith(cell35);
        int int37 = cell35.getValue();
        int int38 = cell35.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell39 = cell30.mergeWith(cell35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(2048, 4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        boolean boolean6 = board5.isFull();
        int int7 = board5.getScore();
        boolean boolean8 = position2.equals((java.lang.Object) int7);
        int int9 = position2.col;
        java.lang.String str10 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(2048, 4)" + "'", str10, "(2048, 4)");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean2 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = cell4.mergeWith(cell6);
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell10 = cell1.mergeWith(cell6);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = cell14.mergeWith(cell16);
        java.lang.String str18 = cell14.toString();
        boolean boolean19 = cell12.canMergeWith(cell14);
        int int20 = cell12.getValue();
        java.lang.String str21 = cell12.toString();
        boolean boolean22 = cell6.canMergeWith(cell12);
        java.lang.String str23 = cell6.toString();
        java.lang.String str24 = cell6.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4" + "'", str18, "4");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4" + "'", str21, "4");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        boolean boolean14 = board2.moveLeft();
        boolean boolean15 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveUp();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean7 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell11.toString();
        boolean boolean14 = cell11.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = cell6.mergeWith(cell11);
        boolean boolean16 = board2.equals((java.lang.Object) cell6);
        boolean boolean17 = board2.moveUp();
        boolean boolean18 = board2.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell21 = board2.getCell(4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 10) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        boolean boolean9 = board2.hasEmptyCells();
        boolean boolean10 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int3 = position2.row;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(1, 100)" + "'", str5, "(1, 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        boolean boolean8 = board7.moveLeft();
        boolean boolean9 = board7.isFull();
        boolean boolean10 = board7.moveDown();
        boolean boolean11 = board7.hasEmptyCells();
        boolean boolean12 = board7.isWinningBoard();
        boolean boolean13 = deterministicPlacement3.addTile(board7);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        boolean boolean15 = board14.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        int int9 = board3.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board3.getEmptyPositions();
        java.lang.String str11 = board3.toString();
        boolean boolean12 = board3.isLosingBoard();
        int int13 = board3.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy14);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = board15.getStrategy();
        java.lang.Class<?> wildcardClass17 = board15.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertNotNull(placementStrategy16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = cell13.mergeWith(cell15);
        java.lang.String str17 = cell13.toString();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(0, (int) (short) -1, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean2 = cell1.isEmpty();
        boolean boolean3 = cell1.isEmpty();
        java.lang.Class<?> wildcardClass4 = cell1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        boolean boolean11 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        java.lang.String str9 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str9, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        int int12 = board6.getScore();
        boolean boolean13 = board6.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        ar.edu.unrc.game2048.Position position8 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean9 = board5.equals((java.lang.Object) position8);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy10 = board5.getStrategy();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy10);
        boolean boolean12 = deterministicPlacement1.addTile(board11);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement14 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement14);
        ar.edu.unrc.game2048.Position position18 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean19 = board15.equals((java.lang.Object) position18);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy20 = board15.getStrategy();
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell25 = cell22.mergeWith(cell24);
        java.lang.String str26 = cell22.toString();
        java.lang.Class<?> wildcardClass27 = cell22.getClass();
        boolean boolean28 = board15.equals((java.lang.Object) cell22);
        boolean boolean29 = board15.isLosingBoard();
        boolean boolean30 = deterministicPlacement1.addTile(board15);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(placementStrategy10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(placementStrategy20);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4" + "'", str26, "4");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement9 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement9);
        ar.edu.unrc.game2048.Position position13 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean14 = board10.equals((java.lang.Object) position13);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = board10.getStrategy();
        int int16 = board10.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet17 = board10.getEmptyPositions();
        java.lang.String str18 = board10.toString();
        boolean boolean19 = board10.isLosingBoard();
        int int20 = board10.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy21 = board10.getStrategy();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(1, placementStrategy21);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(10, placementStrategy21);
        boolean boolean25 = board24.moveUp();
        boolean boolean26 = deterministicPlacement3.addTile(board24);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement28 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement28);
        ar.edu.unrc.game2048.Position position32 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean33 = board29.equals((java.lang.Object) position32);
        boolean boolean34 = board29.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy35 = board29.getStrategy();
        boolean boolean36 = deterministicPlacement3.addTile(board29);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) (short) -1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(placementStrategy15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str18, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(placementStrategy21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(placementStrategy35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        int int3 = position2.col;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.Position position7 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean8 = board4.equals((java.lang.Object) position7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board4.getStrategy();
        int int10 = board4.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board4.getEmptyPositions();
        java.lang.String str12 = board4.toString();
        boolean boolean13 = board4.isLosingBoard();
        int int14 = board4.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = board4.getStrategy();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean18 = board17.isFull();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet19 = board17.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str12, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(placementStrategy15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(positionSet19);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean6 = cell5.isEmpty();
        ar.edu.unrc.game2048.Cell cell7 = cell1.mergeWith(cell5);
        boolean boolean8 = cell5.isEmpty();
        java.lang.Class<?> wildcardClass9 = cell5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = board2.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board2.getCell(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(placementStrategy5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '4', 2048);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        java.lang.String str5 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, 2048)" + "'", str3, "(52, 2048)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 2048)" + "'", str5, "(52, 2048)");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean5 = board2.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board2.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet7 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board2.getCell((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 35) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str12 = cell11.toString();
        int int13 = cell11.getValue();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean16 = cell15.isEmpty();
        ar.edu.unrc.game2048.Cell cell17 = cell11.mergeWith(cell15);
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell22 = cell19.mergeWith(cell21);
        java.lang.String str23 = cell19.toString();
        ar.edu.unrc.game2048.Cell cell25 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell28 = cell25.mergeWith(cell27);
        ar.edu.unrc.game2048.Cell cell29 = cell19.mergeWith(cell25);
        java.lang.String str30 = cell25.toString();
        ar.edu.unrc.game2048.Cell cell31 = cell15.mergeWith(cell25);
        java.lang.String str32 = cell31.toString();
        boolean boolean33 = board2.equals((java.lang.Object) cell31);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4" + "'", str30, "4");
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "8" + "'", str32, "8");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        java.lang.String str5 = board2.toString();
        java.lang.String str6 = board2.toString();
        boolean boolean7 = board2.moveDown();
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str6, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.moveUp();
        boolean boolean11 = board2.isFull();
        boolean boolean12 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        boolean boolean14 = board2.moveLeft();
        int int15 = board2.getScore();
        boolean boolean16 = board2.isFull();
        int int17 = board2.getScore();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean5 = board2.moveLeft();
        boolean boolean6 = board2.isFull();
        boolean boolean7 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        int int3 = position2.col;
        boolean boolean5 = position2.equals((java.lang.Object) "(1, 100)");
        int int6 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        int int6 = board2.getSize();
        boolean boolean7 = board2.moveDown();
        int int8 = board2.getScore();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board2.getCell((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 35) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.isWinningBoard();
        boolean boolean8 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement9 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean10 = cell8.equals((java.lang.Object) deterministicPlacement9);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement12 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement12);
        ar.edu.unrc.game2048.Position position16 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean17 = board13.equals((java.lang.Object) position16);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy18 = board13.getStrategy();
        int int19 = board13.getScore();
        boolean boolean20 = board13.moveLeft();
        boolean boolean21 = deterministicPlacement9.addTile(board13);
        boolean boolean22 = board2.equals((java.lang.Object) deterministicPlacement9);
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement25 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean26 = cell24.equals((java.lang.Object) deterministicPlacement25);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement28 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement28);
        boolean boolean31 = board29.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int32 = board29.getSize();
        boolean boolean33 = board29.isLosingBoard();
        boolean boolean34 = deterministicPlacement25.addTile(board29);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement36 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement36);
        ar.edu.unrc.game2048.Position position40 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean41 = board37.equals((java.lang.Object) position40);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy42 = board37.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet43 = board37.getEmptyPositions();
        boolean boolean44 = board37.hasEmptyCells();
        boolean boolean45 = deterministicPlacement25.addTile(board37);
        boolean boolean46 = deterministicPlacement9.addTile(board37);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(placementStrategy18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(placementStrategy42);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.hasEmptyCells();
        boolean boolean10 = board2.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board2.getCell((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 10) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board2.getCell(2048, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        boolean boolean5 = board3.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (byte) 10, placementStrategy6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board7.getCell(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(placementStrategy6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(2048, 2048);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(2048, 2048)" + "'", str3, "(2048, 2048)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2048 + "'", int4 == 2048);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = cell4.mergeWith(cell6);
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = cell6.isEmpty();
        boolean boolean10 = board2.equals((java.lang.Object) boolean9);
        boolean boolean11 = board2.moveDown();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        int int6 = board2.getSize();
        boolean boolean7 = board2.moveDown();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean2 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = cell4.mergeWith(cell6);
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell10 = cell1.mergeWith(cell6);
        java.lang.String str11 = cell1.toString();
        boolean boolean13 = cell1.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        boolean boolean13 = board2.isFull();
        boolean boolean14 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = cell3.mergeWith(cell5);
        java.lang.String str7 = cell3.toString();
        boolean boolean8 = cell1.canMergeWith(cell3);
        int int9 = cell1.getValue();
        int int10 = cell1.getValue();
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(0, (int) '#');
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean5 = board2.moveLeft();
        boolean boolean6 = board2.isFull();
        java.lang.String str7 = board2.toString();
        boolean boolean8 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str7, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        ar.edu.unrc.game2048.Position position10 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean11 = board7.equals((java.lang.Object) position10);
        boolean boolean12 = position2.equals((java.lang.Object) boolean11);
        int int13 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 10)" + "'", str4, "(1, 10)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        ar.edu.unrc.game2048.Position position9 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean10 = board6.equals((java.lang.Object) position9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy11 = board6.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet12 = board6.getEmptyPositions();
        boolean boolean13 = board6.moveRight();
        boolean boolean14 = board6.moveDown();
        boolean boolean15 = board6.moveLeft();
        boolean boolean16 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(placementStrategy11);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        int int6 = board2.getSize();
        boolean boolean7 = board2.moveDown();
        boolean boolean8 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        boolean boolean5 = cell3.isEmpty();
        boolean boolean6 = cell3.isEmpty();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.isFull();
        boolean boolean4 = board2.isLosingBoard();
        java.lang.String str5 = board2.toString();
        boolean boolean6 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        ar.edu.unrc.game2048.Position position12 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean13 = board9.equals((java.lang.Object) position12);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board9.getStrategy();
        int int15 = board9.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet16 = board9.getEmptyPositions();
        boolean boolean17 = board2.equals((java.lang.Object) positionSet16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean1 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str4 = cell3.toString();
        int int5 = cell3.getValue();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean8 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell9 = cell3.mergeWith(cell7);
        boolean boolean10 = cell0.canMergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = cell12.mergeWith(cell14);
        java.lang.String str16 = cell12.toString();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = cell18.mergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell22 = cell12.mergeWith(cell18);
        int int23 = cell18.getValue();
        boolean boolean24 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean27 = cell26.isEmpty();
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell31 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell32 = cell29.mergeWith(cell31);
        java.lang.String str33 = cell31.toString();
        boolean boolean34 = cell31.isEmpty();
        ar.edu.unrc.game2048.Cell cell35 = cell26.mergeWith(cell31);
        ar.edu.unrc.game2048.Cell cell36 = cell18.mergeWith(cell31);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement39 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement39);
        ar.edu.unrc.game2048.Position position43 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean44 = board40.equals((java.lang.Object) position43);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy45 = board40.getStrategy();
        int int46 = board40.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet47 = board40.getEmptyPositions();
        java.lang.String str48 = board40.toString();
        boolean boolean49 = board40.isLosingBoard();
        int int50 = board40.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy51 = board40.getStrategy();
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy51);
        boolean boolean53 = board52.moveLeft();
        boolean boolean54 = cell36.equals((java.lang.Object) boolean53);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell55 = cell0.mergeWith(cell36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4" + "'", str16, "4");
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4" + "'", str33, "4");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(placementStrategy45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(positionSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str48, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(placementStrategy51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.isFull();
        java.lang.String str11 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        int int3 = position2.col;
        int int4 = position2.row;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell4.toString();
        int int6 = cell4.getValue();
        boolean boolean7 = cell4.isEmpty();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8" + "'", str5, "8");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveRight();
        boolean boolean10 = board2.moveDown();
        boolean boolean11 = board2.moveLeft();
        java.lang.String str12 = board2.toString();
        boolean boolean13 = board2.hasEmptyCells();
        int int14 = board2.getSize();
        boolean boolean15 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str12, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell8 = cell5.mergeWith(cell7);
        boolean boolean9 = cell8.isEmpty();
        boolean boolean10 = position2.equals((java.lang.Object) cell8);
        java.lang.Class<?> wildcardClass11 = cell8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 1)" + "'", str3, "(10, 1)");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        ar.edu.unrc.game2048.Position position9 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean10 = board6.equals((java.lang.Object) position9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy11 = board6.getStrategy();
        int int12 = board6.getScore();
        boolean boolean13 = board6.moveLeft();
        boolean boolean14 = deterministicPlacement2.addTile(board6);
        boolean boolean15 = board6.isFull();
        boolean boolean16 = board6.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(placementStrategy11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.moveDown();
        int int11 = board2.getSize();
        boolean boolean12 = board2.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(placementStrategy13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = cell8.mergeWith(cell10);
        java.lang.String str12 = cell10.toString();
        boolean boolean13 = cell10.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement15 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement15);
        boolean boolean17 = board16.moveLeft();
        boolean boolean18 = board16.moveLeft();
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean21 = cell20.isEmpty();
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell25 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell26 = cell23.mergeWith(cell25);
        java.lang.String str27 = cell25.toString();
        boolean boolean28 = cell25.isEmpty();
        ar.edu.unrc.game2048.Cell cell29 = cell20.mergeWith(cell25);
        boolean boolean30 = board16.equals((java.lang.Object) cell20);
        ar.edu.unrc.game2048.Cell cell31 = cell10.mergeWith(cell20);
        boolean boolean32 = cell3.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell34 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell36 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell37 = cell34.mergeWith(cell36);
        java.lang.String str38 = cell34.toString();
        ar.edu.unrc.game2048.Cell cell40 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell42 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell43 = cell40.mergeWith(cell42);
        ar.edu.unrc.game2048.Cell cell44 = cell34.mergeWith(cell40);
        int int45 = cell40.getValue();
        int int46 = cell40.getValue();
        boolean boolean47 = cell10.canMergeWith(cell40);
        java.lang.String str48 = cell10.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4" + "'", str27, "4");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4" + "'", str38, "4");
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "4" + "'", str48, "4");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2048);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(2048, 4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        boolean boolean6 = board5.isFull();
        int int7 = board5.getScore();
        boolean boolean8 = position2.equals((java.lang.Object) int7);
        int int9 = position2.col;
        int int10 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2048 + "'", int10 == 2048);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean7 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell11.toString();
        boolean boolean14 = cell11.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = cell6.mergeWith(cell11);
        boolean boolean16 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement18 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement18);
        boolean boolean20 = board19.isFull();
        int int21 = board19.getScore();
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement24 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean25 = cell23.equals((java.lang.Object) deterministicPlacement24);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement27 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement27);
        boolean boolean29 = board28.moveLeft();
        boolean boolean30 = board28.isFull();
        boolean boolean31 = board28.moveDown();
        boolean boolean32 = board28.hasEmptyCells();
        boolean boolean33 = board28.isWinningBoard();
        boolean boolean34 = deterministicPlacement24.addTile(board28);
        boolean boolean35 = board19.equals((java.lang.Object) boolean34);
        boolean boolean36 = board2.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        boolean boolean5 = board4.moveLeft();
        boolean boolean6 = board4.moveLeft();
        boolean boolean7 = board4.moveUp();
        boolean boolean8 = board4.isLosingBoard();
        boolean boolean9 = board4.isWinningBoard();
        boolean boolean10 = cell1.equals((java.lang.Object) board4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = cell4.mergeWith(cell6);
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = cell6.isEmpty();
        boolean boolean10 = board2.equals((java.lang.Object) boolean9);
        boolean boolean11 = board2.isLosingBoard();
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        ar.edu.unrc.game2048.Position position10 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean11 = board7.equals((java.lang.Object) position10);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy12 = board7.getStrategy();
        int int13 = board7.getScore();
        boolean boolean14 = board7.moveLeft();
        boolean boolean15 = deterministicPlacement3.addTile(board7);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (byte) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(placementStrategy12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.Position position7 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean8 = board4.equals((java.lang.Object) position7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board4.getStrategy();
        int int10 = board4.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board4.getEmptyPositions();
        java.lang.String str12 = board4.toString();
        boolean boolean13 = board4.isLosingBoard();
        int int14 = board4.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = board4.getStrategy();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) 'a', placementStrategy15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str12, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(placementStrategy15);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell9.toString();
        java.lang.Class<?> wildcardClass14 = cell9.getClass();
        boolean boolean15 = board2.equals((java.lang.Object) cell9);
        boolean boolean16 = board2.isLosingBoard();
        boolean boolean17 = board2.isLosingBoard();
        boolean boolean18 = board2.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet19 = board2.getEmptyPositions();
        boolean boolean20 = board2.moveRight();
        boolean boolean21 = board2.moveDown();
        boolean boolean23 = board2.equals((java.lang.Object) "(2048, 2048)");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet14 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertNotNull(positionSet14);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        boolean boolean11 = board2.isWinningBoard();
        boolean boolean12 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy8);
        boolean boolean10 = board9.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '#', (int) (byte) -1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        ar.edu.unrc.game2048.Position position12 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean13 = board9.equals((java.lang.Object) position12);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board9.getStrategy();
        int int15 = board9.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet16 = board9.getEmptyPositions();
        java.lang.String str17 = board9.toString();
        boolean boolean18 = board9.isLosingBoard();
        int int19 = board9.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy20 = board9.getStrategy();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(1, placementStrategy20);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(10, placementStrategy20);
        boolean boolean24 = board23.moveUp();
        boolean boolean25 = deterministicPlacement2.addTile(board23);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement27 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement27);
        ar.edu.unrc.game2048.Position position31 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean32 = board28.equals((java.lang.Object) position31);
        boolean boolean33 = board28.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy34 = board28.getStrategy();
        boolean boolean35 = deterministicPlacement2.addTile(board28);
        java.lang.Class<?> wildcardClass36 = deterministicPlacement2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str17, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(placementStrategy20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(placementStrategy34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 0, 10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board2.getCell(52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean6 = cell5.isEmpty();
        ar.edu.unrc.game2048.Cell cell7 = cell1.mergeWith(cell5);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = cell15.mergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell19 = cell9.mergeWith(cell15);
        java.lang.String str20 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell21 = cell5.mergeWith(cell15);
        int int22 = cell5.getValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.isFull();
        boolean boolean11 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        java.lang.String str7 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell11.toString();
        java.lang.String str14 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell15 = cell3.mergeWith(cell11);
        int int16 = cell11.getValue();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement7 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement7);
        boolean boolean10 = board8.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        java.lang.String str11 = board8.toString();
        boolean boolean12 = board8.hasEmptyCells();
        boolean boolean13 = position2.equals((java.lang.Object) board8);
        boolean boolean14 = board8.moveLeft();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 100)" + "'", str4, "(1, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.moveUp();
        boolean boolean11 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        boolean boolean8 = board7.moveLeft();
        boolean boolean9 = board7.isFull();
        boolean boolean10 = board7.moveDown();
        boolean boolean11 = board7.hasEmptyCells();
        boolean boolean12 = board7.isWinningBoard();
        boolean boolean13 = deterministicPlacement3.addTile(board7);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement16 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement16);
        boolean boolean18 = board17.isFull();
        boolean boolean19 = board17.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet20 = board17.getEmptyPositions();
        boolean boolean21 = deterministicPlacement3.addTile(board17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean6 = cell5.isEmpty();
        ar.edu.unrc.game2048.Cell cell7 = cell1.mergeWith(cell5);
        java.lang.String str8 = cell1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        boolean boolean9 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = cell14.mergeWith(cell16);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 0, (int) '4', cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 52) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(cell17);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet20 = board14.getEmptyPositions();
        boolean boolean21 = board14.hasEmptyCells();
        boolean boolean22 = deterministicPlacement2.addTile(board14);
        int int23 = board14.getSize();
        boolean boolean24 = board14.isFull();
        int int25 = board14.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        int int6 = board2.getSize();
        boolean boolean7 = board2.isFull();
        boolean boolean8 = board2.hasEmptyCells();
        java.lang.String str9 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str9, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveUp();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.hasEmptyCells();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '4', 2048);
        boolean boolean4 = position2.equals((java.lang.Object) 10.0f);
        ar.edu.unrc.game2048.Position position7 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int8 = position7.row;
        int int9 = position7.col;
        boolean boolean10 = position2.equals((java.lang.Object) position7);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement12 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement12);
        boolean boolean14 = board13.isFull();
        boolean boolean15 = board13.isLosingBoard();
        java.lang.String str16 = board13.toString();
        boolean boolean17 = position2.equals((java.lang.Object) str16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str16, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.moveLeft();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean14 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = cell16.mergeWith(cell18);
        java.lang.String str20 = cell18.toString();
        boolean boolean21 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell22 = cell13.mergeWith(cell18);
        boolean boolean23 = board9.equals((java.lang.Object) cell13);
        ar.edu.unrc.game2048.Cell cell24 = cell3.mergeWith(cell13);
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = cell26.mergeWith(cell28);
        java.lang.String str30 = cell26.toString();
        ar.edu.unrc.game2048.Cell cell32 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell34 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell35 = cell32.mergeWith(cell34);
        ar.edu.unrc.game2048.Cell cell36 = cell26.mergeWith(cell32);
        java.lang.String str37 = cell32.toString();
        ar.edu.unrc.game2048.Cell cell39 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell41 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell42 = cell39.mergeWith(cell41);
        boolean boolean43 = cell39.isEmpty();
        boolean boolean44 = cell32.canMergeWith(cell39);
        boolean boolean45 = cell13.canMergeWith(cell32);
        java.lang.String str46 = cell13.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4" + "'", str30, "4");
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "4" + "'", str37, "4");
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "4" + "'", str46, "4");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = cell6.mergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell10 = cell3.mergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = cell12.mergeWith(cell14);
        int int16 = cell14.getValue();
        boolean boolean17 = cell8.equals((java.lang.Object) int16);
        int int18 = cell8.getValue();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isFull();
        boolean boolean9 = board2.moveDown();
        boolean boolean10 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board2.getEmptyPositions();
        boolean boolean12 = board2.moveUp();
        boolean boolean13 = board2.hasEmptyCells();
        boolean boolean14 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.moveUp();
        int int12 = board2.getSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.isFull();
        int int4 = board2.getScore();
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement7 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean8 = cell6.equals((java.lang.Object) deterministicPlacement7);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement10 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement10);
        boolean boolean12 = board11.moveLeft();
        boolean boolean13 = board11.isFull();
        boolean boolean14 = board11.moveDown();
        boolean boolean15 = board11.hasEmptyCells();
        boolean boolean16 = board11.isWinningBoard();
        boolean boolean17 = deterministicPlacement7.addTile(board11);
        boolean boolean18 = board2.equals((java.lang.Object) boolean17);
        boolean boolean19 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = cell8.mergeWith(cell10);
        java.lang.String str12 = cell11.toString();
        int int13 = cell11.getValue();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = cell15.mergeWith(cell17);
        java.lang.String str19 = cell17.toString();
        boolean boolean20 = cell17.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement22 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement22);
        boolean boolean24 = board23.moveLeft();
        boolean boolean25 = board23.moveLeft();
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean28 = cell27.isEmpty();
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell32 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell33 = cell30.mergeWith(cell32);
        java.lang.String str34 = cell32.toString();
        boolean boolean35 = cell32.isEmpty();
        ar.edu.unrc.game2048.Cell cell36 = cell27.mergeWith(cell32);
        boolean boolean37 = board23.equals((java.lang.Object) cell27);
        ar.edu.unrc.game2048.Cell cell38 = cell17.mergeWith(cell27);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement41 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement41);
        ar.edu.unrc.game2048.Position position45 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean46 = board42.equals((java.lang.Object) position45);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy47 = board42.getStrategy();
        int int48 = board42.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet49 = board42.getEmptyPositions();
        java.lang.String str50 = board42.toString();
        boolean boolean51 = board42.isLosingBoard();
        int int52 = board42.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy53 = board42.getStrategy();
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy53);
        boolean boolean55 = cell38.equals((java.lang.Object) board54);
        ar.edu.unrc.game2048.Cell cell57 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str58 = cell57.toString();
        int int59 = cell57.getValue();
        ar.edu.unrc.game2048.Cell cell61 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean62 = cell61.isEmpty();
        ar.edu.unrc.game2048.Cell cell63 = cell57.mergeWith(cell61);
        ar.edu.unrc.game2048.Cell cell65 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell67 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell68 = cell65.mergeWith(cell67);
        java.lang.String str69 = cell65.toString();
        ar.edu.unrc.game2048.Cell cell71 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell73 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell74 = cell71.mergeWith(cell73);
        ar.edu.unrc.game2048.Cell cell75 = cell65.mergeWith(cell71);
        java.lang.String str76 = cell71.toString();
        ar.edu.unrc.game2048.Cell cell77 = cell61.mergeWith(cell71);
        boolean boolean78 = cell38.canMergeWith(cell61);
        boolean boolean79 = cell11.canMergeWith(cell38);
        boolean boolean80 = cell3.canMergeWith(cell38);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "8" + "'", str12, "8");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4" + "'", str19, "4");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4" + "'", str34, "4");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(placementStrategy47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(positionSet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str50, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(placementStrategy53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4" + "'", str58, "4");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(cell63);
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "4" + "'", str69, "4");
        org.junit.Assert.assertNotNull(cell74);
        org.junit.Assert.assertNotNull(cell75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "4" + "'", str76, "4");
        org.junit.Assert.assertNotNull(cell77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveUp();
        boolean boolean10 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1);
        int int2 = cell1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        java.lang.String str5 = board2.toString();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet6 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet7 = board2.getEmptyPositions();
        boolean boolean8 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean7 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell11.toString();
        boolean boolean14 = cell11.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = cell6.mergeWith(cell11);
        boolean boolean16 = board2.equals((java.lang.Object) cell6);
        boolean boolean17 = board2.moveUp();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean20 = board2.equals((java.lang.Object) 4);
        int int21 = board2.getScore();
        boolean boolean22 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        int int9 = board3.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board3.getEmptyPositions();
        java.lang.String str11 = board3.toString();
        boolean boolean12 = board3.isLosingBoard();
        int int13 = board3.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 100, placementStrategy14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(placementStrategy14);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        int int4 = board2.getScore();
        boolean boolean5 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        int int12 = board6.getScore();
        java.lang.Class<?> wildcardClass13 = board6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        java.lang.String str6 = cell3.toString();
        ar.edu.unrc.game2048.Position position9 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        int int10 = position9.col;
        int int11 = position9.row;
        boolean boolean12 = cell3.equals((java.lang.Object) position9);
        int int13 = position9.row;
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        ar.edu.unrc.game2048.Position position8 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean9 = board5.equals((java.lang.Object) position8);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy10 = board5.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board5.getEmptyPositions();
        boolean boolean12 = board5.moveRight();
        boolean boolean13 = board5.moveDown();
        boolean boolean14 = board5.moveLeft();
        boolean boolean15 = deterministicPlacement1.addTile(board5);
        boolean boolean16 = board5.moveRight();
        java.lang.String str17 = board5.toString();
        boolean boolean18 = board5.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(placementStrategy10);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str17, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, (int) (short) 1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 0, 100);
        java.lang.Class<?> wildcardClass6 = position5.getClass();
        boolean boolean7 = position2.equals((java.lang.Object) wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        ar.edu.unrc.game2048.Cell cell13 = board2.getCell(0, (int) (byte) 0);
        boolean boolean14 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveUp();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board2.getStrategy();
        java.lang.String str9 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str9, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.lang.String str8 = board2.toString();
        boolean boolean9 = board2.moveUp();
        int int10 = board2.getScore();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2048, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.moveLeft();
        boolean boolean11 = board2.moveUp();
        int int12 = board2.getScore();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.lang.String str8 = board2.toString();
        java.lang.String str9 = board2.toString();
        boolean boolean10 = board2.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board2.getCell(4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str9, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        ar.edu.unrc.game2048.Position position12 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean13 = board9.equals((java.lang.Object) position12);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board9.getStrategy();
        int int15 = board9.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet16 = board9.getEmptyPositions();
        java.lang.String str17 = board9.toString();
        boolean boolean18 = board9.isLosingBoard();
        int int19 = board9.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy20 = board9.getStrategy();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(1, placementStrategy20);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(10, placementStrategy20);
        boolean boolean24 = board23.moveUp();
        boolean boolean25 = deterministicPlacement2.addTile(board23);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement27 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement27);
        ar.edu.unrc.game2048.Position position31 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean32 = board28.equals((java.lang.Object) position31);
        boolean boolean33 = board28.moveRight();
        boolean boolean34 = board28.isWinningBoard();
        boolean boolean35 = board28.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet36 = board28.getEmptyPositions();
        boolean boolean37 = board28.isFull();
        boolean boolean38 = board23.equals((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str17, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(placementStrategy20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        ar.edu.unrc.game2048.Position position9 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean10 = board6.equals((java.lang.Object) position9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy11 = board6.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet12 = board6.getEmptyPositions();
        boolean boolean13 = board6.moveRight();
        boolean boolean14 = board6.moveDown();
        boolean boolean15 = board6.moveLeft();
        boolean boolean16 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy17 = board6.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) (byte) 0, placementStrategy17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(placementStrategy11);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(placementStrategy17);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        boolean boolean5 = cell3.isEmpty();
        java.lang.String str6 = cell3.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(10, (int) (short) 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        ar.edu.unrc.game2048.Position position8 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean9 = board5.equals((java.lang.Object) position8);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy10 = board5.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board5.getEmptyPositions();
        boolean boolean12 = board5.moveRight();
        boolean boolean13 = board5.moveDown();
        boolean boolean14 = board5.moveLeft();
        boolean boolean15 = deterministicPlacement1.addTile(board5);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean18 = cell17.isEmpty();
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell23 = cell20.mergeWith(cell22);
        java.lang.String str24 = cell22.toString();
        boolean boolean25 = cell22.isEmpty();
        ar.edu.unrc.game2048.Cell cell26 = cell17.mergeWith(cell22);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement28 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement28);
        ar.edu.unrc.game2048.Position position32 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean33 = board29.equals((java.lang.Object) position32);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy34 = board29.getStrategy();
        boolean boolean35 = board29.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet36 = board29.getEmptyPositions();
        boolean boolean37 = cell26.equals((java.lang.Object) board29);
        boolean boolean38 = deterministicPlacement1.addTile(board29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(placementStrategy10);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(placementStrategy34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        boolean boolean14 = board2.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet15 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet15);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement9 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean10 = cell8.equals((java.lang.Object) deterministicPlacement9);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement12 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement12);
        ar.edu.unrc.game2048.Position position16 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean17 = board13.equals((java.lang.Object) position16);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy18 = board13.getStrategy();
        int int19 = board13.getScore();
        boolean boolean20 = board13.moveLeft();
        boolean boolean21 = deterministicPlacement9.addTile(board13);
        boolean boolean22 = board2.equals((java.lang.Object) deterministicPlacement9);
        boolean boolean23 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(placementStrategy18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        boolean boolean5 = cell4.isEmpty();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell4.isEmpty();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement10 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean11 = cell9.equals((java.lang.Object) deterministicPlacement10);
        java.lang.String str12 = cell9.toString();
        boolean boolean13 = cell4.equals((java.lang.Object) cell9);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8" + "'", str6, "8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.isFull();
        boolean boolean4 = board2.isLosingBoard();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(placementStrategy5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.isFull();
        boolean boolean11 = board2.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet12 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        boolean boolean14 = board2.isFull();
        boolean boolean15 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = cell12.mergeWith(cell14);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = cell17.mergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = cell14.mergeWith(cell19);
        boolean boolean22 = board2.equals((java.lang.Object) cell21);
        boolean boolean23 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveRight();
        boolean boolean10 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell4.toString();
        boolean boolean6 = cell4.isEmpty();
        boolean boolean7 = cell4.isEmpty();
        boolean boolean8 = cell4.isEmpty();
        java.lang.Class<?> wildcardClass9 = cell4.getClass();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8" + "'", str5, "8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean5 = board2.moveLeft();
        boolean boolean6 = board2.isFull();
        java.lang.String str7 = board2.toString();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement9 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement9);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement12 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement12);
        ar.edu.unrc.game2048.Position position16 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean17 = board13.equals((java.lang.Object) position16);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy18 = board13.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet19 = board13.getEmptyPositions();
        boolean boolean20 = board13.moveRight();
        boolean boolean21 = board13.moveDown();
        boolean boolean22 = board13.moveLeft();
        boolean boolean23 = deterministicPlacement9.addTile(board13);
        boolean boolean24 = board13.moveLeft();
        boolean boolean25 = board2.equals((java.lang.Object) boolean24);
        ar.edu.unrc.game2048.Position position28 = new ar.edu.unrc.game2048.Position((int) (byte) -1, (int) (short) 10);
        boolean boolean29 = board2.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str7, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(placementStrategy18);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell4.toString();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement9 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement9);
        ar.edu.unrc.game2048.Position position13 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean14 = board10.equals((java.lang.Object) position13);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = board10.getStrategy();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy15);
        boolean boolean17 = deterministicPlacement6.addTile(board16);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement19 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement19);
        ar.edu.unrc.game2048.Position position23 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean24 = board20.equals((java.lang.Object) position23);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy25 = board20.getStrategy();
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell30 = cell27.mergeWith(cell29);
        java.lang.String str31 = cell27.toString();
        java.lang.Class<?> wildcardClass32 = cell27.getClass();
        boolean boolean33 = board20.equals((java.lang.Object) cell27);
        boolean boolean34 = board20.isLosingBoard();
        boolean boolean35 = deterministicPlacement6.addTile(board20);
        boolean boolean36 = board20.isLosingBoard();
        boolean boolean37 = cell4.equals((java.lang.Object) boolean36);
        int int38 = cell4.getValue();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8" + "'", str5, "8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(placementStrategy15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(placementStrategy25);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4" + "'", str31, "4");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(2048, 2048);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2048 + "'", int3 == 2048);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement9 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean10 = cell8.equals((java.lang.Object) deterministicPlacement9);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement12 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement12);
        ar.edu.unrc.game2048.Position position16 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean17 = board13.equals((java.lang.Object) position16);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy18 = board13.getStrategy();
        int int19 = board13.getScore();
        boolean boolean20 = board13.moveLeft();
        boolean boolean21 = deterministicPlacement9.addTile(board13);
        boolean boolean22 = board2.equals((java.lang.Object) deterministicPlacement9);
        boolean boolean23 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(placementStrategy18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        int int3 = position2.col;
        int int4 = position2.row;
        java.lang.String str5 = position2.toString();
        boolean boolean7 = position2.equals((java.lang.Object) 10L);
        int int8 = position2.col;
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement10 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement10);
        ar.edu.unrc.game2048.Position position14 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean15 = board11.equals((java.lang.Object) position14);
        boolean boolean16 = board11.moveUp();
        int int17 = board11.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet18 = board11.getEmptyPositions();
        boolean boolean19 = position2.equals((java.lang.Object) positionSet18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(10, 1)" + "'", str5, "(10, 1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        java.lang.String str11 = board2.toString();
        boolean boolean12 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        boolean boolean4 = board3.moveLeft();
        boolean boolean5 = board3.moveLeft();
        boolean boolean6 = board3.moveUp();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) '#', placementStrategy7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.isFull();
        int int4 = board2.getScore();
        boolean boolean5 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet20 = board14.getEmptyPositions();
        boolean boolean21 = board14.hasEmptyCells();
        boolean boolean22 = deterministicPlacement2.addTile(board14);
        int int23 = board14.getSize();
        boolean boolean24 = board14.isFull();
        boolean boolean25 = board14.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        boolean boolean5 = board2.moveUp();
        boolean boolean6 = board2.isLosingBoard();
        boolean boolean7 = board2.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        int int6 = board2.getSize();
        boolean boolean7 = board2.moveDown();
        boolean boolean8 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        int int12 = cell7.getValue();
        boolean boolean13 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = cell15.mergeWith(cell17);
        java.lang.String str19 = cell18.toString();
        boolean boolean20 = cell18.isEmpty();
        boolean boolean21 = cell18.isEmpty();
        boolean boolean22 = cell7.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
        boolean boolean25 = cell7.canMergeWith(cell24);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "8" + "'", str19, "8");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.Position position7 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean8 = board4.equals((java.lang.Object) position7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board4.getStrategy();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy9);
        boolean boolean11 = deterministicPlacement0.addTile(board10);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell24 = cell21.mergeWith(cell23);
        java.lang.String str25 = cell21.toString();
        java.lang.Class<?> wildcardClass26 = cell21.getClass();
        boolean boolean27 = board14.equals((java.lang.Object) cell21);
        boolean boolean28 = board14.isLosingBoard();
        boolean boolean29 = deterministicPlacement0.addTile(board14);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement31 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement31);
        boolean boolean33 = board32.moveLeft();
        boolean boolean34 = board32.moveLeft();
        boolean boolean35 = board32.isLosingBoard();
        int int36 = board32.getSize();
        boolean boolean37 = board32.hasEmptyCells();
        boolean boolean38 = board32.isLosingBoard();
        boolean boolean39 = deterministicPlacement0.addTile(board32);
        int int40 = board32.getScore();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4" + "'", str25, "4");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        int int12 = cell7.getValue();
        boolean boolean13 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean16 = cell15.isEmpty();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = cell18.mergeWith(cell20);
        java.lang.String str22 = cell20.toString();
        boolean boolean23 = cell20.isEmpty();
        ar.edu.unrc.game2048.Cell cell24 = cell15.mergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell25 = cell7.mergeWith(cell20);
        java.lang.String str26 = cell25.toString();
        boolean boolean27 = cell25.isEmpty();
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell31 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell32 = cell29.mergeWith(cell31);
        java.lang.String str33 = cell31.toString();
        boolean boolean34 = cell31.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell35 = cell25.mergeWith(cell31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "8" + "'", str26, "8");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4" + "'", str33, "4");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.lang.String str8 = board2.toString();
        java.lang.String str9 = board2.toString();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str9, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        boolean boolean5 = board2.moveUp();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board2.getStrategy();
        boolean boolean7 = board2.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        java.lang.String str6 = cell3.toString();
        boolean boolean7 = cell3.isEmpty();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board2.getEmptyPositions();
        boolean boolean12 = board2.moveUp();
        boolean boolean13 = board2.hasEmptyCells();
        boolean boolean14 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean8 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = cell10.mergeWith(cell12);
        java.lang.String str14 = cell12.toString();
        boolean boolean15 = cell12.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = cell7.mergeWith(cell12);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell23 = cell20.mergeWith(cell22);
        java.lang.String str24 = cell20.toString();
        boolean boolean25 = cell18.canMergeWith(cell20);
        int int26 = cell18.getValue();
        java.lang.String str27 = cell18.toString();
        boolean boolean28 = cell12.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell32 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell33 = cell30.mergeWith(cell32);
        java.lang.String str34 = cell32.toString();
        boolean boolean35 = cell32.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement37 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement37);
        boolean boolean39 = board38.moveLeft();
        boolean boolean40 = board38.moveLeft();
        ar.edu.unrc.game2048.Cell cell42 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean43 = cell42.isEmpty();
        ar.edu.unrc.game2048.Cell cell45 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell47 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell48 = cell45.mergeWith(cell47);
        java.lang.String str49 = cell47.toString();
        boolean boolean50 = cell47.isEmpty();
        ar.edu.unrc.game2048.Cell cell51 = cell42.mergeWith(cell47);
        boolean boolean52 = board38.equals((java.lang.Object) cell42);
        ar.edu.unrc.game2048.Cell cell53 = cell32.mergeWith(cell42);
        ar.edu.unrc.game2048.Cell cell55 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell57 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell58 = cell55.mergeWith(cell57);
        boolean boolean59 = cell53.equals((java.lang.Object) cell58);
        boolean boolean60 = cell18.canMergeWith(cell58);
        ar.edu.unrc.game2048.Cell cell61 = cell3.mergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell63 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell65 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell66 = cell63.mergeWith(cell65);
        ar.edu.unrc.game2048.Cell cell68 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell70 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell71 = cell68.mergeWith(cell70);
        ar.edu.unrc.game2048.Cell cell72 = cell65.mergeWith(cell70);
        boolean boolean73 = cell3.equals((java.lang.Object) cell70);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4" + "'", str27, "4");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4" + "'", str34, "4");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "4" + "'", str49, "4");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertNotNull(cell71);
        org.junit.Assert.assertNotNull(cell72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        boolean boolean5 = board2.moveUp();
        boolean boolean6 = board2.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet7 = board2.getEmptyPositions();
        int int8 = board2.getScore();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = cell3.mergeWith(cell5);
        boolean boolean7 = cell6.isEmpty();
        boolean boolean8 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = cell10.mergeWith(cell12);
        java.lang.String str14 = cell10.toString();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = cell16.mergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell20 = cell10.mergeWith(cell16);
        java.lang.String str21 = cell16.toString();
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell25 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell26 = cell23.mergeWith(cell25);
        boolean boolean27 = cell23.isEmpty();
        boolean boolean28 = cell16.canMergeWith(cell23);
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell32 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell33 = cell30.mergeWith(cell32);
        ar.edu.unrc.game2048.Cell cell35 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell37 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell38 = cell35.mergeWith(cell37);
        ar.edu.unrc.game2048.Cell cell39 = cell32.mergeWith(cell37);
        boolean boolean40 = cell23.equals((java.lang.Object) cell39);
        boolean boolean41 = cell6.canMergeWith(cell23);
        boolean boolean42 = cell1.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4" + "'", str21, "4");
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveRight();
        boolean boolean10 = board2.moveDown();
        boolean boolean11 = board2.moveLeft();
        java.lang.String str12 = board2.toString();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str12, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(placementStrategy13);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean14 = cell13.isEmpty();
        boolean boolean15 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = cell7.mergeWith(cell13);
        java.lang.String str17 = cell7.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet20 = board14.getEmptyPositions();
        boolean boolean21 = board14.hasEmptyCells();
        boolean boolean22 = deterministicPlacement2.addTile(board14);
        boolean boolean23 = board14.moveRight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet20 = board14.getEmptyPositions();
        boolean boolean21 = board14.hasEmptyCells();
        boolean boolean22 = deterministicPlacement2.addTile(board14);
        boolean boolean23 = board14.isLosingBoard();
        int int24 = board14.getSize();
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str27 = cell26.toString();
        int int28 = cell26.getValue();
        boolean boolean29 = board14.equals((java.lang.Object) cell26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4" + "'", str27, "4");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(8);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell8 = cell5.mergeWith(cell7);
        java.lang.String str9 = cell5.toString();
        boolean boolean10 = cell3.canMergeWith(cell5);
        boolean boolean11 = cell3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = cell1.mergeWith(cell3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveUp();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.moveLeft();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy11 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(placementStrategy11);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell8 = cell5.mergeWith(cell7);
        boolean boolean9 = cell8.isEmpty();
        boolean boolean10 = position2.equals((java.lang.Object) cell8);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = cell12.mergeWith(cell14);
        java.lang.String str16 = cell14.toString();
        boolean boolean17 = cell14.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement19 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement19);
        boolean boolean21 = board20.moveLeft();
        boolean boolean22 = board20.moveLeft();
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean25 = cell24.isEmpty();
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell30 = cell27.mergeWith(cell29);
        java.lang.String str31 = cell29.toString();
        boolean boolean32 = cell29.isEmpty();
        ar.edu.unrc.game2048.Cell cell33 = cell24.mergeWith(cell29);
        boolean boolean34 = board20.equals((java.lang.Object) cell24);
        ar.edu.unrc.game2048.Cell cell35 = cell14.mergeWith(cell24);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement38 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement38);
        ar.edu.unrc.game2048.Position position42 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean43 = board39.equals((java.lang.Object) position42);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy44 = board39.getStrategy();
        int int45 = board39.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet46 = board39.getEmptyPositions();
        java.lang.String str47 = board39.toString();
        boolean boolean48 = board39.isLosingBoard();
        int int49 = board39.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy50 = board39.getStrategy();
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy50);
        boolean boolean52 = cell35.equals((java.lang.Object) board51);
        boolean boolean53 = cell8.equals((java.lang.Object) board51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 1)" + "'", str3, "(10, 1)");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4" + "'", str16, "4");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4" + "'", str31, "4");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(placementStrategy44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(positionSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str47, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(placementStrategy50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean6 = cell5.isEmpty();
        ar.edu.unrc.game2048.Cell cell7 = cell1.mergeWith(cell5);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = cell15.mergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell19 = cell9.mergeWith(cell15);
        java.lang.String str20 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell21 = cell5.mergeWith(cell15);
        java.lang.Class<?> wildcardClass22 = cell21.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet20 = board14.getEmptyPositions();
        boolean boolean21 = board14.hasEmptyCells();
        boolean boolean22 = deterministicPlacement2.addTile(board14);
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement25 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean26 = cell24.equals((java.lang.Object) deterministicPlacement25);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement28 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement28);
        boolean boolean31 = board29.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int32 = board29.getSize();
        boolean boolean33 = board29.isLosingBoard();
        boolean boolean34 = deterministicPlacement25.addTile(board29);
        boolean boolean35 = board29.moveLeft();
        boolean boolean36 = deterministicPlacement2.addTile(board29);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement38 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement38);
        boolean boolean40 = board39.moveLeft();
        boolean boolean41 = board39.moveLeft();
        boolean boolean42 = board39.isLosingBoard();
        int int43 = board39.getSize();
        boolean boolean44 = deterministicPlacement2.addTile(board39);
        int int45 = board39.getScore();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board2.getStrategy();
        java.lang.String str9 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str9, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.lang.String str8 = board2.toString();
        java.lang.String str9 = board2.toString();
        boolean boolean10 = board2.moveLeft();
        java.lang.String str11 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str9, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.moveUp();
        boolean boolean11 = board2.isFull();
        boolean boolean12 = board2.moveUp();
        boolean boolean13 = board2.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = board2.getCell((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell9.toString();
        java.lang.Class<?> wildcardClass14 = cell9.getClass();
        boolean boolean15 = board2.equals((java.lang.Object) cell9);
        boolean boolean16 = board2.isLosingBoard();
        boolean boolean17 = board2.isLosingBoard();
        boolean boolean18 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        int int11 = board2.getScore();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.isWinningBoard();
        boolean boolean8 = board2.moveDown();
        int int9 = board2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy5 = board2.getStrategy();
        boolean boolean6 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(placementStrategy5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) '4', 2048);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        int int5 = position2.row;
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        java.lang.String str11 = cell10.toString();
        int int12 = cell10.getValue();
        boolean boolean13 = position2.equals((java.lang.Object) int12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, 2048)" + "'", str3, "(52, 2048)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8" + "'", str11, "8");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        boolean boolean13 = board2.equals((java.lang.Object) 100.0f);
        boolean boolean14 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = cell11.mergeWith(cell13);
        java.lang.Class<?> wildcardClass15 = cell11.getClass();
        boolean boolean16 = board2.equals((java.lang.Object) cell11);
        java.lang.String str17 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str17, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy8);
        boolean boolean10 = board9.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = cell3.mergeWith(cell5);
        java.lang.String str7 = cell3.toString();
        boolean boolean8 = cell1.canMergeWith(cell3);
        int int9 = cell1.getValue();
        java.lang.String str10 = cell1.toString();
        int int11 = cell1.getValue();
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = cell11.mergeWith(cell13);
        java.lang.Class<?> wildcardClass15 = cell11.getClass();
        boolean boolean16 = board2.equals((java.lang.Object) cell11);
        boolean boolean17 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveUp();
        int int10 = board2.getSize();
        boolean boolean11 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        boolean boolean14 = board2.moveLeft();
        boolean boolean15 = board2.isLosingBoard();
        boolean boolean16 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.Position position7 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean8 = board4.equals((java.lang.Object) position7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board4.getStrategy();
        int int10 = board4.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board4.getEmptyPositions();
        java.lang.String str12 = board4.toString();
        boolean boolean13 = board4.isLosingBoard();
        int int14 = board4.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy15 = board4.getStrategy();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy15);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(1, placementStrategy15);
        boolean boolean18 = board17.isFull();
        int int19 = board17.getScore();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str12, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(placementStrategy15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.Position position7 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean8 = board4.equals((java.lang.Object) position7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board4.getStrategy();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy9);
        boolean boolean11 = deterministicPlacement0.addTile(board10);
        int int12 = board10.getScore();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy8);
        boolean boolean10 = board9.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board9.getCell((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        int int5 = cell3.getValue();
        java.lang.String str6 = cell3.toString();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        ar.edu.unrc.game2048.Position position12 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean13 = board9.equals((java.lang.Object) position12);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board9.getStrategy();
        int int15 = board9.getScore();
        boolean boolean16 = board9.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet17 = board9.getEmptyPositions();
        boolean boolean18 = cell3.equals((java.lang.Object) positionSet17);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = cell12.mergeWith(cell14);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = cell17.mergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = cell14.mergeWith(cell19);
        boolean boolean22 = board2.equals((java.lang.Object) cell21);
        int int23 = board2.getScore();
        int int24 = board2.getScore();
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = cell26.mergeWith(cell28);
        java.lang.Class<?> wildcardClass30 = cell28.getClass();
        boolean boolean31 = board2.equals((java.lang.Object) cell28);
        boolean boolean32 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean7 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell11.toString();
        boolean boolean14 = cell11.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = cell6.mergeWith(cell11);
        boolean boolean16 = board2.equals((java.lang.Object) cell6);
        boolean boolean17 = board2.moveUp();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean20 = board2.equals((java.lang.Object) 4);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy21 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(placementStrategy21);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        ar.edu.unrc.game2048.Position position10 = new ar.edu.unrc.game2048.Position((int) (byte) -1, (int) (short) 10);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement12 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement12);
        ar.edu.unrc.game2048.Position position16 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean17 = board13.equals((java.lang.Object) position16);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy18 = board13.getStrategy();
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell23 = cell20.mergeWith(cell22);
        java.lang.String str24 = cell20.toString();
        java.lang.Class<?> wildcardClass25 = cell20.getClass();
        boolean boolean26 = board13.equals((java.lang.Object) cell20);
        boolean boolean27 = position10.equals((java.lang.Object) boolean26);
        boolean boolean28 = position2.equals((java.lang.Object) position10);
        int int29 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 100)" + "'", str4, "(1, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(1, 100)" + "'", str7, "(1, 100)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(placementStrategy18);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        ar.edu.unrc.game2048.Position position9 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean10 = board6.equals((java.lang.Object) position9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy11 = board6.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet12 = board6.getEmptyPositions();
        boolean boolean13 = board6.moveRight();
        boolean boolean14 = board6.moveDown();
        boolean boolean15 = board6.moveLeft();
        boolean boolean16 = deterministicPlacement2.addTile(board6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) (byte) 0, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(placementStrategy11);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        boolean boolean5 = board2.moveUp();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 100, (-1));
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        int int3 = position2.col;
        int int4 = position2.row;
        java.lang.String str5 = position2.toString();
        boolean boolean7 = position2.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(10, 1)" + "'", str5, "(10, 1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.moveDown();
        java.lang.String str11 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) -1, (int) (short) 10);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        ar.edu.unrc.game2048.Position position8 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean9 = board5.equals((java.lang.Object) position8);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy10 = board5.getStrategy();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = cell12.mergeWith(cell14);
        java.lang.String str16 = cell12.toString();
        java.lang.Class<?> wildcardClass17 = cell12.getClass();
        boolean boolean18 = board5.equals((java.lang.Object) cell12);
        boolean boolean19 = position2.equals((java.lang.Object) boolean18);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement21 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement21);
        ar.edu.unrc.game2048.Position position25 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean26 = board22.equals((java.lang.Object) position25);
        boolean boolean27 = board22.moveRight();
        boolean boolean28 = board22.isWinningBoard();
        boolean boolean29 = board22.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet30 = board22.getEmptyPositions();
        boolean boolean31 = position2.equals((java.lang.Object) positionSet30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(placementStrategy10);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4" + "'", str16, "4");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) 0);
        int int6 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement2);
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean7 = board3.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board3.getStrategy();
        int int9 = board3.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board3.getEmptyPositions();
        java.lang.String str11 = board3.toString();
        boolean boolean12 = board3.isLosingBoard();
        int int13 = board3.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy14 = board3.getStrategy();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy14);
        boolean boolean16 = board15.isWinningBoard();
        boolean boolean17 = board15.moveRight();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str11, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(placementStrategy14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean1 = cell0.isEmpty();
        boolean boolean2 = cell0.isEmpty();
        int int3 = cell0.getValue();
        ar.edu.unrc.game2048.Position position6 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int7 = position6.row;
        java.lang.String str8 = position6.toString();
        int int9 = position6.col;
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement11 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement11);
        boolean boolean14 = board12.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        java.lang.String str15 = board12.toString();
        boolean boolean16 = board12.hasEmptyCells();
        boolean boolean17 = position6.equals((java.lang.Object) board12);
        boolean boolean18 = cell0.equals((java.lang.Object) board12);
        boolean boolean19 = cell0.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(1, 100)" + "'", str8, "(1, 100)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str15, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        int int3 = position2.col;
        int int4 = position2.row;
        java.lang.String str5 = position2.toString();
        boolean boolean7 = position2.equals((java.lang.Object) 10L);
        int int8 = position2.col;
        int int9 = position2.col;
        boolean boolean11 = position2.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(10, 1)" + "'", str5, "(10, 1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getScore();
        boolean boolean9 = board2.moveRight();
        boolean boolean10 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean7 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell11.toString();
        boolean boolean14 = cell11.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = cell6.mergeWith(cell11);
        boolean boolean16 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Cell cell19 = board2.getCell((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        boolean boolean9 = board7.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int10 = board7.getSize();
        boolean boolean11 = board7.isLosingBoard();
        boolean boolean12 = deterministicPlacement3.addTile(board7);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement14 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement14);
        ar.edu.unrc.game2048.Position position18 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean19 = board15.equals((java.lang.Object) position18);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy20 = board15.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet21 = board15.getEmptyPositions();
        boolean boolean22 = board15.hasEmptyCells();
        boolean boolean23 = deterministicPlacement3.addTile(board15);
        int int24 = board15.getSize();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy25 = board15.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) (byte) -1, placementStrategy25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(placementStrategy20);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(placementStrategy25);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        boolean boolean14 = board2.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board2.getCell(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 10) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        java.lang.String str5 = board2.toString();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet6 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet7 = board2.getEmptyPositions();
        int int8 = board2.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        boolean boolean6 = board5.moveLeft();
        boolean boolean7 = board5.isFull();
        boolean boolean8 = board5.moveDown();
        java.lang.String str9 = board5.toString();
        boolean boolean10 = deterministicPlacement1.addTile(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str9, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        ar.edu.unrc.game2048.Position position9 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean10 = board6.equals((java.lang.Object) position9);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy11 = board6.getStrategy();
        int int12 = board6.getScore();
        boolean boolean13 = board6.moveLeft();
        boolean boolean14 = deterministicPlacement2.addTile(board6);
        boolean boolean15 = board6.isFull();
        int int16 = board6.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(placementStrategy11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell9.toString();
        java.lang.Class<?> wildcardClass14 = cell9.getClass();
        boolean boolean15 = board2.equals((java.lang.Object) cell9);
        int int16 = board2.getSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((-1), 1);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 1)" + "'", str3, "(-1, 1)");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        boolean boolean8 = board7.moveLeft();
        boolean boolean9 = board7.isFull();
        boolean boolean10 = board7.moveDown();
        boolean boolean11 = board7.hasEmptyCells();
        boolean boolean12 = board7.isWinningBoard();
        boolean boolean13 = deterministicPlacement3.addTile(board7);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 100, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        boolean boolean15 = board14.moveRight();
        int int16 = board14.getScore();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean5 = board2.moveLeft();
        boolean boolean6 = board2.isFull();
        int int7 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy8 = board2.getStrategy();
        boolean boolean9 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(placementStrategy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        boolean boolean5 = board2.moveUp();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board2.getStrategy();
        int int7 = board2.getScore();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) 0, 100);
        int int3 = position2.row;
        int int4 = position2.col;
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        ar.edu.unrc.game2048.Position position10 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean11 = board7.equals((java.lang.Object) position10);
        boolean boolean12 = board7.moveRight();
        boolean boolean13 = board7.moveLeft();
        boolean boolean14 = board7.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = cell16.mergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell24 = cell21.mergeWith(cell23);
        ar.edu.unrc.game2048.Cell cell25 = cell18.mergeWith(cell23);
        boolean boolean26 = board7.equals((java.lang.Object) cell23);
        boolean boolean27 = position2.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        boolean boolean6 = board5.moveLeft();
        boolean boolean7 = board5.moveLeft();
        boolean boolean8 = board5.isWinningBoard();
        boolean boolean9 = board5.isFull();
        boolean boolean10 = deterministicPlacement1.addTile(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        java.lang.String str12 = cell7.toString();
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = cell14.mergeWith(cell16);
        boolean boolean18 = cell14.isEmpty();
        boolean boolean19 = cell7.canMergeWith(cell14);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell24 = cell21.mergeWith(cell23);
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = cell26.mergeWith(cell28);
        ar.edu.unrc.game2048.Cell cell30 = cell23.mergeWith(cell28);
        boolean boolean31 = cell14.equals((java.lang.Object) cell30);
        java.lang.String str32 = cell14.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4" + "'", str32, "4");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        boolean boolean11 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        java.lang.String str8 = board2.toString();
        java.lang.String str9 = board2.toString();
        boolean boolean10 = board2.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board2.getCell((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str9, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position(10, 8);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        boolean boolean13 = board2.equals((java.lang.Object) 100.0f);
        boolean boolean14 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean8 = board6.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int9 = board6.getSize();
        boolean boolean10 = board6.isLosingBoard();
        boolean boolean11 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet20 = board14.getEmptyPositions();
        boolean boolean21 = board14.hasEmptyCells();
        boolean boolean22 = deterministicPlacement2.addTile(board14);
        int int23 = board14.getSize();
        boolean boolean24 = board14.isFull();
        java.lang.String str25 = board14.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str25, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        boolean boolean5 = board2.isWinningBoard();
        boolean boolean6 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (byte) 1, 100);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        int int8 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(1, 100)" + "'", str4, "(1, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(1, 100)" + "'", str7, "(1, 100)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        boolean boolean11 = board2.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board2.getCell((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = cell11.mergeWith(cell13);
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = cell16.mergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell20 = cell13.mergeWith(cell18);
        boolean boolean21 = board2.equals((java.lang.Object) cell18);
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet22 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(positionSet22);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell9.toString();
        java.lang.Class<?> wildcardClass14 = cell9.getClass();
        boolean boolean15 = board2.equals((java.lang.Object) cell9);
        boolean boolean16 = board2.isLosingBoard();
        boolean boolean17 = board2.isLosingBoard();
        boolean boolean18 = board2.hasEmptyCells();
        boolean boolean19 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board2.getEmptyPositions();
        boolean boolean12 = board2.moveUp();
        boolean boolean13 = board2.hasEmptyCells();
        boolean boolean14 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be 0 or a power of two: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board2.getStrategy();
        boolean boolean14 = board2.moveLeft();
        boolean boolean15 = board2.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell18 = board2.getCell((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 0) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        boolean boolean9 = board7.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int10 = board7.getSize();
        boolean boolean11 = board7.isLosingBoard();
        boolean boolean12 = deterministicPlacement3.addTile(board7);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement14 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement14);
        ar.edu.unrc.game2048.Position position18 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean19 = board15.equals((java.lang.Object) position18);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy20 = board15.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet21 = board15.getEmptyPositions();
        boolean boolean22 = board15.hasEmptyCells();
        boolean boolean23 = deterministicPlacement3.addTile(board15);
        boolean boolean24 = board15.isLosingBoard();
        ar.edu.unrc.game2048.Position position27 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        int int28 = position27.col;
        int int29 = position27.row;
        java.lang.String str30 = position27.toString();
        boolean boolean32 = position27.equals((java.lang.Object) 10L);
        int int33 = position27.col;
        int int34 = position27.col;
        boolean boolean35 = board15.equals((java.lang.Object) int34);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy36 = board15.getStrategy();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board((int) 'a', placementStrategy36);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(placementStrategy20);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(10, 1)" + "'", str30, "(10, 1)");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(placementStrategy36);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        boolean boolean5 = board2.isLosingBoard();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy6 = board2.getStrategy();
        boolean boolean7 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(placementStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean2 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = cell4.mergeWith(cell6);
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell10 = cell1.mergeWith(cell6);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = cell14.mergeWith(cell16);
        java.lang.String str18 = cell14.toString();
        boolean boolean19 = cell12.canMergeWith(cell14);
        int int20 = cell12.getValue();
        java.lang.String str21 = cell12.toString();
        boolean boolean22 = cell6.canMergeWith(cell12);
        int int23 = cell12.getValue();
        int int24 = cell12.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4" + "'", str18, "4");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4" + "'", str21, "4");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.moveLeft();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean14 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = cell16.mergeWith(cell18);
        java.lang.String str20 = cell18.toString();
        boolean boolean21 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell22 = cell13.mergeWith(cell18);
        boolean boolean23 = board9.equals((java.lang.Object) cell13);
        ar.edu.unrc.game2048.Cell cell24 = cell3.mergeWith(cell13);
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell31 = cell28.mergeWith(cell30);
        java.lang.String str32 = cell28.toString();
        boolean boolean33 = cell26.canMergeWith(cell28);
        boolean boolean34 = cell26.isEmpty();
        boolean boolean35 = cell24.canMergeWith(cell26);
        boolean boolean36 = cell26.isEmpty();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4" + "'", str32, "4");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board2.getEmptyPositions();
        boolean boolean12 = board2.moveUp();
        boolean boolean13 = board2.moveDown();
        boolean boolean14 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        boolean boolean8 = board7.moveLeft();
        boolean boolean9 = board7.isFull();
        boolean boolean10 = board7.moveDown();
        boolean boolean11 = board7.hasEmptyCells();
        boolean boolean12 = board7.isWinningBoard();
        boolean boolean13 = deterministicPlacement3.addTile(board7);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(placementStrategy9);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        int int12 = cell7.getValue();
        boolean boolean13 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean16 = cell15.isEmpty();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = cell18.mergeWith(cell20);
        java.lang.String str22 = cell20.toString();
        boolean boolean23 = cell20.isEmpty();
        ar.edu.unrc.game2048.Cell cell24 = cell15.mergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell25 = cell7.mergeWith(cell20);
        java.lang.String str26 = cell25.toString();
        boolean boolean27 = cell25.isEmpty();
        ar.edu.unrc.game2048.Position position30 = new ar.edu.unrc.game2048.Position(2048, 4);
        int int31 = position30.col;
        int int32 = position30.col;
        int int33 = position30.col;
        boolean boolean34 = cell25.equals((java.lang.Object) position30);
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean36 = cell35.isEmpty();
        ar.edu.unrc.game2048.Cell cell38 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str39 = cell38.toString();
        int int40 = cell38.getValue();
        ar.edu.unrc.game2048.Cell cell42 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean43 = cell42.isEmpty();
        ar.edu.unrc.game2048.Cell cell44 = cell38.mergeWith(cell42);
        boolean boolean45 = cell35.canMergeWith(cell44);
        boolean boolean46 = cell25.canMergeWith(cell44);
        int int47 = cell25.getValue();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "8" + "'", str26, "8");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4" + "'", str39, "4");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8 + "'", int47 == 8);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.moveLeft();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean14 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = cell16.mergeWith(cell18);
        java.lang.String str20 = cell18.toString();
        boolean boolean21 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell22 = cell13.mergeWith(cell18);
        boolean boolean23 = board9.equals((java.lang.Object) cell13);
        ar.edu.unrc.game2048.Cell cell24 = cell3.mergeWith(cell13);
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell31 = cell28.mergeWith(cell30);
        java.lang.String str32 = cell28.toString();
        boolean boolean33 = cell26.canMergeWith(cell28);
        boolean boolean34 = cell26.isEmpty();
        boolean boolean35 = cell24.canMergeWith(cell26);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement37 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement37);
        ar.edu.unrc.game2048.Position position41 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean42 = board38.equals((java.lang.Object) position41);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy43 = board38.getStrategy();
        boolean boolean44 = board38.hasEmptyCells();
        boolean boolean45 = cell24.equals((java.lang.Object) board38);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4" + "'", str32, "4");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(placementStrategy43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        boolean boolean9 = board2.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet10 = board2.getEmptyPositions();
        boolean boolean11 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean4 = board2.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        java.lang.String str5 = board2.toString();
        java.lang.String str6 = board2.toString();
        int int7 = board2.getSize();
        java.lang.String str8 = board2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str5, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str6, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str8, "Score: 0\n+-----+\n|    2|\n+-----+\n");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = cell8.mergeWith(cell10);
        java.lang.String str12 = cell10.toString();
        boolean boolean13 = cell10.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement15 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement15);
        boolean boolean17 = board16.moveLeft();
        boolean boolean18 = board16.moveLeft();
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean21 = cell20.isEmpty();
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell25 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell26 = cell23.mergeWith(cell25);
        java.lang.String str27 = cell25.toString();
        boolean boolean28 = cell25.isEmpty();
        ar.edu.unrc.game2048.Cell cell29 = cell20.mergeWith(cell25);
        boolean boolean30 = board16.equals((java.lang.Object) cell20);
        ar.edu.unrc.game2048.Cell cell31 = cell10.mergeWith(cell20);
        boolean boolean32 = cell3.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell34 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell36 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell37 = cell34.mergeWith(cell36);
        java.lang.String str38 = cell37.toString();
        boolean boolean39 = cell37.isEmpty();
        boolean boolean40 = cell10.canMergeWith(cell37);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4" + "'", str27, "4");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "8" + "'", str38, "8");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = cell13.mergeWith(cell15);
        java.lang.String str17 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell22 = cell19.mergeWith(cell21);
        ar.edu.unrc.game2048.Cell cell23 = cell13.mergeWith(cell19);
        int int24 = cell19.getValue();
        int int25 = cell19.getValue();
        ar.edu.unrc.game2048.Cell cell26 = cell1.mergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell31 = cell28.mergeWith(cell30);
        java.lang.String str32 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell34 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell36 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell37 = cell34.mergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell38 = cell28.mergeWith(cell34);
        ar.edu.unrc.game2048.Cell cell40 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean41 = cell40.isEmpty();
        boolean boolean42 = cell40.isEmpty();
        ar.edu.unrc.game2048.Cell cell43 = cell34.mergeWith(cell40);
        boolean boolean44 = cell1.canMergeWith(cell34);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4" + "'", str32, "4");
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean14 = cell13.isEmpty();
        boolean boolean15 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = cell7.mergeWith(cell13);
        int int17 = cell16.getValue();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement20 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean21 = cell19.equals((java.lang.Object) deterministicPlacement20);
        boolean boolean22 = cell16.equals((java.lang.Object) cell19);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement8 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement8);
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.moveLeft();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean14 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell19 = cell16.mergeWith(cell18);
        java.lang.String str20 = cell18.toString();
        boolean boolean21 = cell18.isEmpty();
        ar.edu.unrc.game2048.Cell cell22 = cell13.mergeWith(cell18);
        boolean boolean23 = board9.equals((java.lang.Object) cell13);
        ar.edu.unrc.game2048.Cell cell24 = cell3.mergeWith(cell13);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement27 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement27);
        ar.edu.unrc.game2048.Position position31 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean32 = board28.equals((java.lang.Object) position31);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy33 = board28.getStrategy();
        int int34 = board28.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet35 = board28.getEmptyPositions();
        java.lang.String str36 = board28.toString();
        boolean boolean37 = board28.isLosingBoard();
        int int38 = board28.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy39 = board28.getStrategy();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy39);
        boolean boolean41 = cell24.equals((java.lang.Object) board40);
        int int42 = board40.getScore();
        ar.edu.unrc.game2048.Cell cell46 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str47 = cell46.toString();
        int int48 = cell46.getValue();
        ar.edu.unrc.game2048.Cell cell50 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean51 = cell50.isEmpty();
        ar.edu.unrc.game2048.Cell cell52 = cell46.mergeWith(cell50);
        ar.edu.unrc.game2048.Cell cell54 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell56 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell57 = cell54.mergeWith(cell56);
        java.lang.String str58 = cell56.toString();
        java.lang.String str59 = cell56.toString();
        boolean boolean60 = cell46.canMergeWith(cell56);
        ar.edu.unrc.game2048.Cell cell62 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean63 = cell62.isEmpty();
        ar.edu.unrc.game2048.Cell cell65 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell67 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell68 = cell65.mergeWith(cell67);
        java.lang.String str69 = cell67.toString();
        boolean boolean70 = cell67.isEmpty();
        ar.edu.unrc.game2048.Cell cell71 = cell62.mergeWith(cell67);
        boolean boolean72 = cell46.canMergeWith(cell67);
        boolean boolean74 = cell67.equals((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            board40.setCell(52, (int) (byte) 0, cell67);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 0) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(placementStrategy33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(positionSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str36, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(placementStrategy39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "4" + "'", str47, "4");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4" + "'", str58, "4");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "4" + "'", str59, "4");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "4" + "'", str69, "4");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(cell71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean2 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell7 = cell4.mergeWith(cell6);
        java.lang.String str8 = cell6.toString();
        boolean boolean9 = cell6.isEmpty();
        ar.edu.unrc.game2048.Cell cell10 = cell1.mergeWith(cell6);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = cell14.mergeWith(cell16);
        java.lang.String str18 = cell14.toString();
        boolean boolean19 = cell12.canMergeWith(cell14);
        int int20 = cell12.getValue();
        java.lang.String str21 = cell12.toString();
        boolean boolean22 = cell6.canMergeWith(cell12);
        java.lang.String str23 = cell6.toString();
        boolean boolean24 = cell6.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4" + "'", str18, "4");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4" + "'", str21, "4");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        boolean boolean9 = board7.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int10 = board7.getSize();
        boolean boolean11 = board7.isLosingBoard();
        boolean boolean12 = deterministicPlacement3.addTile(board7);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement14 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement14);
        boolean boolean16 = board15.moveLeft();
        boolean boolean17 = board15.moveLeft();
        boolean boolean18 = board15.moveUp();
        boolean boolean19 = board15.isLosingBoard();
        boolean boolean20 = board15.isWinningBoard();
        boolean boolean21 = deterministicPlacement3.addTile(board15);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board((int) (short) 10, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy23 = board22.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(placementStrategy23);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean5 = cell3.equals((java.lang.Object) deterministicPlacement4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement7 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement7);
        ar.edu.unrc.game2048.Position position11 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean12 = board8.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy13 = board8.getStrategy();
        int int14 = board8.getScore();
        boolean boolean15 = board8.moveLeft();
        boolean boolean16 = deterministicPlacement4.addTile(board8);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(2048, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board((int) (short) 0, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(placementStrategy13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.moveUp();
        boolean boolean11 = board2.isFull();
        boolean boolean12 = board2.moveUp();
        boolean boolean13 = board2.moveLeft();
        boolean boolean14 = board2.isFull();
        boolean boolean15 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.isFull();
        boolean boolean5 = board2.moveDown();
        int int6 = board2.getSize();
        boolean boolean7 = board2.isFull();
        boolean boolean8 = board2.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet9);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.Position position7 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean8 = board4.equals((java.lang.Object) position7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board4.getStrategy();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy9);
        boolean boolean11 = deterministicPlacement0.addTile(board10);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell24 = cell21.mergeWith(cell23);
        java.lang.String str25 = cell21.toString();
        java.lang.Class<?> wildcardClass26 = cell21.getClass();
        boolean boolean27 = board14.equals((java.lang.Object) cell21);
        boolean boolean28 = board14.isLosingBoard();
        boolean boolean29 = deterministicPlacement0.addTile(board14);
        int int30 = board14.getScore();
        boolean boolean31 = board14.hasEmptyCells();
        int int32 = board14.getScore();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4" + "'", str25, "4");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveDown();
        boolean boolean4 = board2.hasEmptyCells();
        boolean boolean5 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.moveUp();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy10 = board2.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(placementStrategy10);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        ar.edu.unrc.game2048.Position position2 = new ar.edu.unrc.game2048.Position((int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy7 = board2.getStrategy();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet9 = board2.getEmptyPositions();
        java.lang.String str10 = board2.toString();
        boolean boolean11 = board2.isLosingBoard();
        int int12 = board2.getScore();
        boolean boolean13 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(placementStrategy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str10, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board2.getEmptyPositions();
        boolean boolean12 = board2.moveUp();
        boolean boolean13 = board2.hasEmptyCells();
        boolean boolean14 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        ar.edu.unrc.game2048.Position position8 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean9 = board5.equals((java.lang.Object) position8);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy10 = board5.getStrategy();
        int int11 = board5.getScore();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet12 = board5.getEmptyPositions();
        java.lang.String str13 = board5.toString();
        boolean boolean14 = board5.isLosingBoard();
        int int15 = board5.getScore();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy16 = board5.getStrategy();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(1, placementStrategy16);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(0, placementStrategy16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(placementStrategy10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+\n|    2|\n+-----+\n" + "'", str13, "Score: 0\n+-----+\n|    2|\n+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(placementStrategy16);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        int int3 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean6 = cell5.isEmpty();
        ar.edu.unrc.game2048.Cell cell7 = cell1.mergeWith(cell5);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell12 = cell9.mergeWith(cell11);
        java.lang.String str13 = cell11.toString();
        java.lang.String str14 = cell11.toString();
        boolean boolean15 = cell1.canMergeWith(cell11);
        java.lang.String str16 = cell11.toString();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str19 = cell18.toString();
        int int20 = cell18.getValue();
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean23 = cell22.isEmpty();
        ar.edu.unrc.game2048.Cell cell24 = cell18.mergeWith(cell22);
        ar.edu.unrc.game2048.Cell cell25 = cell11.mergeWith(cell22);
        ar.edu.unrc.game2048.Cell cell27 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell30 = cell27.mergeWith(cell29);
        java.lang.String str31 = cell30.toString();
        boolean boolean32 = cell30.isEmpty();
        boolean boolean33 = cell30.isEmpty();
        boolean boolean34 = cell30.isEmpty();
        boolean boolean35 = cell25.canMergeWith(cell30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4" + "'", str16, "4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4" + "'", str19, "4");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "8" + "'", str31, "8");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        boolean boolean3 = board2.moveLeft();
        boolean boolean4 = board2.moveLeft();
        boolean boolean5 = board2.moveUp();
        boolean boolean6 = board2.isLosingBoard();
        boolean boolean7 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell4.toString();
        boolean boolean6 = cell4.isEmpty();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean9 = cell4.canMergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = cell11.mergeWith(cell13);
        java.lang.String str15 = cell13.toString();
        boolean boolean16 = cell13.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = cell4.mergeWith(cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8" + "'", str5, "8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4" + "'", str15, "4");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement2 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean3 = cell1.equals((java.lang.Object) deterministicPlacement2);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement5 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement5);
        boolean boolean7 = board6.moveLeft();
        boolean boolean8 = board6.isFull();
        boolean boolean9 = board6.moveDown();
        boolean boolean10 = board6.hasEmptyCells();
        boolean boolean11 = board6.isWinningBoard();
        boolean boolean12 = deterministicPlacement2.addTile(board6);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement14 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement14);
        ar.edu.unrc.game2048.Position position18 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean19 = board15.equals((java.lang.Object) position18);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy20 = board15.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet21 = board15.getEmptyPositions();
        boolean boolean22 = deterministicPlacement2.addTile(board15);
        boolean boolean23 = board15.moveLeft();
        int int24 = board15.getScore();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(placementStrategy20);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement0 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement3);
        ar.edu.unrc.game2048.Position position7 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean8 = board4.equals((java.lang.Object) position7);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy9 = board4.getStrategy();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy9);
        boolean boolean11 = deterministicPlacement0.addTile(board10);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement13 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement13);
        ar.edu.unrc.game2048.Position position17 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean18 = board14.equals((java.lang.Object) position17);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy19 = board14.getStrategy();
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell24 = cell21.mergeWith(cell23);
        java.lang.String str25 = cell21.toString();
        java.lang.Class<?> wildcardClass26 = cell21.getClass();
        boolean boolean27 = board14.equals((java.lang.Object) cell21);
        boolean boolean28 = board14.isLosingBoard();
        boolean boolean29 = deterministicPlacement0.addTile(board14);
        int int30 = board14.getScore();
        boolean boolean31 = board14.hasEmptyCells();
        int int32 = board14.getSize();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(placementStrategy9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(placementStrategy19);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4" + "'", str25, "4");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell14 = cell11.mergeWith(cell13);
        java.lang.Class<?> wildcardClass15 = cell11.getClass();
        boolean boolean16 = board2.equals((java.lang.Object) cell11);
        int int17 = board2.getSize();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet18 = board2.getEmptyPositions();
        boolean boolean19 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        ar.edu.unrc.game2048.Cell cell2 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement3 = new ar.edu.unrc.game2048.DeterministicPlacement();
        boolean boolean4 = cell2.equals((java.lang.Object) deterministicPlacement3);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement6 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement6);
        boolean boolean9 = board7.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        int int10 = board7.getSize();
        boolean boolean11 = board7.isLosingBoard();
        boolean boolean12 = deterministicPlacement3.addTile(board7);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement14 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement14);
        ar.edu.unrc.game2048.Position position18 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean19 = board15.equals((java.lang.Object) position18);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy20 = board15.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet21 = board15.getEmptyPositions();
        boolean boolean22 = board15.hasEmptyCells();
        boolean boolean23 = deterministicPlacement3.addTile(board15);
        int int24 = board15.getSize();
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy25 = board15.getStrategy();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) (short) 10, placementStrategy25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(placementStrategy20);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(placementStrategy25);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement4 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement4);
        ar.edu.unrc.game2048.Position position8 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean9 = board5.equals((java.lang.Object) position8);
        ar.edu.unrc.game2048.PlacementStrategy placementStrategy10 = board5.getStrategy();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board5.getEmptyPositions();
        boolean boolean12 = board5.moveRight();
        boolean boolean13 = board5.moveDown();
        boolean boolean14 = board5.moveLeft();
        boolean boolean15 = deterministicPlacement1.addTile(board5);
        boolean boolean16 = board5.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(placementStrategy10);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        boolean boolean6 = cell3.isEmpty();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell11 = cell8.mergeWith(cell10);
        java.lang.String str12 = cell10.toString();
        boolean boolean13 = cell10.isEmpty();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement15 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement15);
        boolean boolean17 = board16.moveLeft();
        boolean boolean18 = board16.moveLeft();
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean21 = cell20.isEmpty();
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell25 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell26 = cell23.mergeWith(cell25);
        java.lang.String str27 = cell25.toString();
        boolean boolean28 = cell25.isEmpty();
        ar.edu.unrc.game2048.Cell cell29 = cell20.mergeWith(cell25);
        boolean boolean30 = board16.equals((java.lang.Object) cell20);
        ar.edu.unrc.game2048.Cell cell31 = cell10.mergeWith(cell20);
        boolean boolean32 = cell3.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell34 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell36 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell37 = cell34.mergeWith(cell36);
        java.lang.String str38 = cell34.toString();
        ar.edu.unrc.game2048.Cell cell40 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell42 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell43 = cell40.mergeWith(cell42);
        ar.edu.unrc.game2048.Cell cell44 = cell34.mergeWith(cell40);
        int int45 = cell40.getValue();
        boolean boolean46 = cell40.isEmpty();
        ar.edu.unrc.game2048.Cell cell48 = new ar.edu.unrc.game2048.Cell(4);
        boolean boolean49 = cell48.isEmpty();
        ar.edu.unrc.game2048.Cell cell51 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell53 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell54 = cell51.mergeWith(cell53);
        java.lang.String str55 = cell53.toString();
        boolean boolean56 = cell53.isEmpty();
        ar.edu.unrc.game2048.Cell cell57 = cell48.mergeWith(cell53);
        ar.edu.unrc.game2048.Cell cell58 = cell40.mergeWith(cell53);
        ar.edu.unrc.game2048.Cell cell60 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell62 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell63 = cell60.mergeWith(cell62);
        boolean boolean64 = cell40.canMergeWith(cell63);
        ar.edu.unrc.game2048.Cell cell65 = cell3.mergeWith(cell40);
        java.lang.String str66 = cell65.toString();
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4" + "'", str27, "4");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4" + "'", str38, "4");
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "4" + "'", str55, "4");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertNotNull(cell63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "8" + "'", str66, "8");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell3.toString();
        java.lang.String str6 = cell3.toString();
        ar.edu.unrc.game2048.Position position9 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        int int10 = position9.col;
        int int11 = position9.row;
        boolean boolean12 = cell3.equals((java.lang.Object) position9);
        java.lang.String str13 = cell3.toString();
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement15 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement15);
        boolean boolean18 = board16.equals((java.lang.Object) "Score: 0\n+-----+\n|    2|\n+-----+\n");
        boolean boolean19 = board16.moveLeft();
        boolean boolean20 = board16.isFull();
        int int21 = board16.getScore();
        boolean boolean22 = board16.hasEmptyCells();
        boolean boolean23 = cell3.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell4 = cell1.mergeWith(cell3);
        java.lang.String str5 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell10 = cell7.mergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = cell1.mergeWith(cell7);
        int int12 = cell7.getValue();
        boolean boolean13 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell17 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell18 = cell15.mergeWith(cell17);
        java.lang.String str19 = cell18.toString();
        boolean boolean20 = cell18.isEmpty();
        boolean boolean21 = cell18.isEmpty();
        boolean boolean22 = cell7.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(4);
        ar.edu.unrc.game2048.Cell cell27 = cell24.mergeWith(cell26);
        java.lang.String str28 = cell26.toString();
        java.lang.String str29 = cell26.toString();
        ar.edu.unrc.game2048.Position position32 = new ar.edu.unrc.game2048.Position((int) (byte) 10, (int) (byte) 1);
        int int33 = position32.col;
        int int34 = position32.row;
        boolean boolean35 = cell26.equals((java.lang.Object) position32);
        java.lang.String str36 = cell26.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell37 = cell18.mergeWith(cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 8 and 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "8" + "'", str19, "8");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4" + "'", str28, "4");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4" + "'", str29, "4");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4" + "'", str36, "4");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        ar.edu.unrc.game2048.DeterministicPlacement deterministicPlacement1 = new ar.edu.unrc.game2048.DeterministicPlacement();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, (ar.edu.unrc.game2048.PlacementStrategy) deterministicPlacement1);
        ar.edu.unrc.game2048.Position position5 = new ar.edu.unrc.game2048.Position((int) (short) 1, 10);
        boolean boolean6 = board2.equals((java.lang.Object) position5);
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Position> positionSet11 = board2.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board2.getCell((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet11);
    }
}

