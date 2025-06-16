package week06TicTacToeLab;

import java.util.Scanner;

public class week06TicTacToeLab {
	

	
    static String[] board = new String[9];
    static String currentPlayer = "X";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();
        boolean gameEnded = false;
        int moves = 0;
		// TODO Auto-generated method stub

        
        while (!gameEnded && moves < 9) {
            displayBoard();
            System.out.print("Player " + currentPlayer + ", enter a position (1-9): ");
            int position = scanner.nextInt();

            // Check if position is valid and not already taken
            if (position >= 1 && position <= 9 && board[position - 1].equals(String.valueOf(position))) {
                board[position - 1] = currentPlayer;
                moves++;

                if (moves >= 5 && checkWinStatus()) {
                    displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameEnded = true;
                } else if (moves == 9) {
                    displayBoard();
                    System.out.println("It's a draw!");
                } else {
                    currentPlayer = (currentPlayer.equals("X")) ? "O" : "X";
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }

    // Initializes the game board
    public static void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }

    // Displays the game board
    public static void displayBoard() {
        System.out.println("+---+---+---+");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("| " + board[i] + " | " + board[i + 1] + " | " + board[i + 2] + " |");
            System.out.println("+---+---+---+");
        }
    }

    // Checks for winning conditions
    public static boolean checkWinStatus() {
        // Possible winning combinations
        int[][] winPatterns = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // columns
            {0, 4, 8}, {2, 4, 6}             // diagonals
        };

        for (int[] pattern : winPatterns) {
            if (board[pattern[0]].equals(currentPlayer) &&
                board[pattern[1]].equals(currentPlayer) &&
                board[pattern[2]].equals(currentPlayer)) {
                return true;
            }
        }
        return false;
    }
}
