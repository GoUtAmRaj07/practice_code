public class charFreqArray {
    public static void main(String[] args) {
        String str = "wefjbercburwibvr";
        freqOfChar(str);
    }

    private static void freqOfChar(String str) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        int i = 0;
        char ch = 'a';
        for (i = 0, ch = 'a'; ch <= 'z'; ch++, i++) {
            System.out.println(ch + " " + arr[i]);
        }
    }
}
