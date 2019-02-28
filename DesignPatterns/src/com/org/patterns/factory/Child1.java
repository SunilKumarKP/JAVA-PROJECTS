package com.org.patterns.factory;

public class Child1 extends Parent {

    private String name;
    private String value;

    public Child1(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Child1-Name";
    }

    @Override
    public String getValue() {
        // TODO Auto-generated method stub
        return "Child1-Value";
    }

}
