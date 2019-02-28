package com.org.pattern.singleton;


/**
 * Creates the instance even before it’s being used and that is not the best practice to use.
 * If singleton class is not using a lot of resources, then this approach would be fine.
 *
 * Cannot handle exception while creating the oject.
 * <b>Note:Reflections dissolves this solutin </b>
 */
public class SingletonEagerInitialization {

    private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

    /**
     * Just to avoid creation of instance from other object
     */
    private SingletonEagerInitialization() {
    }

    public static SingletonEagerInitialization getInstance() {
        return instance;
    }

}
