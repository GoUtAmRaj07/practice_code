public class day50 {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 3, 7, 1, 5, -1, 3, 12, 4, 10 };
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    arr2[i] = arr[j];
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
