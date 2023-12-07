package com.predicate;

public class Employee {
    String name;
    String designation;
    public Double salary;
    String location;

    public Employee(String name, String designation, Double salary, String location) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", designation='" + designation + '\'' +
//                ", salary=" + salary +
//                ", location='" + location + '\'' +
//                '}';
        String s=String.format("(%s,%s,%.2f,%s)",name,designation,salary,location);
        return s;
    }

    //not necessary
    public boolean isEqual(Object object){
        Employee e=(Employee) object;
        if (name.equals(e.name)&&designation.equals(e.designation)&&salary==e.salary&&location.equals(e.location)){
            return true;
        }
        else {
            return false;
        }
    }
}
