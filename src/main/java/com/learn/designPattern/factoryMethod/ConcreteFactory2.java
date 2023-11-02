package com.learn.designPattern.factoryMethod;

import com.learn.designPattern.factory.ConcreteProduct2;
import com.learn.designPattern.factory.Product;

public class ConcreteFactory2 extends AbsFactory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
