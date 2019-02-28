package com.org.patterns.abstractfactory;

public class Child2AbstractFactory implements ParentAbstractFactory {

    private String name;
    private String value;

    public Child2AbstractFactory(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public Parent create() {
        return new Child1(name, value);
    }
}
