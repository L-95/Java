package com.lee.test;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();

    public void push(int x) {
        //要保证所有元素都在A中，然后再把A中得元素捣腾到B中
        while( !B.empty()) {
            Integer top = B.pop();
            A.push(top);
        }
        A.push(x);
    }

    public int pop() {
        //要保证所有元素都在A中 把A倒腾到B中 再进行出队列操作
        if (empty()) {
            return 0;
        }
        while(!A.empty()) {
            Integer top = A.pop();
            B.push(top);
        }
        return B.pop();
    }

    public int pick() {
        //把A倒腾到B中  再取队首
        if (empty()) {
            return 0;
        }
        while(!A.isEmpty()) {
            Integer top = A.pop();
            B.push(top);
        }
        return B.peek();
    }
    private boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
