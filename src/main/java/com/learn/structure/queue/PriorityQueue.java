package com.learn.structure.queue;

import java.util.*;

/**
 * @author : Spike
 * @date : 2023/2/8
 * Binary Heap
 */
public class PriorityQueue<T extends Comparable<T>> {
    private int heapSize = 0;

    private int heapCapacity = 0;

    private final List<T> heap;


    public PriorityQueue() {
        this(1);
    }

    public PriorityQueue(int sz) {
        heap = new ArrayList<>(sz);
    }

    public PriorityQueue(T[] elems) {
        heapSize = heapCapacity = elems.length;
        heap = new ArrayList<>();

        heap.addAll(Arrays.asList(elems).subList(0, heapSize));

        // Heapify process, O(n)
        // it is up to the height of the heap
        for (int i = Math.max(0, (heapSize / 2) - 1); i >= 0; i--) sink(i);
    }

    public PriorityQueue(Collection<T> elems) {
        this(elems.size());
        for (T elem : elems) {
            add(elem);

        }
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public void clear() {
        for (int i = 0; i < heapCapacity; i++) {
            heap.set(i, null);
            heapSize = 0;
        }
    }

    public int size() {
        return heapSize;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return heap.get(0);
    }

    public T poll() {
        return removeAt(0);
    }

    public boolean contains(T elem) {
        for (int i = 0; i < heapSize; i++) {
            if (heap.get(i).equals(elem)) {
                return true;
            }
        }
        return false;
    }

    public void add(T elem) {
        if (elem == null) throw new IllegalArgumentException();

        if (heapSize < heapCapacity) {
            heap.set(heapSize, elem);
        } else {
            heap.add(elem);
            heapCapacity++;
        }

        swim(heapSize);
        heapSize++;

    }

    private boolean less(int i, int j) {
        T node1 = heap.get(i);
        T node2 = heap.get(j);

        return node1.compareTo(node2) <= 0;
    }

    // perform bottom up node swim, O(long(n))
    private void swim(int k) {

        // Get parent index
        int parent = (k - 1) / 2;

        while (k > 0 && less(k, parent)) {
            swap(parent, k);

            k = parent;

            parent = (k - 1) / 2;

        }

    }

    // swap two nodes, assumes i & j are valid, O(1)
    private void swap(int i, int j) {
        T elem_i = heap.get(i);
        T ele_j = heap.get(j);

        heap.set(i, ele_j);
        heap.set(j, elem_i);
    }

    // Top down node sink, O(log(n))
    private void sink(int k) {
        while (true) {
            // left child node index
            int left = 2 * k + 1;

            // right child node index
            int right = 2 * k + 2;

            // assume left node is the smallest node of the two children
            int smallest = left;

            if (right < left && less(right, left)) {
                smallest = right;
            }
            if (left >= heapSize || less(k, smallest)) {
                break;
            }
            swap(smallest, k);
            k = smallest;
        }
    }

    public boolean remove(T element) {
        if (element == null) {
            return false;
        }

        for (int i = 0; i < heapSize; i++) {
            if (element.equals(heap.get(i))) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    private T removeAt(int i) {
        if (isEmpty()) {
            return null;
        }
        heapSize--;
        T removed_data = heap.get(i);
        swap(i, heapSize);

        heap.set(heapSize, null);

        if (i == heapSize) {
            return removed_data;
        }

        T elem = heap.get(i);

        sink(i);

        if (heap.get(i).equals(elem)) {
            swim(i);
        }
        return removed_data;
    }


    public boolean isMinHeap(int k) {
        if (k >= heapSize) {
            return true;
        }
        int left = 2 * k + 1;
        int right = 2 * k + 2;

        if (left < heapSize && !less(k, left)) {
            return false;
        }
        if (right < heapSize && !less(k, right)) {
            return false;
        }
        return isMinHeap(left) & isMinHeap(right);
    }

    @Override
    public String toString() {
        return heap.toString();
    }


}
