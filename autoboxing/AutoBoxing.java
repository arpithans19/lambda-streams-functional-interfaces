package com.autoboxing;

public class AutoBoxing {
    public static void main(String[] args) {

        //AutoBoxing- Automatic conversion of primitive type to wrapper object by compiler

        int j = 100;
        Integer i = j; //autoboxing

        System.out.println(j);
        System.out.println(i);

        //	AutoUnBoxing-Automatic conversion of primitive type to wrapper object by compiler
        //wrapper object

        Integer i1=new Integer(9);
        int x=i1;   //autounboxing
        System.out.println(x);
    }
}
