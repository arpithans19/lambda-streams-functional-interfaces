package com.collections;

import java.util.HashMap;
import java.util.Map;

//Write a Java code to store Empid and EmpName in HashMap and display the Empid that are multiples of 7.
public class HashMapEx {

    public static void main(String[] args) {
        Map<Integer, String> hs = new HashMap<>();

        hs.put(1, "emp1");
        hs.put(2, "emp2");
        hs.put(3, "emp3");
        hs.put(4, "emp3");
        hs.put(5, "emp3");
        hs.put(6, "emp3");
        hs.put(7, "emp7");

        System.out.println(hs);

//        System.out.println(hs.entrySet());
//
//        String s = "Empname";

        for (int j : hs.keySet()) {
            if (j % 7 == 0) {
                System.out.println(j);
            }
        }
    }
}
