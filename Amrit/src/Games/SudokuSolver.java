package Games;

public class SudokuSolver {
    
    private int[][] board;
    private static final int SIZE = 9;
    private static final int EMPTY = 0;
    
    public SudokuSolver(int[][] board) {
        this.board = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.board[i][j] = board[i][j];
            }
        }
    }
    
    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY) {
                    for (int number = 1; number <= SIZE; number++) {
                        if (isValid(row, col, number)) {
                            board[row][col] = number;
                            if (solve()) {
                                return true;
                            } else {
                                board[row][col] = EMPTY;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean isValid(int row, int col, int number) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == number || board[i][col] == number) {
                return false;
            }
        }
        int boxRow = row - row % 3;
        int boxCol = col - col % 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] board = { {6, 5, 0, 0, 7, 9, 3, 0, 0},
                          {0, 0, 2, 0, 0, 0, 0, 0, 6},
                          {0, 0, 9, 0, 0, 5, 0, 0, 0},
                          {0, 0, 0, 0, 2, 0, 0, 8, 0},
                          {0, 9, 0, 0, 0, 0, 0, 0, 0},
                          {5, 3, 0, 0, 0, 8, 0, 0, 4},
                          {0, 0, 0, 1, 0, 0, 7, 0, 0},
                          {0, 0, 6, 0, 0, 0, 0, 0, 0},
                          {4, 8, 0, 0, 8, 2, 0, 0, 3} };
        SudokuSolver solver = new SudokuSolver(board);
        solver.solve();
        solver.printBoard();
    }
}
