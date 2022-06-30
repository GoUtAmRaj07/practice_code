import java.util.*;

public class balanced {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.add(ch);
            }
            if (st.isEmpty())
                return false;
            if (ch == ')') {
                if (st.peek() != '(')
                    return false;
                else
                    st.pop();
            } else if (ch == '}') {
                if (st.peek() != '{')
                    return false;
                else
                    st.pop();
            } else {
                if (st.peek() != '[')
                    return false;
                else
                    st.pop();
            }
        }
        System.out.println("Elements of stack are : " + st);
        if (!st.isEmpty())
            return false;
        return true;
    }

    public static void main(String args[]) {
        String str = "()";
        if (isValid(str)) {
            System.out.println("balanced!!!!!!!!!!!!!!");
        } else {
            System.out.println("Not ");
        }

    }
}
