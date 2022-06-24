import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr = { 4, 2, 7, 5, 9, 2, 4, 6, 9, 12, 11, 2, 3, 43, 1, 12, 11, 14, 1 };
        for (int i : arr) {
            pq.add(i);
        }
        System.out.println("PQ elements: ");
        Iterator itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}