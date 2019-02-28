package com.org.pattern.singleton;

/**
 * Clone returns same object.
 * 
 * Cannot handle exception while creating the oject.
 * <b>Note:Reflections dissolves this solution </b>
 */
public class SingletonCloneable implements Cloneable {
    
    public static SingletonCloneable instance;

    /**
     * Just to avoid creation of instance from other object
     */
    private SingletonCloneable() {
    }

    public static SingletonCloneable getInstance() {
        if (instance == null) {
            instance = new SingletonCloneable();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}