package com.org.patterns.abstractfactory;

/**
 * 1) Provides approach to code for interface rather than implementation.
 * 2) Removes the instantiation of actual implementation classes from client code.
 * a)Factory pattern makes our code more robust, less coupled and easy to extend.
 * b)For example, we can easily change Child1/Child2 class implementation because client program is unaware of this.
 * 3) Provides abstraction between implementation and client classes through inheritance.
 * 
 * JDK => java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
 * valueOf() method in wrapper classes like Boolean, Integer etc.
 */
public class FactoryPattern {

    public static Parent getChild(String type, String name, String value) {
        if ("Child1".equalsIgnoreCase(type))
            return new Child1(name, value);
        else if ("Child2".equalsIgnoreCase(type))
            return new Child2(name, value);
        return null;
    }
}
