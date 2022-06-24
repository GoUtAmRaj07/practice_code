import java.util.*;
import java.util.Scanner;

public class day31 {
    static boolean isSort(int[] arr, int n) {
        if (n == 1)
            return true;

        if (arr[n] > arr[n - 1])
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements  of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (isSort(arr, n - 1))
            System.out.println("\nArray is sorted!!");
        else
            System.out.println("\nArray is not sorted!!");
    }
}