import java.util.*;

public class sortingTwoArrays {
    public static void majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums)
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        int n = nums.length;
        int c = (int) Math.floor(n / 3);
        // List<Integer> ls = new ArrayList<>();
        System.out.println("Map elements");
        for (int i : mp.keySet())
            System.out.println("Key : " + i + " Value : " + mp.get(i));
        for (int i : mp.keySet())
            if (mp.get(i) > c)
                System.out.println("greater than n/3 : " + mp.get(i));
        // return ls;
    }

    public static void main(String args[]) {
        int[] arr1 = { 3, 2, 3 };
        // int[] arr2 = { 1, 3 };

        majorityElement(arr1);

        System.out.println("Completed execution");

    }

}
