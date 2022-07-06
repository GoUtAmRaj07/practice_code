public class changeChar {
    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            System.out.println("current char : " + s.charAt(indices[i]));
            arr[i] = s.charAt(indices[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("current char : " + arr[i]);
        }
        return "";
    }

    public static void main(String args[]) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String ans = restoreString(s, indices);

        System.out.println(ans);

    }
}
