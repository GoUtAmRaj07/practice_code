import java.util.Arrays;

public class day46 {
    public static Boolean isSafe(int[][] arr, int x, int y, int n) {
        if (x < n && y < n && arr[x][y] == 1) {
            return true;
        }
        return false;
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

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 0, 0, 1, 0, 1 },
                { 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0 },
                { 1, 0, 0, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 1, 0 },
                { 0, 0, 0, 0, 1, 1, 1 }
        };

        int[][] solArr = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                solArr[i][j] = 0;
            }
        }

        if (ratInMaze(matrix, 0, 0, 7, solArr))
            System.out.println("Can trevael!!");
        else
            System.out.println("not!!");
        System.out.println("Resultb : ");
        for (int i = 0; i < solArr.length; i++) {
            for (int j = 0; j < solArr[i].length; j++) {
                System.out.println(solArr[i][j] + " ");
            }
        }
    }
}