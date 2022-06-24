import java.util.Arrays;

public class day45 {
    public static Boolean isSorted(int[] arr, int n) {
        if (n == 0 || n == 1)
            return true;

        return arr[n - 1] > arr[n - 2] && isSorted(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 4, 5, 6, 7, 8, 9, 10 };
        if (isSorted(arr, 10))
            System.out.println("sorted");
        else
            System.out.println("Not");
    }
}
