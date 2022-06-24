import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class nextGreaterEle {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) { // scanner class in try block
            Stack<Integer> stack = new Stack<Integer>();
            System.out.print("Enter number of elements of array : ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements of array : ");
            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }
            int[] ans;
            ans = nextGreaterElement(arr, stack);
            System.out.println("Elements of next greater element array are : ");
            for (int i = 0; i < n; ++i) {
                System.out.print(ans[i] + " ");
            }
        }
    }

    private static int[] nextGreaterElement(int[] arr, Stack<Integer> s) {
        int nge[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!s.empty()) {
                while (!s.empty() && s.peek() <= arr[i]) {
                    s.pop();
                }
            }
            nge[i] = s.empty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        return nge;
    }
}
