package com.bridgelabz;

public class Stack {
    public static Node head;

    public static boolean isEmpty() {
        return head == null;
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void displayStack() {
        Node current = head;
        while (current != null) {
            System.out.println("->" + current.data);
            current = current.next;
        }

    }
}
