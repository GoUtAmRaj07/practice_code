import java.util.*;

public class maxDigit {
    private static int maxdigit(String s) {
        int maxDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("current digit in the string : " + Integer.valueOf(s.charAt(i) - '0'));
            maxDigit = Math.max(maxDigit, Integer.valueOf(s.charAt(i)));
            System.out.println("max digit in the string : " + maxDigit);
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        String s = "34739";

        int n = maxdigit(s);
        System.out.println(n);
    }
}