import java.util.Scanner;

public class day30 {
    private static void primeSeive(int n) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++)
            arr[i] = 0;
        for (int i = 2; 1 <= n; i++) {
            if (arr[i] == 0) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        primeSeive(n);
    }
}