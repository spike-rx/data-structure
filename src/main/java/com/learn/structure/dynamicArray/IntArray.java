package com.learn.structure.dynamicArray;

import java.util.Iterator;

public class IntArray implements Iterable<Integer> {

    private final static int DEFAULT_CAP = 1 << 3;

    public int[] arr;
    public int len = 0;
    private int capacity = 0;

    public IntArray() {
        this(DEFAULT_CAP);
    }

    ;

    public IntArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < len;
            }

            @Override
            public Integer next() {
                return arr[index++];
            }
        };
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int element) {
        arr[index] = element;
    }

}
