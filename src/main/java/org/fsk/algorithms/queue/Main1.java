package org.fsk.algorithms.queue;

public class Main1 {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        myQueue.addItem(10);
        myQueue.addItem(20);
        myQueue.addItem(15);
        myQueue.addItem(40);
        myQueue.addItem(30);

        myQueue.printQueue();

        myQueue.popQueue();

        myQueue.printQueue();

        myQueue.popQueue();

        myQueue.printQueue();


        myQueue.addItem(70);

        myQueue.printQueue();

    }
}
