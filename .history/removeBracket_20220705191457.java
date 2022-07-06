import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class removeBracket {
    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack();
        // List<Integer> start = new ArrayList<>();
        // List<Integer> e = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.empty() && ch == '(') {
                set.add(i);
                st.push(ch);
            } else if (ch == '(') {
                st.push('(');
            } else if (ch == ')' & st.size() > 1) {
                st.pop();
            } else if (ch == ')' && st.size() == 1) {
                set.add(i);
                st.pop();
            }
        }
        for (int i : set) {
            System.out.println(i);
        }
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (set.contains(i)) {
                System.out.println("deleted char : " + sb.charAt(i) + " at index " + i);
                System.out.println("new length : " + sb.length());
                sb.deleteCharAt(i);
            }
        }
        s = sb + "";
        return s;
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        removeOuterParentheses(s);
    }
}
