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

    private User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.uuid = userBuilder.uuid;
        this.address = userBuilder.address;
    }

    public static class UserBuilder {
     // Mandatory pattern
        private int id;
        private String name;

        // Optional Parameters
        private String uuid;
        private String address;

        public UserBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public UserBuilder withUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public UserBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", uuid=" + uuid + ", address=" + address + "]";
    }
}
