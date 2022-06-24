import java.util.Arrays;

public class day46 {

    static void print(int[][] solArr) {
        System.out.println("Result : ");
        for (int i = 0; i < solArr.length; i++) {
            for (int j = 0; j < solArr[i].length; j++) {
                System.out.print(solArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Boolean isSafe(int[][] arr, int x, int y, int n) {
        if (x < n && y < n && arr[x][y] == 1) {
            return true;
        }
        return false;
    }

    static Boolean solveMaze(int[][] matrix) {
        int[][] solArr = {
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 }
        };

        if (ratInMaze(matrix, 0, 0, 7, solArr) == false) {
            System.out.println("Not possible!!");
            return false;
        }
        print(solArr);
        return true;
    }

    public static Boolean ratInMaze(int[][] arr, int x, int y, int n, int[][] solArr) {

        if (isSafe(arr, x, y, n)) {
            solArr[x][y] = 1;
            if (ratInMaze(arr, x + 1, y, n, solArr)) {
                return true;
            }
            if (ratInMaze(arr, x, y + 1, n, solArr)) {
                return true;
            }
            solArr[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String args[]) {
        int[][] matrix = {
                { 1, 1, 0, 0, 1, 0, 1 },
                { 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0 },
                { 1, 0, 0, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 1, 0 },
                { 0, 0, 0, 0, 1, 1, 1 }
        };

        day46.solveMaze(matrix);

    }
}