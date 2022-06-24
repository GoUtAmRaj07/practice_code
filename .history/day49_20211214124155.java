public class day49 {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 3, 2, 5 };
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int leftMax = height[0], rightMax = height[height.length - 1];
        for (int i = 0; i < height.length; i++) {
            if (height[i] > leftMax)
                leftMax = height[i];
            left[i] = leftMax;
        }
        for (int i = height.length - 1; i >= 0; i--) {
            if (height[i] > rightMax)
                rightMax = height[i];
            right[i] = rightMax;
        }
        int water = 0;
        System.out.println("left array : ");
        for (int i = 0; i < height.length; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.println("right array : ");
        for (int i = 0; i < height.length; i++) {
            System.out.print(right[i] + " ");
        }
        for (int i = 0; i < height.length; i++) {
            water += (Math.min(left[i], right[i]) - height[i]);
        }
    }
}
