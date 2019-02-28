package com.org.pattern.singleton;

/**
 * Soultion to Mutithreaded & Reflection.
 *
 */
public enum SingletonEnum {
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}