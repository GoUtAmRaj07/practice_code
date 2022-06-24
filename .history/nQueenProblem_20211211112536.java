public class nQueenProblem {
    public static void main(String[] args) {
        int N = 4, row = 0, col = 0;
        int[][] board = new int[N][N];
        if (nQueen(board, row, col, N))
            System.out.println("found solution");
        else
            System.out.println("Not found");
    }

    private static Boolean nQueen(int[][] board, int row, int col, int N) {
        if (row == N)
            return true;
        for (col = 0; col < N; col++) {
            if (isSafe(board, row, col, N)) {
                board[row][col] = 1;
                if (nQueen(board, row + 1, col, N)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int n) {
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 1)
                return false;
        }
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 1)
                return false;
        }
        int x = row, y = col;
        while (x >= 0 && y >= 0) {
            if (board[x][y] == 1)
                return false;
            x--;
            y--;
        }
        x = row;
        y = col;
        while (x >= 0 && y < n) {
            if (board[x][y] == 1)
                return false;
            x--;
            y++;
        }
        return true;
    }
}