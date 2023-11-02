package com.learn.Threading.Producer;

public class Producer implements Runnable{
    private SharedBuffer buffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.buffer = sharedBuffer;
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i< 10; i++) {
                buffer.produce(i);
                buffer.wait(1000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(10);
        Producer producer = new Producer(sharedBuffer);
        Thread producerThread = new Thread(producer);
        producerThread.start();
    }

}
