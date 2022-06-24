import java.util.HashMap;

public class day52 {
    public static String functionCall(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put("s1.charAt(i)", 1);
        }
        System.out.println(map);
        Boolean flag = false;
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey("s2.charAt(i)")) {
                flag = true;
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
