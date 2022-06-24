// import java.util.Scanner;
// import java.util.*;
// import java.util.Random;

// public class day3 {
//     void swap(int i, int j) {
//         int temp;
//         temp = i;
//         i = j;
//         j = temp;
//     }

//     void sort(int arr[], int n) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 if (arr[j] < arr[i]) {
//                     swap(arr[j], arr[i]);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("\nEnter the size of the array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         // Random rand = new Random();
//         // System.out.println("\nEnter the upper bound of the array : ");
//         // int upper_bound = sc.nextInt();
//         // for (int i = 0; i < n; i++) {
//         // arr[i] = rand.nextInt(100);
//         // }
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = new Random().nextInt(100);
//         }
//         System.out.println("\nElements of the array are : ");
//         for (int i : arr) {
//             System.out.println(arr[i] + " ");
//         }
//     }
// }

import java.util.Random;

public class day3 {
    public static void main(String[] args) {
        double[] val = new double[10];
        System.out.println("Random number array...");
        for (int i = 0; i < val.length; i++) {
            val[i] = new Random().nextInt(100);
        }
        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i] + " ");
        }
    }
}