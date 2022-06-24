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
        while (pq.size() > 0) {
            int num1 = pq.poll();
            int num2 = pq.poll();
            int diff = num1 - num2;
            System.out.println("num1 : " + num1 + " num2 : " + num2 + " diff : " + diff);
            pq.offer(diff);
            System.out.println("PQ elements: ");
            Iterator itr = pq.iterator();
        }
        System.out.println(pq.peek());
    }
}