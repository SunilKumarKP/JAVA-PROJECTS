package com.org;

public class Finally {

    public static void main(String[] args) {
        System.out.println(m1());
    }

    public static int m1() {
        try {
            System.out.println("try block");
            return 10;
        } finally {
            System.out.println("Finally Block executed.");
            int a = 20;
            return a;
        }
    }
}
