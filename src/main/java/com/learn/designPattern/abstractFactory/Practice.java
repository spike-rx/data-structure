package com.learn.designPattern.abstractFactory;

interface IProduct {
    void operation();
}

class ConcreteProductA implements IProduct {
    @Override
    public void operation() {
        System.out.println("Product A");
    }
}

class ConcreteProductB implements IProduct {
    @Override
    public void operation() {
        System.out.println("Product B");
    }
}

interface IFactory{
    IProduct createA();
    IProduct createB();
}

class ConcreteFactory3 implements IFactory {
    @Override
    public IProduct createA() {
        return new ConcreteProductA();
    }

    @Override
    public IProduct createB() {
        return new ConcreteProductB();
    }
}

class ConcreteFactory4 implements IFactory {
    @Override
    public IProduct createA() {
        return new ConcreteProductA();
    }

    @Override
    public IProduct createB() {
        return new ConcreteProductB();
    }
}
public class Practice {
    public static void main(String[] args) {

    }
}
