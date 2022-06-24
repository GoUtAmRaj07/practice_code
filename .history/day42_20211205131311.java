public class day42 {
    public static int sum(int n) {
        int s = 0;
        if (n == 0)
            return 0;
        return s + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.print(sum(5));
    }
}