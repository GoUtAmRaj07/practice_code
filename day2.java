import java.util.Scanner;
import java.util.*;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the sum you want to find : ");
        int sum = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println("The pair is : " + array[i] + " and " + array[j]);
                }
            }
        }

    }
}
