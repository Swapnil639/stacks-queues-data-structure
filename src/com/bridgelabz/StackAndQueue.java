package com.bridgelabz;

public class StackAndQueue {
    public static void main(String[] args) {
        System.out.println("Welcome to stack and queue program");
        Stack stack = new Stack();
        System.out.println("Elements in the stack are : ");
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.displayStack();

        System.out.println();

        while (!stack.isEmpty()) {
            System.out.println("Elements at peek in the stack is " + stack.peek());
            System.out.println("Elements removed from the stack is " + stack.pop());
            stack.displayStack();
        }

    }
}

