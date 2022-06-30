import java.util.Arrays;
import java.util.Collections;

public class sumOfNumberWithUnitDigitK {
    public static int minimumNumbers(int num, int k) {
        int ans = 0;
        for (int i = k; i <= num; i += 10) {
            int snum = num - i;
            if (snum % 10 == k) {
                System.out.println("snum value :" + snum + " k value : " + i);
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 30, 3, 5, 9 };
        String s = "";
        for (int i : arr) {
            s += i;
        }
        char[] arr2 = s.toCharArray();
        Arrays.sort(arr2);
        reverse(arr2);
        System.out.println(arr2);
    }

    private static void reverse(char[] arr2) {
        int i = 0, j = arr2.length - 1;
        while (i < j) {
            arr2[i] = (char) (arr2[i] ^ arr2[j] ^ (arr2[j] = arr2[i]));
            i++;
            j--;
        }
    }
}
