public class day14 {
    public static int lengthOfSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[200];
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        String string = "bbbbb";
        int ans = lengthOfSubstring(string);
        System.out.println("ANswer is : " + ans);
    }

}
