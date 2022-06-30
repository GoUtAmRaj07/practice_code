import java.util.*;

public class subSet {
    public static void main(String[] args) {
        int[] arr = { -1, -1, 1 };
        int[] prefixSum = new int[arr.length];
        int t = 0;
        int c = 0;
        LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();
        prefixSum[0] = arr[0];
        mp.put(prefixSum[0], 0);

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
            mp.put(prefixSum[i], i);
            if (mp.containsKey(prefixSum[i] - t)) {
                c++;
                System.out.println("Subarray found ! : " + c);
            }
            // prefixSum[i] = arr[i] + prefixSum[i - 1];
            // mp.put(prefixSum[i], i);
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
