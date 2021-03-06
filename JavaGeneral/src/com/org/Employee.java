package com.org;

public class Employee implements Comparable<Employee> {

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

    /**
     * CompareTo method sorts data ascending by default.
     */
    @Override
    public int compareTo(Employee o) {
        if (o.getAge() > getAge()) {
            return 1;
        } else if (o.getAge() < getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

}
