package com.learn.Threading.Producer;

public class Consumer implements Runnable{
    private SharedBuffer buffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.buffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                int item = buffer.consume();
                buffer.wait(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
