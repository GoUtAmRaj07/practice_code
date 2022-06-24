import java.util.Scanner;

public class day39 {

    public static void main(String[] args) {
        /*
         * Your class should be named Solution. Read input as specified in the question.
         * Print output as specified in the question. Write your code here
         */

        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter string: ");
        s = sc.nextLine();
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '7' || s.charAt(i) == '4') {
                len++;
            } else {
                len = 0;
                continue;
            }
        }
        if (len == 0)
            System.out.println("-1");
        else
            System.out.println(len);
    }

}