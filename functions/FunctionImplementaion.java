package com.functions;

import com.predicate.Employee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.predicate.PopulateList.populate;
import static com.predicate.PopulateList.populateStudents;

public class FunctionImplementaion {

    public static void main(String[] args) {

        ArrayList<Student> arList = new ArrayList<>();
        populateStudents(arList);

        Function<Student, String> fGrade = f -> {
            int marks = f.marks;
            if (marks >= 80) {
                return "A[1st grade]";
            }
            if (marks >= 70) {
                return "B[1st grade]";
            }

            if (marks >= 60) {
                return "C[1st grade]";
            }

            if (marks >= 50) {
                return "D[1st grade]";
            }
            return "failed";
        };

        for (Student s : arList) {
            System.out.println(s.name + " " + s.marks + " " + fGrade.apply(s));
        }

        //using predicate
        Predicate<Student> pStudent = p -> p.marks > 98;
        for (Student s : arList) {
            if (pStudent.test(s)) {
                System.out.println(s.name + " " + s.marks + " " + fGrade.apply(s));
            }
        }

        /*------using Employee class------------------------------------------------------------------*/


        ArrayList<Employee> empList = new ArrayList<>();
        populate(empList);

        Function<ArrayList<Employee>, Double> fSalary = f -> {

            double total = 0;
            for (Employee e : empList) {
                total = total + e.salary;
            }

            return total;

        };
        System.out.println(fSalary.apply(empList));


        /*------salary less than 35000 , incremet by 900--------------------------*/
        System.out.println("Salary before: - ");
        System.out.println(empList);

        Predicate<Employee> pEmp = p -> p.salary < 30000;
        Function<Employee, Employee> fEmp = f -> {

            f.salary = f.salary + 900;
            return f;
        };
        System.out.println(empList);


        /*Function Chaining*/



        Function<String, String> fchain = f -> f.toLowerCase();
        Function<String, String> fchain2= f -> f.substring(0, 5); //1st 5 letters
//        System.out.println(fchain.apply("Arpitha"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter username");
        String name = scanner.next();
        System.out.println("enter password");
        String password = scanner.next();

        if (fchain.andThen(fchain2).apply(name).equals("mysql") && password.equals("java")) {
            System.out.println("valid user");
        } else {
            System.out.println("invalid user");
        }


    }


}
