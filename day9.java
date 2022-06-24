import java.util.Scanner;
import java.util.*;

public class day9 {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static boolean findsum(int[] arr, int sum) {
        int i, j;
        i = 0;
        j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == sum) {
                return true;
            } else if (arr[i] + arr[j] < sum) {
                i++;
            } else
                j--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = new Random().nextInt(50);
        }
        System.out.println("Elements of the array before sorting: ");
        printarray(arr);
        Arrays.sort(arr);
        System.out.println("Elements of the array after sorting: ");
        printarray(arr);

        System.out.println("Enter the sum you seek to find : ");
        int sum = sc.nextInt();

        boolean result = findsum(arr, sum);
        if (result) {
            System.out.println("The sum was found!!");
        } else {
            System.out.println("Sum not found!!");
        }
    }
}