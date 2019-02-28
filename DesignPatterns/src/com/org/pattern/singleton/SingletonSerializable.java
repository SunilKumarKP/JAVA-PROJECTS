package com.org.pattern.singleton;

import java.io.Serializable;

/**
 * Creates the instance even before it’s being used and that is not the best practice to use.
 * If singleton class is not using a lot of resources, then this approach would be fine.
 *
 * Cannot handle exception while creating the oject.
 * <b>Note:Reflections dissolves this solutin </b>
 */
public class SingletonSerializable implements Serializable{
    private static final long serialVersionUID = -7096164866907164674L;
    public static final SingletonSerializable INSTANCE = new SingletonSerializable();
    
    private SingletonSerializable() {
    }

    protected Object readResolve() {
        return INSTANCE;
    }
}