import java.util.*;

public class subSet {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] prefixSum = new int[arr.length];
        int t = 5;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        prefixSum[0] = arr[0];
        mp.put(arr[0], prefixSum[0]);

        for (int i = 1; i < arr.length; i++) {
            if (mp.containsKey(prefixSum[i] - t)) {
                System.out.print("Subarray found !");
            }
            prefixSum[i] = arr[i] + prefixSum[i - 1];
            mp.put(prefixSum[i], i);
        }

        for (int i : prefixSum) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : mp.keySet()) {
            System.out.println("key :" + i + " || value :" + mp.get(i));
        }

    }
}
