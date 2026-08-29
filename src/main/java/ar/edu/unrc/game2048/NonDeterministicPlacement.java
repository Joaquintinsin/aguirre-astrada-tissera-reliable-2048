package ar.edu.unrc.game2048;

import java.util.Set;

// ==================== RANDOM TILE ADDITION ====================
public class NonDeterministicPlacement implements PlacementStrategy {
    /**
     * Adds a random tile (2 or 4) to a random empty cell.
     * Tiles are only added during initialization or after successful moves.
     *
     * @return true if a tile was added, false if the board was full
     */
    @Override
    public boolean addTile(Board board) {
        Set<Position> empty = board.getEmptyPositions();
        if (empty.isEmpty()) {
            return false;
        }

        // Choose random position
        int randomIndex = (int) (Math.random() * empty.size());
        Position pos = empty.stream().skip(randomIndex).findFirst().get();

        // 90% chance of 2, 10% chance of 4 (standard 2048 rules)
        int value = Math.random() < 0.9 ? 2 : 4;
        board.setCell(pos.row, pos.col, new Cell(value));

        return true;
    }
}
