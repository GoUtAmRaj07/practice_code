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

    private static int[] nextGreaterElement(int[] arr, Stack<Integer> stack) {
        int[] ans = new int[arr.length];
        Arrays.fill(ans, -1);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if (stack.peek() > arr[i]) {
                    ans[i] = stack.peek();
                    stack.push(arr[i]);
                } else {
                    /*
                     * while (!stack.isEmpty()) {
                     * if (stack.peek() > arr[i]) {
                     * ans[i] = stack.peek();
                     * stack.push(arr[i]);
                     * } else {
                     * stack.pop();
                     * }
                     * }
                     */
                    stack.push(arr[i]);
                }
            }
        }
        return ans;
    }
}
