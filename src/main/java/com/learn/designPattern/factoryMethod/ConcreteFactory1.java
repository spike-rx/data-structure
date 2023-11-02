package com.learn.designPattern.factoryMethod;

import com.learn.designPattern.factory.ConcreteProduct1;
import com.learn.designPattern.factory.Product;

public class ConcreteFactory1 extends AbsFactory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
