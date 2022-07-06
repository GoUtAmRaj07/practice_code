import java.util.*;

public class maxSumWithoutAdjacent {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 7, 10 };
        System.out.println(sum(arr, 4));
    }

    private static int sum(int[] arr, int ind) {
        if (ind == 0)
            return arr[ind];
        if (ind < 0)
            return 0;

        int pick = arr[ind] + sum(arr, ind - 2);
        int not_pick = 0 + sum(arr, ind - 1);

        return Math.max(pick, not_pick);
    }
}
