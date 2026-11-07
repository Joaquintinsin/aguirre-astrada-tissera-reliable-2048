package ar.edu.unrc.game2048;

import java.util.Scanner;

/**
 * Command-line interface for the 2048 game.
 *
 * This class handles user input and displays the board state.
 * It demonstrates how to use the Board class and its methods.
 */
public class MainCLI {
    private final Board board;
    private final Scanner scanner;

    public MainCLI() {
        this(new Board());
    }

    /**
     * Creates a CLI that starts playing from the given board.
     *
     * @param board the initial board
     */
    public MainCLI(Board board) {
        this.board = board;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Main game loop.
     */
    public void play() {
        System.out.println("=== 2048 Game ===");
        System.out.println("Controls: W(up), S(down), A(left), D(right), Q(quit)");
        System.out.println();

        while (true) {
            displayBoard();

            if (board.isWinningBoard()) {
                System.out.println("🎉 Congratulations! You reached 2048! 🎉");
                System.out.println("You can continue playing or quit.");
            }

            if (board.isLosingBoard()) {
                System.out.println("💀 Game Over! No more moves available. 💀");
                System.out.println("Final score: " + board.getScore());
                break;
            }

            System.out.print("Enter move: ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("Q")) {
                System.out.println("Thanks for playing! Final score: " + board.getScore());
                break;
            }

            boolean moved = false;
            switch (input) {
                case "W":
                    moved = board.moveUp();
                    break;
                case "S":
                    moved = board.moveDown();
                    break;
                case "A":
                    moved = board.moveLeft();
                    break;
                case "D":
                    moved = board.moveRight();
                    break;
                default:
                    System.out.println("Invalid input! Use W, A, S, D, or Q.");
                    continue;
            }

            assert board.repOk();

            if (moved) {
                System.out.println("Tile moved!");
            } else {
                System.out.println("No tiles moved. Try a different direction.");
            }
            System.out.println();
        }

        scanner.close();
    }

    /**
     * Displays the current board state.
     */
    private void displayBoard() {
        System.out.println(board);
    }

    /**
     * Usage:
     *   java ar.edu.unrc.game2048.MainCLI
     *   java ar.edu.unrc.game2048.MainCLI --board "[0,0,0,0,4,2,0,0,0,0,0,0,2,2,2,2]"
     */
    public static void main(String[] args) {
        Board initial;
        if (args.length == 0) {
            initial = new Board();
        } else if (args.length == 2 && args[0].equals("--board")) {
            try {
                initial = Board.fromString(args[1]);
            } catch (IllegalArgumentException e) {
                System.err.println("Invalid board: " + e.getMessage());
                System.exit(1);
                return;
            }
        } else {
            System.err.println("Usage: MainCLI [--board \"[v1,v2,...,vN]\"]");
            System.exit(2);
            return;
        }
        MainCLI game = new MainCLI(initial);
        game.play();
    }
}
