public class day46q1 {
    public static void main(String[] args) {
        int x = 12;
        int y = 13;
        int b = 12 >> 2;

        System.out.print(b << 2);
        System.out.print(x & y);
        System.out.print(x | y);
        System.out.print(x ^ y);
        System.out.print(~y);
    }
}
