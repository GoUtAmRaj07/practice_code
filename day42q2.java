public class day42q2 {
    public static int binaryToDecimal(String s) {
        int ans = 0;
        int j = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                ans += j;
            }
            j *= 2;
        }
        return ans;
    }

    // binary to decimal
    public static void main(String[] args) {
        String s = "111";
        System.out.println(binaryToDecimal(s));
    }
}
