package com.org.patterns.abstractfactory;

public class Child2 extends Parent {

    private String name;
    private String value;

    public Child2(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Child2-Name";
    }

    @Override
    public String getValue() {
        // TODO Auto-generated method stub
        return "Child2-Value";
    }

}
