package com.company.myQueue;


public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack();
        myStack.push(15);
        myStack.push(13);
        myStack.push(10);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        MyQueue<Integer> myQueue = new MyQueue<>();

        System.out.println(myQueue);


    }
}
