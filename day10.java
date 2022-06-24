import java.util.Scanner;
import java.util.*;

class day10 {
    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    static void printarray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    static void randomarray(int[] val) {
        for (int i = 0; i < val.length; i++) {
            val[i] = new Random().nextInt(100);
        }
    }

    static void reversearray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            swap(array[i], array[j]);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        randomarray(array);
        System.out.println("\nElements of the array : ");
        printarray(array);
        reversearray(array);
        System.out.println("\nArray after reversing : ");
        printarray(array);
    }
}