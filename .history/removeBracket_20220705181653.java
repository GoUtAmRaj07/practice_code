import java.util.Stack;

public class removeBracket {
    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack();
        // List<Integer> start = new ArrayList<>();
        // List<Integer> e = new ArrayList<>();
        int[] start = new int[100];
        int[] e = new int[100];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.empty() && ch == '(') {
                start[i] = 1;
                st.push(ch);
            } else if (ch == '(') {
                st.push('(');
            } else if (ch == ')' & st.size() > 1) {
                st.pop();
            } else if (ch == ')' && st.size() == 1) {
                e[i] = 1;
                st.pop();
            }
        }
        for (int i = 0; i < start.length; i++) {
            if (start[i] == 1) {
                System.out.println(i);
            }
        }
        for (int i = 0; i < start.length; i++) {
            if (e[i] == 1) {
                System.out.println(i);
            }
        }
        StringBuilder sb = new StringBuilder(s);
        // for(int i = 0;i < start.length ; i++) {
        // sb.deleteCharAt(start.get(i));
        // }
        // for(int i = 0;i < e.size() ; i++) {
        // sb.deleteCharAt(e.get(i));
        // }
        s = sb + "";
        return s;
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        removeOuterParentheses(s);
    }
}
