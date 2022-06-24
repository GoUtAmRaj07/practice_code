import java.util.*;

public class usingStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        builder.append('b');
        builder.append('c');
        builder.append('d');
        builder.append('#');
        builder.append('e');
        builder.append('f');
        builder.append('#');
        builder.append('g');
        builder.append('h');
        int length = builder.length();
        System.out.println(builder);
        System.out.println(length);

        builder.deleteCharAt(length - 1);
        length = builder.length();
        System.out.println(builder);
        System.out.println(length);

        String s = builder.toString();
        String ans = backSpace(s);

    }

    private static String backSpace(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                str.deleteCharAt(str.length() - 1);
            } else
                str.append(s.charAt(i));
        }
        return str.toString();
    }
}