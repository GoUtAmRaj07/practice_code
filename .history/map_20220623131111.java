import java.util.*;

public class map {
    public static void main(String args[]) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for (int i : mp.keySet()) {
            System.out.println("key : " + i + " value : " + mp.get(i));
        }

    }
}
