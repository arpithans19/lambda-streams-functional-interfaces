package com.predicate;

import com.consumer.Movie;
import com.functions.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PopulateList {
    public static void populate(ArrayList<Employee> employees) {

        employees.add(new Employee("Arpitha", "Developer", 33000.00, "Bangalore"));
        employees.add(new Employee("Arpitha", "Developer", 3000.00, "Bangalore"));
        employees.add(new Employee("Sudhiir", "CEO", 50000.00, "Hyderabad"));
        employees.add(new Employee("Arshad", "Tester", 20000.00, "Bangalore"));
        employees.add(new Employee("Anvesh", "Developer", 13000.00, "Hyderabad"));
        employees.add(new Employee("Sushma", "Tester", 30000.00, "Bangalore"));

        System.out.println(employees);
    }
    public static void display(Predicate<Employee> p, ArrayList<Employee> employees) {
        for (Employee e : employees) {
            if (p.test(e)) {
                System.out.println(e);
            }
        }
    }

    public static void populateStudents(ArrayList<Student> students) {

        students.add(new Student("Arpitha",99));
        students.add(new Student("Sudhiir",90));
        students.add(new Student("Anvesh",98));
        students.add(new Student("Sudhma",92));
        students.add(new Student("Arshad",87));
        students.add(new Student("Ravii",100));
        students.add(new Student("XYz",73));

        System.out.println(students);
    }
    public static void displayStudents(Predicate<Student> p, ArrayList<Student> students) {
        for (Student e : students) {
            if (p.test(e)) {
                System.out.println(e);
            }
        }
    }
    public static void populateMovies(ArrayList<Movie> movies) {

        movies.add(new Movie("KGF","Yash","Nidi","hit"));
        movies.add(new Movie("KGF1","Yash","Nidi","hit"));
        movies.add(new Movie("KGF2","Yash","Nidi","hit"));
        movies.add(new Movie("KGF3","Yash","Nidi","hit"));


        System.out.println(movies);
    }
    public static void displayMovies(Predicate<Movie> p, ArrayList<Movie> movies) {
        for (Movie e : movies) {
            if (p.test(e)) {
                System.out.println(e);
            }
        }
    }
}


