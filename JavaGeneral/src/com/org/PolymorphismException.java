package com.org;

class Parent {

    public void m1() throws ParentException {
    }

    public void m2() throws ParentException {
    }

    public void m3() throws ChildException {
    }

    public static void main(String[] args) {
        Parent p = new Child();
        try {
            p.m1();
        } catch (ParentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

class Child extends Parent {
    public Child() {
        super();
        System.out.println("Test");
    }
    public void m1() throws ParentException {
        System.out.println("Tets");
        String a = "abc";
        super.m1();
    }

    public void m2() throws ChildException {
    }

    public void m3() throws ChildException {
    }
}

class ParentException extends Exception {

}

class ChildException extends ParentException {
}