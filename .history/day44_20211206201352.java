public class day44 {
    public static int recordBreaking(int[] arr) {
        int ans = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length - 2; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] && arr[i] > max) {
                ans++;
            } else {
                max = Math.max(max, arr[i]);
            }
        }
        if (arr[arr.length - 1] > max)
            ans++;

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 3, 8, 1, 2, 10 };
        System.out.println(recordBreaking(arr));
    }
}