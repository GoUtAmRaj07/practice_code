import java.util.Scanner;
import java.util.*;

public class day11 {
    public static int sum(int[] array) {
        int n = array.length;
        int Sum = 0;
        if (n % 2 != 0) {
            while (n > 0) {
                if (n % 2 == 0) {
                    Sum += array[n - 1] * array[n - 1];
                } else {
                    Sum -= array[n - 1] * array[n - 1];
                }
                n--;
            }
        } else {
            while (n > 0) {
                if (n % 2 != 0) {
                    Sum += array[n - 1] * array[n - 1];
                } else {
                    Sum -= array[n - 1] * array[n - 1];
                }
            }
            n--;
        }
        return Sum;
    }

    public static void randomarray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = new Random().nextInt(100);
        }

    }

    public static void printarray(int[] array) {
        System.out.println("Elements of the array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Legth of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        System.out.println("Length of the array is  : " + array.length);
        printarray(array);
        int sum = sum(array);
        System.out.println("Required sum : " + sum);

    }
}