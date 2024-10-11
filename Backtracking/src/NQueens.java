public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        /*
            for print any one solution if possible
            change return type of queen to boolean
            base case return type is true else false
            add if condition for recursion with return type true

            if(queen(board, 0)) {
                System.out.println("Solution is possible");
                printBoard(board);
            } else {
                System.out.println("Solution is not possible");
            }
        */

        queen(board, 0);
        System.out.println("\nTotal ways to solve nQueens is: " + count);
    }

    static int count = 0;

    public static void queen(char[][] board, int row) {
        if(row ==  board.length) {
            printBoard(board);
            count++;
            return;
        }
        // Column loop
        for(int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                queen(board, row + 1);
                board[row][j] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Vertically up
        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // Diagonal left up
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal right up
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("-----Chess Board-----");
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Time Complexity -> O(n!)
// Space Complexity -> O(n²)
