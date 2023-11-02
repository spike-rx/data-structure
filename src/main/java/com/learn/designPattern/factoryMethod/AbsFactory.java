package com.learn.designPattern.factoryMethod;

import com.learn.designPattern.factory.Product;

public abstract class AbsFactory {
    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
    }
}
