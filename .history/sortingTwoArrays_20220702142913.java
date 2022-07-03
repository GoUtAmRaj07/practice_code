import java.util.*;

public class sortingTwoArrays {
    public static void main(String args[]) {
        int[] arr1 = { 1, 2, 4 };
        int[] arr2 = { 1, 3 };

        int maxDiffHorizontal = -1;
        int maxDiffVertical = -1;
        for (int i = 1; i < arr2.length; i++) {
            maxDiffHorizontal = Math.max(maxDiffHorizontal, arr1[i] - arr1[i - 1]);
        }
        System.out.println(maxDiffHorizontal);
        for (int i = 1; i < arr2.length; i++) {
            maxDiffVertical = Math.max(maxDiffVertical, arr2[i] - arr2[i - 1]);
        }
        System.out.println(maxDiffVertical);
    }

}
