package com.company;

import java.util.Stack;

class MyQueue {
    private final Stack<Integer> first = new Stack<>();
    private final Stack<Integer> second= new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        return second.pop();
    }

    public int peek() {

        while (!first.isEmpty()){
            second.push(first.pop());
        }
        return second.peek();
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}
