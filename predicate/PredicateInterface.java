package com.predicate;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

        /*predicate contain only 1 method => test(), which return true or false*/
        Predicate<Integer> predicate = I -> I > 10;

        System.out.println("Test Method ");
        System.out.println(predicate.test(100));
        System.out.println(predicate.test(2));

        //gives compileTimeError - Incompatible type
//                System.out.println(predicate.test("iashs"));


        //checking length of string - using Prediate(I)
        Predicate<String> predicate1 = s -> s.length() < 5;
        System.out.println(predicate1.test("arpitha"));
        System.out.println(predicate1.test("ravi"));

        //checking give list is empty or not
        Predicate<List> pList = c -> c.isEmpty();

        ArrayList<Integer> aList1 = new ArrayList<>();
        aList1.add(92);
        System.out.println(pList.test(aList1));

        ArrayList<Integer> aList2 = new ArrayList<>();
        System.out.println(pList.test(aList2));


        /*negate(), and(), or() -default methods of predicate*/
        int[] array = {73, 94, 56, 8, 9, 2, 90, 43, 83, 99, 98, 25, 47, 28};

        Predicate<Integer> p1 = i -> i > 10;
        System.out.println("------------");
        method1(p1, array);

        System.out.println("negate()-> not greator than 10 ");
        method1(p1.negate(), array);

        Predicate<Integer> p2 = i -> i % 2 == 0;
        System.out.println("----Even numbers--------");
        method1(p2, array);

        System.out.println("And()-> not even number");
        method1(p2.negate(), array);

        System.out.println("And()-> greator than 10 and even number");
        method1(p1.and(p2), array);

        System.out.println("or()-> either greater than 10 or even number");
        method1(p1.or(p2), array);


    }

    public static void method1(Predicate<Integer> p, int[] a) {
        for (int x1 : a) {
            if (p.test(x1)) {
                System.out.println(x1);
            }
        }


        /* program to display names start with k - using Predicate*/

        String names[] = {"Arpitha", "Ravi", "Rakesh", "Amrutha", "Sudhiir", "Anitha"};

        Predicate<String> pname = s -> s.charAt(0)=='S';
        System.out.println("NAMES");
        for (String s : names) {
            if (pname.test(s)) {
                System.out.println(s);
            }

        }


        //using predicate - removing null values (or)empty String in collection/Array
        String str[] = {"Arpitha", null,"Ravi", "Rakesh", null, "", "Amrutha", "Sudhiir", "Anitha"};


        Predicate<String> pstr = s -> s != null && s.length() != 0;

        //adding to list
        ArrayList<String> aListString = new ArrayList<>();
        System.out.println("removing nulls, and empty strings");
        for (String s : str) {
            if (pstr.test(s)) {
                aListString.add(s);
            }
        }
        System.out.println(aListString);
    }
}


