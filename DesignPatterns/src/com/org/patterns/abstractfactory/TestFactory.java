package com.org.patterns.abstractfactory;

public class TestFactory {

    public static void main(String[] args) {
        Parent c1 = ParentFactory.getObject(new Child1AbstractFactory("child1", "value1"));
        Parent c2 = ParentFactory.getObject(new Child2AbstractFactory("child2", "value2"));
        System.out.println("factory child 1 config==>" + c1);
        System.out.println("factory child 2 config==>" + c2);
    }
}
