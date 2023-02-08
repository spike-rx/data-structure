package com.learn.structure.interview;

public class LinkedList {
    private int size = 0;
    private Node head = null;

    private Node tail = null;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // input data, return node
    public Node getNode(int data) {
        Node trav = head;
        for (trav = head; trav != null; trav = trav.next) {
            if (trav.data == data) {
                return trav;
            }
        }
        return null;
    }

    public void add(int data) {
        if (isEmpty()) {
            head = tail = new Node(data, null);
        } else {
            tail.next = new Node(data, null);
            tail = tail.next;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /*
     * 1-> 2 -> 3
     * 1 <- 2 <-3
     * */
    public void reverse() {
        Node trav = head;
        Node prev = null;

        while (trav != null) {
            Node next = trav.next;
            trav.next = prev;
            prev = trav;
            trav = next;
        }
        head = prev;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node trav = head;
        while (trav != null) {
            sb.append(trav.data + ", ");
            trav = trav.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
