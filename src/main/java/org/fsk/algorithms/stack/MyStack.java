package org.fsk.algorithms.stack;

public class MyStack {

    public static void main(String[] args) {

        MyStackClass<Integer> stack = new MyStackClass<>();

        stack.push(10);
        stack.printStack();

        System.out.println("=======================");

        stack.push(20);
        stack.push(12);
        stack.push(15);
        stack.push(8);

        stack.printStack();

        System.out.println(stack.peek());

    }

}
