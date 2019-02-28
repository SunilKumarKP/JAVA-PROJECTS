package com.org.patterns.abstractfactory;

public class Child1AbstractFactory implements ParentAbstractFactory {

    private String name;
    private String value;

    public Child1AbstractFactory(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public Parent create() {
        return new Child1(name, value);
    }
}
