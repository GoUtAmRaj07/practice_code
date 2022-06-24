import java.util.Collections;
import java.util.PriorityQueue;

public class day37 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        pq.add(1);
        pq.add(2);
        pq.add(5);
        pq.add(6);
        pq.add(8);
        pq.add(24);
        pq.add(9);

        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
