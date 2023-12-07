package com.programs;


public class Test2 {
    public static void method(Object s) {
        System.out.println("String");
    }

    public static void method(ArithmeticException ae) {
        System.out.println("ae");
    }

    public static void method(Exception e) {
        System.out.println("e");
    }

    public static void main(String[] args) {
        method(null);
    }

}