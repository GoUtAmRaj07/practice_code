import java.util.Scanner;

public class day29 {
    private static void printPattern(int n) {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.println(j + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        printPattern(n);
    }
}