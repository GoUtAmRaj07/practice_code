import java.util.Scanner;

class traverse {
    public static void rowWiseTraversal(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void colElements(int[][] arr) {
        int n = arr.length;
        int[] colElement = new int[n];
        for (int i = 0; i < n; i++) {
            colElement[i] = arr[i][0];
        }
        System.out.println(colElement);
    }
}

public class columnWiseTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter element of matrrix : ");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        traverse.colElements(arr);
    }
}
