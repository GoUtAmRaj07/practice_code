import java.util.Scanner;

class day23 {
    static int max(int a, int b) {
        return ((a < b) ? a : b);
    }

    static boolean targetSum(int t, int[] arr, int n) {
        if (t == 0)
            return true;
        if (n == 0)
            return false;
        if (arr[n - 1] > t)
            return targetSum(t, arr, n - 1);
        else
            return (targetSum(t, arr, n - 1) || targetSum(t - arr[n - 1], arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum : ");
        int target = sc.nextInt();
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        if (targetSum(target, arr, n) == true)
            System.out.println("Found!!");
        else
            System.out.println("Not found!!");
    }
}