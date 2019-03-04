package com.org;

import java.util.ArrayList;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Abc", 12, ""));
        employees.add(new Employee("bcd", 12, ""));
        employees.add(new Employee("def", 12, ""));
        employees.sort((Employee o1, Employee o2) -> o2.getName().compareToIgnoreCase(o1.getName()));

        employees.forEach((e) -> {
            System.out.println(e.getName());
        });

    }
}

class Employee {

    private String name;
    private int age;
    private String place;

    public String getName() {
        return name;
    }

    public Employee(String name, int age, String place) {
        super();
        this.name = name;
        this.age = age;
        this.place = place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}