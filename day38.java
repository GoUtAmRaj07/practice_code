import java.util.ArrayList;
import java.util.Scanner;

public class day38 {
    public static Boolean sumPresent(int[] arr , int n , int target){
        if(n == 0) return 
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum : ");
        int target = sc.nextInt();
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the element : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Boolean result = sumPresent(arr, n, target);
    }
}
