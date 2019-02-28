package com.org.patterns.factory;

public class TestFactory {

    public static void main(String[] args) {
        Parent c1 = FactoryPattern.getChild("Child1", "Child1", "Value 1");
        Parent c2 = FactoryPattern.getChild("Child2", "Child2", "Value 2");
        System.out.println("factory child 1 config==>" + c1);
        System.out.println("factory child 2 config==>" + c2);
    }
}
