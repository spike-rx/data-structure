package com.learn.Threading.Producer;

public class Demo {
    public static void main(String[] args) {
//        SharedBuffer buffer = new SharedBuffer(5);
//
//        Thread producerThread = new Thread(() -> {
//            try {
//                for (int i = 1; i <= 10; i++) {
//                    buffer.produce(i);
//                    Thread.sleep(1000);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread consumerThread = new Thread(() -> {
//            try {
//                for (int i = 1; i <= 10; i++) {
//                    int item = buffer.consume();
//                    Thread.sleep(1000);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        producerThread.start();
//        consumerThread.start();
        SharedBuffer sharedBuffer = new SharedBuffer(10);
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}
