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
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void reverse(int[] arr) {
        reverseArr(arr, 0, arr.length - 1);
    }

    private static void reverseArr(int[] arr, int i, int j) {
        if (i >= j)
            return;
        swap(arr, i, j);
        reverseArr(arr, i + 1, j - 1);
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
    }
}