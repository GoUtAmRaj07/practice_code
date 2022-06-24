import java.util.*;

public class priorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr = { 4, 6, 12, 5, 6, 3, 5, 1, 2, 3, 7, 5, 9, 32, 9 };
        for (int i : arr) {
            queue.add(i);
        }
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
