package org.fsk.algorithms.liststructure.circularlinledlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {

    Node head = null;
    Node tail = null;

    public void add(int index, int data) {

        Node newNode = new Node(data);


        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else if (index == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = head; //Listenin dairesel yapisini koru
        } else {
            Node current = head;
            int count = 0;
            while (count < index - 1 && current.next != head) {
                current = current.next;
                count++;
            }

            newNode.next = current.next;
            current.next = newNode;

            if (current == tail) {
                tail = newNode;
            }
        }

    }

    public void delete(int key) {

        if (head == null) {
            return;
        }

        Node current = head;
        Node previous = null;

        while (true) {
            if (current.data == key) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                    if (head == tail) {
                        head = null;
                    }
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                }else {
                    previous.next = current.next;
                }
            }

            previous = current;
            current = current.next;

            if (current == head) break;
        }

    }

    public void printList() {

        if (head != null) {
            Node current = head;

            while (true) {
                System.out.print(current.data + " -> ");
                current = current.next;
                if (current == head) break;
            }
            System.out.println("(head ==> )" + current.data);
        }

    }

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.add(0, 17);
        list.add(1, 25);
        list.add(2, 19);
        list.add(3, 10);
        list.add(4, 118);

        list.printList();

        list.add(3, 50);

        list.printList();

        list.delete(17);

        list.printList();

    }


}
