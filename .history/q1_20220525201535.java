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
        subSeq(0, arr, ans, 4);

    }

    private static void subSeq(int i, int[] arr, List<Integer> ans, int k) {
        if (sum(ans, k)) {
            System.out.println(ans);
            return;
        }
        subSeq(i + 1, arr, ans, k);
        ans.add(arr[i]);
        subSeq(i + 1, arr, ans, k);
        ans.remove(ans.size() - 1);
        // subSeq(i + 1, arr, ans, k);
    }

    private static boolean sum(List<Integer> ans, int k) {
        int sum = 0;
        for (int i = 0; i < ans.size(); i++) {
            sum = ans.get(i);
        }
        if (sum == k)
            return true;
        return false;
    }
}