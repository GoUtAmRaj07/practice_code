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
        int[] arr = { 1, 2, 3 };
        subSeq(0, arr, ans);

    }

    private static void subSeq(int i, int[] arr, List<Integer> ans) {
        if (i == arr.length) {
            System.out.println(ans);
        }
        subSeq(i + 1, arr, ans);
        ans.add(arr[i]);
        subSeq(i + 1, arr, ans);
        ans.remove(arr[i]);
        // subSeq(i + 1, arr, ans);
    }
}