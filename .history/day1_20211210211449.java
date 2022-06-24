import java.util.Arrays;
import java.util.*;

public class day1 {
    public static void main(String[] args) {
        int n = 5;

        int[][] res = new int[10][10];
        Arrays.fill(res, 0);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println("\n");
        }
        if ((n & 1) == 1)
            System.out.println("odd number");
        else
            System.out.println("even number");
    }
}