package com.org.pattern.Builder;

/**
 * Creational Design Pattern.
 * 
 * Builder pattern used to update the same object lazily.
 * 
 *
 */
public class User {
    // Mandatory pattern
    private int id;
    private String name;

    // Optional Parameters
    private String uuid;
    private String address;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return this;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", uuid=" + uuid + ", address=" + address + "]";
    }
}
