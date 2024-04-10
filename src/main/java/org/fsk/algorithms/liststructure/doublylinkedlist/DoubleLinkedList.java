package org.fsk.algorithms.liststructure.doublylinkedlist;

class Node {

    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoubleLinkedList {

    Node head, tail;

    public DoubleLinkedList() {
        head = tail = null;
    }


    public void add(int index, int data) {

        Node newNode = new Node(data);


        // Liste boşsa veya liste başına ekleme yapılacaksa
        if (head == null ||index == 0) {
            if (head == null) {
                head = tail = newNode;
            }else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }else {
            Node current = head;
            int count = 0;

            while (current != null && count < index) {
                current = current.next;
                count++;
            }

            //Listenin sonuna ekleme yapılıyorsa
            if (current == null) {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            } else { //Araya eleman ekleme yapiliyorsa
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
    }

    public void delete(int key) {

        if (head == null) return;

        Node current = head;


        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) return; //Değer bulunamadi

        if (current.prev != null) {
            current.prev.next = current.next;
        }else {
            head = current.next; //Head siliniyordur ve head guncellenir.
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }else {
            tail = current.prev; //Tail siliniyordur ve tail guncellenir.
        }

    }


    public void printForward() {

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.prev;
        }
    }
}

class Main {

    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();

        list.add(0, 15);
        list.add(1, 23);
        list.add(2, 40);
        list.add(3, 34);
        list.add(4, 20);
        list.add(5, 10);
        list.add(6, 8);

        list.printForward();

        list.add(3, 123);

        list.delete(20);

        list.printForward();

    }

}
