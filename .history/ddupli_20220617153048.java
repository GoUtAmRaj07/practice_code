import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class ddupli {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 3, 4, 5, 6, 7, 8, 1, 2, 67, 7, 8, 9 };
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new LinkedList<>();
        for (int i : array) {
            set.add(i);
        }
        for (int i : set) {
            list.add(i);
        }
        System.out.println(list);
    }
}