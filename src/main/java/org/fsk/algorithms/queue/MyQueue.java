package org.fsk.algorithms.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue {

    private LinkedList<Integer> items;

    public MyQueue() {
        items = new LinkedList<>();
    }


    public void addItem(int item) {
        items.add(item);
    }

    public int popQueue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return items.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return items.getFirst();
    }


    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void printQueue() {
        System.out.println(items);
    }

}
