public class string {
    public static void main(String[] args) {
        String s = "aba";
        String res = longestPalindrone(s);
        System.out.println(res);
    }

    private static String longestPalindrone(String s) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s, i, i);
            System.out.println("len1 : " + len1);
            int len2 = expandFromMiddle(s, i, i + 1);
            System.out.println("len2 : " + len2);
            int len = Math.max(len1, len2);
            System.out.println("Max of len1 and len2: " + len);
            if (len > start - end) {
                System.out.println("Executed i value : " + (i));
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
            System.out.println("New start : " + start + " end : " + end + "\n");
        }
        System.out.println("Final start : " + start + " end : " + end);
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
