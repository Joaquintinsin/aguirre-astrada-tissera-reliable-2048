package ar.edu.unrc.game2048.fuzzing;

import ar.edu.unrc.game2048.Board;
import ar.edu.unrc.game2048.Cell;

/**
 * Independent, minimal re-implementation of the 2048 rules, used as a
 * differential-testing oracle by {@link FuzzHarness}.
 *
 * It uses {@code long} on purpose, so it never overflows by accident: the
 * limits below are applied explicitly, and the harness compares Board against
 * it.
 *
 * Rules (the same that Board documents):
 *  - no move is possible if the board contains WINNING_VALUE or is lost
 *  - a move slides tiles and merges each pair of equal adjacent tiles once
 *  - a tile with value Cell.MAX_VALUE (2^30) never merges
 *  - the score increases by the value of each merged tile, saturating at
 *    Integer.MAX_VALUE
 *  - if the board changed, a 2 is placed in the first empty cell in
 *    row-major order (DeterministicPlacement)
 */
final class ReferenceModel {

    private final int n;
    private final long[][] g;
    private long score;

    private ReferenceModel(int n) {
        this.n = n;
        this.g = new long[n][n];
    }

    static ReferenceModel of(Board b) {
        ReferenceModel m = new ReferenceModel(b.getSize());
        for (int r = 0; r < m.n; r++) {
            for (int c = 0; c < m.n; c++) {
                m.g[r][c] = b.getCell(r, c).getValue();
            }
        }
        m.score = b.getScore();
        return m;
    }

    /** Applies a move (W/A/S/D) and returns whether the board changed. */
    boolean move(char dir) {
        if (isWinning() || isLosing()) {
            return false;
        }
        boolean changed = false;
        for (int line = 0; line < n; line++) {
            long[] cells = new long[n];
            for (int k = 0; k < n; k++) {
                cells[k] = get(dir, line, k);
            }
            long[] slid = slideTowardsStart(cells);
            for (int k = 0; k < n; k++) {
                if (slid[k] != cells[k]) {
                    changed = true;
                }
                set(dir, line, k, slid[k]);
            }
        }
        if (changed) {
            spawn();
        }
        return changed;
    }

    /** Slides a line towards index 0, merging equal pairs once. */
    private long[] slideTowardsStart(long[] cells) {
        long[] out = new long[n];
        int w = 0;
        long pending = 0;
        for (long v : cells) {
            if (v == 0) {
                continue;
            }
            if (pending == 0) {
                pending = v;
            } else if (pending == v && canMerge(v)) {
                out[w++] = 2 * v;
                score = Math.min(score + 2 * v, Integer.MAX_VALUE);
                pending = 0;
            } else {
                out[w++] = pending;
                pending = v;
            }
        }
        if (pending != 0) {
            out[w] = pending;
        }
        return out;
    }

    /**
     * k-th cell of a line, where k = 0 is the cell the tiles move towards.
     * A (left): line = row, from left;  D (right): line = row, from right
     * W (up):   line = col, from top;   S (down):  line = col, from bottom
     */
    private long get(char dir, int line, int k) {
        switch (dir) {
            case 'A': return g[line][k];
            case 'D': return g[line][n - 1 - k];
            case 'W': return g[k][line];
            default:  return g[n - 1 - k][line];
        }
    }

    private void set(char dir, int line, int k, long v) {
        switch (dir) {
            case 'A': g[line][k] = v; break;
            case 'D': g[line][n - 1 - k] = v; break;
            case 'W': g[k][line] = v; break;
            default:  g[n - 1 - k][line] = v; break;
        }
    }

    private static boolean canMerge(long v) {
        return v != 0 && v < Cell.MAX_VALUE;
    }

    private void spawn() {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (g[r][c] == 0) {
                    g[r][c] = 2;
                    return;
                }
            }
        }
    }

    private boolean isWinning() {
        for (long[] row : g) {
            for (long v : row) {
                if (v == Board.WINNING_VALUE) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isLosing() {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (g[r][c] == 0) {
                    return false;
                }
                if (c + 1 < n && g[r][c] == g[r][c + 1] && canMerge(g[r][c])) {
                    return false;
                }
                if (r + 1 < n && g[r][c] == g[r + 1][c] && canMerge(g[r][c])) {
                    return false;
                }
            }
        }
        return true;
    }

    /** True if the board has exactly the same cells and score. */
    boolean sameAs(Board b) {
        if (b.getScore() != score) {
            return false;
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (b.getCell(r, c).getValue() != g[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r > 0 || c > 0) {
                    sb.append(',');
                }
                sb.append(g[r][c]);
            }
        }
        return sb.append("] score=").append(score).toString();
    }
}
