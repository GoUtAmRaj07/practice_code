import java.util.Arrays;
import java.util.*;

public class day1 {
    static void subString(String ans, String str, int i) {
        if (str.length() == i) {
            System.out.println(ans);
            return;
        }
        subString(ans + str.charAt(i), str, i + 1);
        subString(ans, str, i + 1);

    }

    public static void main(String[] args) {
        subString("", "answ", 0);
    }
}