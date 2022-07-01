import java.util.*;

public class moveToEqualArray {
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        System.out.println("Initial value of variable ans : " + ans);
        // odd condition
        if ((n & 1) == 1) {
            int mid = nums[n / 2];
            System.out.println("mid value for odd condition : " + mid);
            for (int i : nums) {
                ans = ans + Math.abs(mid - i);
                System.out.println("ans value : " + ans);
            }
            // return ans;
        } else {
            int mid = nums[n / 2];
            System.out.println("mid value for even condition : " + mid);
            for (int i : nums) {
                ans = ans + Math.abs(mid - i);
                System.out.println("ans value : " + ans);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3 };
        System.out.println(minMoves2(arr));

    }
}
