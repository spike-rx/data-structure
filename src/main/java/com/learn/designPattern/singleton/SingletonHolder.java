package com.learn.designPattern.singleton;

public class SingletonHolder {
    private SingletonHolder() {

    }

    private static class SingletonLoad {
        private static final SingletonHolder singletonHolder = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return SingletonLoad.singletonHolder;
    }
}
