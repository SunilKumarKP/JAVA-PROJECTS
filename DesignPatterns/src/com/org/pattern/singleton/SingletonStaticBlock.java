package com.org.pattern.singleton;

/**
 * Creates the instance even before it’s being used and that is not the best practice to use.
 * If singleton class is not using a lot of resources, then this approach would be fine.
 * 
 * <b>Note:Reflections dissolves this solutin </b>
 */
public class SingletonStaticBlock {

    private static SingletonStaticBlock instance;

    /**
     * Just to avoid creation of instance from other object
     */
    private SingletonStaticBlock() {
    }

    static {
        try {
            instance = new SingletonStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static SingletonStaticBlock getInstance() {
        return instance;
    }

}
