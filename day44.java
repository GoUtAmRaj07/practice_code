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
        int[] arr = { 1, 2, 0, 7, 2, 0, 2, 2 };
        System.out.println(recordBreaking(arr));
    }
}