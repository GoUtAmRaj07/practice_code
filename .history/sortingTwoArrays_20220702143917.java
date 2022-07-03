import java.util.*;

public class sortingTwoArrays {
    public static void main(String args[]) {
        int[] arr1 = { 1, 2, 2, 4 };
        // int[] arr2 = { 1, 3 };

        int x = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            x ^= arr1[i];
        }

        System.out.println(x);

    }

}
