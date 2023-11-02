package com.learn.designPattern.singleton;

public class SingletonSafe {
    private static volatile SingletonSafe singletonSafe;

    public SingletonSafe() {
    }

    public static SingletonSafe getInstance() {
        if (singletonSafe == null) {
            synchronized (SingletonSafe.class) {
                if (singletonSafe == null) {
                    singletonSafe = new SingletonSafe();
                }
            }
        }

        return singletonSafe;
    }
}
