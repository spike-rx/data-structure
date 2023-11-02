package com.learn.designPattern.factory;

public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        }else if (type == 2) {
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createProduct(2);
    }
}
