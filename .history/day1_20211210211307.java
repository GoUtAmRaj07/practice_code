import java.util.Scanner;
import java.util.*;

public class day1 {
    public static void main(String[] args) {
        int n = 5;

        int[][] res = new int[10][10];
        Arrays.fill(res, 0);
        System.out.print(res);
        if ((n & 1) == 1)
            System.out.println("odd number");
        else
            System.out.println("even number");
    }
}