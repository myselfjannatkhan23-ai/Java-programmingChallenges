import java.util.Scanner;
class TicTacToe {
        static char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        static char currentPlayer = 'X';

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean gameEnded = false;

            System.out.println("Welcome to Tic Tac Toe!");
            printBoard();

            while (!gameEnded) {
                System.out.println("Player " + currentPlayer + ", enter your move (row and column: 1 2): ");
                int row = scanner.nextInt() - 1;
                int col = scanner.nextInt() - 1;

                if (isValidMove(row, col)) {
                    board[row][col] = currentPlayer;
                    printBoard();

                    if (isWinner(currentPlayer)) {
                        System.out.println("Player " + currentPlayer + " wins!");
                        gameEnded = true;
                    } else if (isDraw()) {
                        System.out.println("It's a draw!");
                        gameEnded = true;
                    } else {
                        switchPlayer();
                    }
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            scanner.close();
        }

        // Function to print the board
        public static void printBoard() {
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
        }

        // Check if move is valid
        public static boolean isValidMove(int row, int col) {
            return row >= 0 && row < 3 &&
                    col >= 0 && col < 3 &&
                    board[row][col] == ' ';
        }

        // Switch current player
        public static void switchPlayer() {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        // Check for a win
        public static boolean isWinner(char player) {
            // Rows and Columns
            for (int i = 0; i < 3; i++) {
                if ((board[i][0] == player &&
                        board[i][1] == player &&
                        board[i][2] == player) ||

                        (board[0][i] == player &&
                                board[1][i] == player &&
                                board[2][i] == player)) {
                    return true;
                }
            }

            // Diagonals
            return (board[0][0] == player &&
                    board[1][1] == player &&
                    board[2][2] == player) ||

                    (board[0][2] == player &&
                            board[1][1] == player &&
                            board[2][0] == player);
        }

        // Check for draw
        public static boolean isDraw() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ')
                        return false;
                }
            }
            return true;
        }
    }
