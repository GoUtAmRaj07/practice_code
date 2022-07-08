import java.util.*;
import java.util.ArrayList;

public class subSequence {
    public static void main(String[] args) {
        java.util.List<List<Integer>> list = new java.util.ArrayList<>();
        int[] arr = { 1, 2, 3, 4 };
        formSubsequence(0, arr, new java.util.ArrayList<>());
    }

    private static void formSubsequence(int ind, int[] arr, ArrayList ls) {
        if (ind == arr.length) {
            System.out.println(ls);
            return;
        }
        ls.add(arr[ind]);
        formSubsequence(ind + 1, arr, ls);
        ls.remove(ls.size() - 1);
        formSubsequence(ind + 1, arr, ls);
    }
}
