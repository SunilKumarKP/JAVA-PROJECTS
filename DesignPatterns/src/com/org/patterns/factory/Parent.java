package com.org.patterns.factory;

public abstract class Parent {
    public abstract String getName();

    public abstract String getValue();

    @Override
    public String toString() {
        return String.format("Name=> %s::value=>%s", getName(), getValue());
    }
}
