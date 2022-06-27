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

    // dequeue
    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.data;

        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return front;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Elements added to the queue are :");
        queue.add(70);
        queue.add(30);
        queue.add(56);
        queue.displayQueue();
        System.out.println();


        while (!queue.isEmpty()) {
            System.out.println("Elements at peek in the queue is " + queue.peek());
            System.out.println("Remove element from queue is " + queue.remove());
            queue.displayQueue();
            System.out.println();
        }

    }
}

