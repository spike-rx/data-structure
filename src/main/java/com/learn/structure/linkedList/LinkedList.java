package com.learn.structure.linkedList;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private int size = 0;
    private Node<T> head = null;

    private Node<T> tail = null;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        if (isEmpty()) {
            head = tail = new Node<>(element, null);
        }else {
            tail.next = new Node<>(element, null);
            tail = tail.next;
        }
        size++;

    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> trav = head;
            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public T next() {
                T data = trav.data;
                trav = trav.next;
                return data;
            }
        };
    }
}
