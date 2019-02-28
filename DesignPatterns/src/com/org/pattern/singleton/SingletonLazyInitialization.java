package com.org.pattern.singleton;



/**
 * It would be fine to use single threaded environments.
 *
 */
public class SingletonLazyInitialization {

    private static SingletonLazyInitialization instance;

    /**
     * Just to avoid creation of instance from other object
     */
    private SingletonLazyInitialization() {
    }

    public static SingletonLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }

}
