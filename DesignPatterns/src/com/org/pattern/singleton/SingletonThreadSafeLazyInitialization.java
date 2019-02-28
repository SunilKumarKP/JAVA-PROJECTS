package com.org.pattern.singleton;

/**
 * Provides the double-checked locking implementation.
 *
 * <b>Note:Reflections dissolves this solution </b>
 */
public class SingletonThreadSafeLazyInitialization {

    private static SingletonThreadSafeLazyInitialization instance;

    /**
     * Just to avoid creation of instance from other object
     */
    private SingletonThreadSafeLazyInitialization() {
    }

    public static SingletonThreadSafeLazyInitialization getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafeLazyInitialization.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafeLazyInitialization();
                }
            }
        }
        return instance;
    }
}
