import java.util.Scanner;

public class Queue {
    private static int topElement(int[] arr, int back) {
        if (back == -1) {
            System.out.println("Queue is empty!!");
            return -1;
        } else
            return arr[0];
    }

    private static int removeElement(int[] arr, int back) {
        int removedElement;

        if (back < 0)
            return -1;
        else
            removedElement = arr[0];
        leftShift(arr);
        back--;
        return removedElement;
    }

    private static void leftShift(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = 0;
            }
        }
    }

    private static void addElement(int[] arr, int back) {
        int top = 0;
        int n = arr.length;
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
            back++;
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
        int back = -1;
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
                    addElement(arr, back);
                    break;
                }
                case 2: {
                    int removedElement = removeElement(arr, back);
                    System.out.println("Removed element: " + removedElement);
                    break;
                }
                case 3: {
                    System.out.println("Top element is : " + topElement(arr, back));
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