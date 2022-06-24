import java.util.Scanner;

public class day22 {
    static boolean targetSumPossible(int n, int[] arr, int target) {
        boolean result = false;
        int sum = 0, i = 0;
        while (i < n) {
            if (sum < target) {
                sum += arr[i];
            } else if (sum == target) {
                result = true;
                break;
            }
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum : ");
        int target = sc.nextInt();
        System.out.println("Enter the size of the arra y: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        boolean result = targetSumPossible(n, array, target);
        if (result)
            System.out.println("It is possible!!");
        else
            System.out.println("Not possible!!");
    }
}
