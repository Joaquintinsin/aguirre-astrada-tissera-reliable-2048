package ar.edu.unrc.game2048;

// ==================== PREDICTABLE TILE ADDITION ====================
public class DeterministicPlacement implements PlacementStrategy {
    /**
     * Adds a tile of value 2 to the first encountered empty cell.
     * Tiles are only added during initialization or after successful moves.
     *
     * @return true if a tile was added, false if the board was full
     */
    @Override
    public boolean addTile(Board board) {
        int size = board.getSize();

        // Search through the board
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                // As soon encounter one empty cell, put a new cell with value 2
                if (board.getCell(r, c).isEmpty()) {
                    board.setCell(r, c, new Cell(2));
                    return true;
                }
            }
        }

        // Returns false if there is no empty cells left
        return false;
    }
}
