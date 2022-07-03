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
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int res1 = nums[i] + mp.get(nums[j]);
                int res2 = nums[j] + mp.get(nums[i]);
                System.out.println("nums[i] :" + nums[i] + " nums[j] : " + nums[j] + " mp.get(nums[j]) : "
                        + mp.get(nums[j]) + " mp.get(nums[i]) : " + mp.get(i));
                System.out.println("res 1 :" + res1 + " res2 :" + res2);
                if (res1 == res2)
                    ans++;
            }
        }

        System.out.println("Totaa number of such pairs : " + ans);
    }
}
