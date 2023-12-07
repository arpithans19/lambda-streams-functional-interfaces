package com.predicate;

import javax.swing.border.EtchedBorder;
import java.util.ArrayList;
import java.util.function.Predicate;

import static com.predicate.PopulateList.display;
import static com.predicate.PopulateList.populate;

public class EmpImplementaion {
    public static void main(String[] args) {
        Employee emp[] = {
                new Employee("Arpitha", "Developer", 33000.00, "Bangalore"),
                new Employee("Sudhiir", "CEO", 7000000.00, "Hyderabad"),
                new Employee("Arshad", "Tester", 30000.00, "Bangalore"),
                new Employee("Anvesh", "Developer", 33000.00, "Hyderabad"),
                new Employee("Sushma", "Tester", 30000.00, "Bangalore"),

        };
//        System.out.println(emp);
//
//        ArrayList<Employee> alist=new ArrayList<>();
//        Employee e1= new Employee("Arpitha","Developer",33000.00,"Bangalore");
//        Employee e2=new Employee("Sudhiir","CEO",70000.00,"Hyderabad");
//        alist.add(e1);
//        alist.add(e2);
//        System.out.println(alist);

        ArrayList<Employee> empList = new ArrayList<>();
        populate(empList);


        Predicate<Employee> pDesignation = p -> p.designation.equals("Developer");
        display(pDesignation, empList);

        Predicate<Employee> pLoc = p -> p.location.equals("Bangalore");
        display(pLoc, empList);


        Predicate<Employee> pSalary = p -> p.salary <= 30000.00;
        display(pSalary, empList);

        /*predicate joining or Chaining*/
        //joining developers and bangalore
        display(pLoc.and(pDesignation), empList);

        //developer or salary less than 30k
        display(pDesignation.or(pSalary), empList);

        //who are not developers
        display(pDesignation.negate(), empList);


        //isEqual() - static method of Predicate
        Predicate<String> p = Predicate.isEqual("Arpitha");
        System.out.println(p.test("Arpitha"));
        System.out.println(p.test("CEO"));

        Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Arpitha", "Developer", 33000.00, "Bangalore"));
        Employee emp1 = new Employee("Arpitha", "Developer", 33000.00, "Bangalore");
        Employee emp2 = new Employee("Sudhiir", "CEO", 70000.00, "Hyderabad");
        System.out.println(isCEO.test(emp1));
        System.out.println(isCEO.test(emp2));

    }
}
