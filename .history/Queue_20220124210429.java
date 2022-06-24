import java.util.Scanner;

public class Queue {
    private static int topElement(int[] arr) {
        return 0;
    }

    private static int removeElement(int[] arr, int back) {
        return 0;
    }

    private static void addElement(int[] arr) {
        int top = 0;
        int n = arr.length;
        int numOfElements;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of elements you want to enter in queue!!");
        int size = sc.nextInt();

        if (size > n) {
            System.out.println(
                    "Numbers of elements you want to enter is queue is greater than size!!\nPlease enter less than the size of queue");
            System.out.print("Enter number of elements you want to enter : ");
            size = sc.nextInt();
        }
        for (int i = 0; i < size; ++i) {
            System.out.println("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of the queue are : ");
        for (int i = 0; i < size; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

    }

    public static void main(String[] args) {
        int n;
        int[] arr;
        int back = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of Queue ");
        n = scanner.nextInt();

        arr = new int[n];

        System.out.println(
                "\n1> add element in queue!\n2> remove element from queue! \n3> see top element in queue!\n4> quit!\n");
        int choice;
        do {
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            System.out.print("\n");
            switch (choice) {
                case 1: {
                    addElement(arr);
                    break;
                }
                case 2: {
                    int removedElement = removeElement(arr, back);
                    System.out.println("Removed element: " + removedElement);
                    break;
                }
                case 3: {
                    System.out.println("Top element is : " + topElement(arr));
                    break;
                }
                case 4: {
                    System.out.println("Quit!!!");
                    break;
                }
                default: {
                    System.out.println("Enter appropriate action");
                    break;
                }
            }
        } while (choice != 4);
    }
}