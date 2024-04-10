package org.fsk.algorithms.liststructure.singlelinkedlist;

class Node {

    int data; // Node'un icerecegi veri
    Node next; // Bir sonraki node icin isaretci/yer tutucu/pointer

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class SingleLinkedList {
    Node head;

    public void add(int index, int data) {

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);

        Node current = head;

        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }


        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.err.println("Index out of bound exception");
        }

    }

    public void delete(int key) {

        if (head == null) return;

        if (head.data == key) {
          head = head.next;
          return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        if (current == null) return;

        previous.next = current.next;

    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private void addFirst(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

}

class Main {

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        list.add(0, 12);
        list.add(1, 15);
        list.add(2, 12);
        list.add(3, 10);
        list.add(4, 13);
        list.add(5, 17);

        list.printLinkedList();

        list.delete(10);

        list.printLinkedList();



    }

}
