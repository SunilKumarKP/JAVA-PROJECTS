package com.org.pattern.singleton;

/**
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory
 * and only when someone calls the getInstance method,
 * this class gets loaded and creates the Singleton class instance.
 * 
 * <b>Note:Reflections dissolves this solutin </b>
 *
 */
public class BillPughSingleton {

    /**
     * Just to avoid creation of instance from other object
     */
    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}