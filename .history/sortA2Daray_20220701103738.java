import java.util.*;

public class sortA2Daray {
    public static void main(String args[]) {
        int[][] array = {
                { 1, 3 },
                { 2, 2 },
                { 3, 1 }
        };
        Arrays.sort(array, (a, b) -> (b[1] - a[1]));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}