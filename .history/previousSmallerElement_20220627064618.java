import java.util.*;

public class previousSmallerElement {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 6, 2, 3, 2, 5, 7, 9, 0, 8, 9, 1, 12, 56 };
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
    }
}