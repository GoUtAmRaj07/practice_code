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
        int num = 58;
        int k = 9;
        System.out.println(minimumNumbers(num, k));
    }
}
