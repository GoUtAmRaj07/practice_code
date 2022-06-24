import java.util.HashMap;
import java.util.Map;

public class day52 {
    public static String functionCall(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), 1);
        }
        System.out.println(map);
        Boolean flag = false;
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(s2.charAt(i))) {
                flag = true;
                break;
            }
        }
        if (flag)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        String s1 = "art";
        String s2 = "cat";
        String ans = functionCall(s1, s2);
        System.out.println(ans);
    }
}
