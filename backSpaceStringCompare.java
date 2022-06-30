import java.util.*;

public class backSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#')
                st.pop();
            else
                st.add(s.charAt(i));
        }
        System.out.println("element in stack after 1st string : " + st);
        while (!st.empty()) {
            str1.append(st.pop());
        }
        System.out.println("String builder 1 : " + str1);
        String string1 = str1 + "";

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#')
                st.pop();
            else
                st.add(t.charAt(i));
        }
        System.out.println("elemen in stack after second string : " + st);
        while (!st.empty()) {
            str2.append(st.pop());
        }
        System.out.println("String builder 1 : " + str1);
        String string2 = str2 + "";
        if (string1.compareTo(string2) == 0)
            return true;
        return false;
    }

    public static void main(String args[]) {
        String s = "ab#c";
        String t = "ad#c";
        if (backspaceCompare(s, t)) {
            System.out.println("matched ");

        } else {
            System.out.println("Not matched ");
        }
    }
}
