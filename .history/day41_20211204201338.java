public class day41 {
    public static void print(int n) {
        if (n == 0)
            return;
        else {
            System.out.print(n + " ");
            print(n - 1);
        }
    }

    public static void main(String[] args) {
        print(9);
    }
}