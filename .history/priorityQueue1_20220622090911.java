import java.util.*;

public class priorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int[][] arr = {
                { 1, 2 },
                { 3, 4 },
                { 4, 6 },
                { 4, 3 },
                { 1, 5 },
                { 9, 1 }
        };
        for (int[] i : arr) {
            queue.add(i);
        }
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
