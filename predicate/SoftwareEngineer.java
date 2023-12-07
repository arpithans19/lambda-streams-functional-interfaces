package com.predicate;

public class SoftwareEngineer {

    String name;
    int age;
    boolean developerOrNot;

    public SoftwareEngineer(String name, int age, boolean developerOrNot) {
        this.name = name;
        this.age = age;
        this.developerOrNot = developerOrNot;
    }


    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", developerOrNot=" + developerOrNot +
                '}';
    }
}
