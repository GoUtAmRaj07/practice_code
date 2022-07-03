import java.util.*;

public class countNicePairs {
    private static int rev(int num) {
        int res = 0;
        while (num > 0) {
            int r = num % 10;
            res = res * 10 + r;
            num /= 10;
        }
        return res;
    }

    public static void main(String args[]) {
        int[] nums = { 42, 11, 1, 97 };
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], rev(nums[i]));
        }
        for (int i : mp.keySet()) {
            System.out.println("key: " + i + " value: " + mp.get(i));
        }
    }
}
