import java.util.Arrays;

public class day44q1 {
    public static int firstRepeatingElement(int[] arr) {
        int ans = 0;
        int[] arr1 = new int[arr.length];
        Arrays.fill(arr1, -1);
        for (int i = 0; i < arr.length; i++) {
            if (arr1[arr[i]] == 1) {
                ans = arr[i];
                break;
            } else {
                arr1[arr[i]]++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 5, 2, 6 };
        System.out.println(firstRepeatingElement(arr));
    }
}
