package com.bridgelabz;

public class Queue {
    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
        return head == null & tail == null;
    }

    //enqueue

    public static void add(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            tail = head = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public void displayQueue() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }


    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Elements added to the queue are :");
        queue.add(70);
        queue.add(30);
        queue.add(56);
        queue.displayQueue();
       

    }
}
