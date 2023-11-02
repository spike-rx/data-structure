package com.learn.designPattern.abstractFactory;

interface AbstractProductA {
    void operationA();
}

class ConcreteProductA1 implements AbstractProductA {
    @Override
    public void operationA() {
        System.out.println("产品A1");
    }
}

class ConcreteProductA2 implements AbstractProductA {
    @Override
    public void operationA() {
        System.out.println("产品A2");
    }
}

interface AbstractProductB {
    void operationB();
}

class ConcreteProductB1 implements AbstractProductB {
    @Override
    public void operationB() {
        System.out.println("产品B1");
    }
}

class ConcreteProductB2 implements AbstractProductB {
    @Override
    public void operationB() {
        System.out.println("产品B2");
    }
}

interface AbstractFactory {
    AbstractProductA createA();
    AbstractProductB createB();
}

class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createB() {
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createB() {
        return new ConcreteProductB2();
    }
}

public class Main {
    public static void main(String[] args) {
        // 使用具体工厂 1 创建产品
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createA();
        AbstractProductB productB1 = factory1.createB();

        productA1.operationA();
        productB1.operationB();

        // 使用具体工厂 2 创建产品
        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createA();
        AbstractProductB productB2 = factory2.createB();

        productA2.operationA();
        productB2.operationB();
    }
}
