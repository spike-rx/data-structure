package com.learn.Threading.Producer;

import com.learn.structure.linkedList.LinkedList;

import java.util.PriorityQueue;

public class SharedBuffer {
    private PriorityQueue<Integer> buffer = new PriorityQueue<>();
    private int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
        }

        buffer.add(item);
        System.out.println("生产者生产:" + item);
        notify();
    }
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int item = buffer.remove();
        System.out.println("消费者消费" + item);
        notify();
        return item;
    }
}
