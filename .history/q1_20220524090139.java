import java.io.*;
import java.util.*;

public class q1 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int posi = 0, posj = 0;
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char ch = sc.next().charAt(0);
                if (ch == 'p') {
                    posi = i;
                    posj = j;
                }
                arr[i][j] = ch;
            }
        }

        if (posi == 0 && posj == n - 1) {
            for (int i = 0; i < n / 2; i++) {
                System.out.println("LEFT");
            }
            for (int i = 0; i < n / 2; i++) {
                System.out.println("UP");
            }
        }
        if (posi == 0 && posj == 0) {
            for (int i = 0; i < n / 2; i++) {
                System.out.println("RIGHT");
            }
            for (int i = 0; i < n / 2; i++) {
                System.out.println("UP");
            }
        }
        if (posi == n - 1 && posj == 0) {
            for (int i = 0; i < n / 2; i++) {
                System.out.println("LEFT");
            }
            for (int i = 0; i < n / 2; i++) {
                System.out.println("DOWN");
            }
        }
        if (posi == n - 1 && posj == n - 1) {
            for (int i = 0; i < n / 2; i++) {
                System.out.println("RIGHT");
            }
            for (int i = 0; i < n / 2; i++) {
                System.out.println("DOWN");
            }
        }
    }
}