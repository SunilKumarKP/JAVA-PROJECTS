package com.org.patterns.abstractfactory;

public class ParentFactory {
    public static Parent getObject(ParentAbstractFactory factory) {
        return factory.create();
    }
}
