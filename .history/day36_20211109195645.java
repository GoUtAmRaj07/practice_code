import java.io.*;

public class day36 {

    node head;

    static class node {
        int data;
        node next;

        node(int d) {
            this.data = d;
            next = null;
        }

    }

    public static void insertData(node linkedList, int data) {
        node new_node = new node(data);
        new_node.next = null;

        if (linkedList.head == null) {
            linkedList.head = new_node;
        } else {
            node last = linkedList.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public static void printData(node linkedList) {
        node currentNode = linkedList.head;

        System.out.println("Linked list : ");
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        node linkedList = new node();

        linkedList.insertData(linkedList, 1);
        linkedList.insertData(linkedList, 2);
        linkedList.insertData(linkedList, 3);
        linkedList.insertData(linkedList, 4);
        linkedList.insertData(linkedList, 5);
        linkedList.insertData(linkedList, 6);
        linkedList.insertData(linkedList, 7);

        printData(linkedList);
    }

}
