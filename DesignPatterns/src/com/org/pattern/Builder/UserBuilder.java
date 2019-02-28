package com.org.pattern.Builder;

public class UserBuilder {

    public static void main(String[] args) {
        User u = new User(1, "User1");
        System.out.println(u);
        u.setUuid("UUID").build();
        System.out.println(u);
        u.setAddress("address").build();
        System.out.println(u);
    }

}
