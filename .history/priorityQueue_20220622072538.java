import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr = { 2, 4, 7, 1, 8, 1 };
        for (int i : arr) {
            pq.add(i);
        }
        System.out.println("PQ elements: ");
        Iterator itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        int k = 2;
        while (k-- > 1) {
            pq.poll();
        }
        System.out.println(pq.peek());
    }
}