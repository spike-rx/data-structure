package com.learn.designPattern.builder;

class Product{
    private String part1;
    private String part2;

    private String part3;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    public void display() {
        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);
        System.out.println("Part 3: " + part3);
    }
}

interface IBuilder {
    void builderPart1(String part1);
    void buildPart2(String part2);
    void buildPart3(String part3);
    Product getResult();
}

class ConcreteBuilder implements IBuilder {
    private Product product = new Product();
    @Override
    public void builderPart1(String part1) {
        product.setPart1(part1);

    }

    @Override
    public void buildPart2(String part2) {
        product.setPart2(part2);
    }

    @Override
    public void buildPart3(String part3) {
        product.setPart3(part3);
    }

    @Override
    public Product getResult() {
        return product;
    }
}

class Director {
    public Product construct(IBuilder builder) {
        builder.builderPart1("part1");
        builder.buildPart2("part2");
        builder.buildPart3("part3");
        return builder.getResult();
    }
}
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        IBuilder builder = new ConcreteBuilder();
        Product product = director.construct(builder);
        product.display();
    }
}
