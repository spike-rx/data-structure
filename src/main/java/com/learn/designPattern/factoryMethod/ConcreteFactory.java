package com.learn.designPattern.factoryMethod;

import com.learn.designPattern.factory.ConcreteProduct;
import com.learn.designPattern.factory.Product;

public class ConcreteFactory extends AbsFactory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
