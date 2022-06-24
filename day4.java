import java.util.*;
import java.util.Scanner;

public class day4 {

    private static void swap(int i, int j) {
        int temp = 0;
        temp = i;
        i = j;
        j = temp;
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr[i], arr[j]);
                }
            }
        }
    }

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(25);
        }
        System.out.println("\nElements of the array are before sorting : ");
        printarray(arr);

        System.out.println("Elements of the array are after sorting : ");
        sort(arr);
        printarray(arr);

    }

}
