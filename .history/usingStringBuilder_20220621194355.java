import java.util.*;

public class usingStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        builder.append('b');
        builder.append('c');
        builder.append('d');
        builder.append('e');
        builder.append('f');
        builder.append('g');
        builder.append('h');
        int length = builder.length();
        System.out.println(builder);
        System.out.println(length);

        builder.deleteCharAt(length - 1);
        length = builder.length();
        System.out.println(builder);
        System.out.println(length);

    }
}