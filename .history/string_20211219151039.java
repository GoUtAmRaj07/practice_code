public class string {
    public static void main(String[] args) {
        String s = "abcabacsnbch";
        String res = longestPalindrone(s);
        System.out.println(res);
    }

    private static String longestPalindrone(String s) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > start - end) {
                start = i + ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandFromMiddle(String s, int left, int right) {
        if (s == null || s.length() < 1)
            return 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}