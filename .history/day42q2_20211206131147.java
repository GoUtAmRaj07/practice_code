public class day42q2 {
    public static int binaryToDecimal(String s) {
        int ans = 0;
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                ans += 2 ^ j;
            }
            j++;
        }
        return ans;
    }

    // binary to decimal
    public static void main(String[] args) {
        String s = "110";
        System.out.println(binaryToDecimal(s));
    }
}
