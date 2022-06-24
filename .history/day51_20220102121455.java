import java.util.Stack;

public class day51 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 6, 8, 4, 12, 4, -1, 0, 4, 34, 1, 4 };
        Stack<Integer> S = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            while (!S.empty() && S.peek() >= arr[i]) {
                S.pop();
            }
            if (S.empty()) {
                System.out.print("-1, ");
            } else {
                System.out.print(S.peek() + ", ");
            }
            S.push(arr[i]);
        }
    }
}
