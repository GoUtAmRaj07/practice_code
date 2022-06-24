import java.util.*;

public class day40q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int[] array = new int[n];
        for (i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<Integer>();
        for (i = 0; i < n; i++) {
            set.add(array[i]);
        }
        System.out.println(set);
    }
}
