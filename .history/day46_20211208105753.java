public class day46 {
    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 9, b = 10;
        System.out.println("After swaping : " + a + " " + b);
    }
}