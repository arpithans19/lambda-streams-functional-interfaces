package com.consumer;

import com.functions.Student;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.predicate.PopulateList.populateMovies;
import static com.predicate.PopulateList.populateStudents;

public class ConsumerImplementation {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();
        populateMovies(movies);

        Consumer<Movie> cMovie = c -> {
            System.out.println(c.name);
            System.out.println(c.hero);
            System.out.println(c.heroin);
            System.out.println();


        };
        for (Movie m : movies) {
            cMovie.accept(m);
        }


        /*Students Implemetaion*/

        ArrayList<Student> studentsList = new ArrayList<>();
        populateStudents(studentsList);

        Predicate<Student> pStudent = p -> p.marks >= 95;
        Function<Student, String> fStudent = f -> {

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
        Consumer<Student> cStudent = c -> {
            System.out.println(c.marks);
            System.out.println(c.name);
            System.out.println("Grade" + fStudent.apply(c));


        };
        for (Student s : studentsList) {
            if (pStudent.test(s)) {
                cStudent.accept(s);
            }
        }

        //consumer chaining
        Consumer<Movie> cm = c -> {
            System.out.println(c.name + " is " + c.result);


        };
        Consumer<Movie> cm1 = c -> {
            System.out.println(c.name + " is " + c.result);


        };
        Consumer<Movie> cm2 = c -> {
            System.out.println(c.name + " is " + c.result);


        };
        System.out.println("---------Chained Consumer-----");
        Consumer<Movie> chaniedC= cm1.andThen(cm1).andThen(cm2);

        Movie m=new Movie("Kgf","Yash","Nidhi","hit");
        chaniedC.accept(m);

    }
}
