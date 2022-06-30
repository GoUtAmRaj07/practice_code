import java.util.*;

public class longestSUbstringWithoutRepeatingChar {
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0, len = 0;
        String str = "";
        String ans = "";
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (mp.containsKey(s.charAt(j))) {
                    len = 0;
                    str = "";
                    mp.clear();
                } else {
                    len += 1;
                    str += s.charAt(j);
                    mp.put(s.charAt(j), 1);
                    if (maxLen < len) {
                        maxLen = len;
                        ans = str;
                        System.out.println("answer string : " + ans);
                    }
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "jbpnbwwd";
        int len = lengthOfLongestSubstring(str);
        System.out.println(len);
    }
}
