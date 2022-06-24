import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class q1 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        List<Integer> ans = new ArrayList<Integer>();
        int[] arr = { 1, 2, 3, 2 };
        subSeq(0, arr, ans, 4, 0);

    }

    private static void subSeq(int i, int[] arr, List<Integer> ans, int k, int resSum) {
        if (i == arr.length) {
            if (resSum == k) {
                System.out.println(ans);
            }
            // System.out.println(ans);
            return;
        }

        if (resSum == k) {
            System.out.println(ans);
        }

        subSeq(i + 1, arr, ans, k, resSum);
        ans.add(arr[i]);
        resSum += arr[i];
        subSeq(i + 1, arr, ans, k, resSum);
        resSum -= ans.get(ans.size() - 1);
        ans.remove(ans.size() - 1);
    }

    private static boolean sum(List<Integer> ans, int k) {
        int s = 0;
        for (int i = 0; i < ans.size(); i++) {
            s += ans.get(i);
        }
        if (s == k)
            return true;
        return false;
    }

}