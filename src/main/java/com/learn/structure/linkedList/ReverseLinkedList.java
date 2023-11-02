package com.learn.structure.linkedList;

public class ReverseLinkedList {

    public static void main(String[] args)
    {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    // 1->2->3
    // 3->2->1
    // 1: next = 2, 1.next = null, prev = 1, current = 2
    // 2: next = 3, 2.next = 1, prev =
    Node reverse(Node node) {
        Node next;
        Node prev = null;
        Node current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + "");
            node = node.next;
        }
    }
}
