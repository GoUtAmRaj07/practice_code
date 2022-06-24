public class nQueenProblem {
    public static void main(String[] args) {
        int N = 4;
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        nQueen(board, N);
    }

    private static void nQueen(int[][] board, int n) {
    }
}