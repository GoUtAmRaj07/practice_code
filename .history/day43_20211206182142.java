public class day43 {
    public static int lengthOfMaximumSubarray(int[] arr) {
        int ans = 2, curr = 2;
        int pd = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (pd == arr[i] - arr[i - 1]) {
                curr++;
            } else {
                curr = 2;
                ans = Math.max(ans, curr);
            }
        }
        ans = Math.max(ans, curr);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2,3,4,5,6,7,8,9 4, 6, 8, 10, 11, 12 };
        System.out.println(lengthOfMaximumSubarray(arr));
    }
}
