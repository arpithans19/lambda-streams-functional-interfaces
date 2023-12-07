package com.functions;

import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {

        //input type is String, return type is Integer
        Function<String, Integer> fLeght = s -> s.length();
        System.out.println(fLeght.apply("Arpitha"));

        //write a program to return square of the given number
        Function<Integer, Integer> fSquare = s -> s * s;
        System.out.println(fSquare.apply(8993));


        //remove spaces in given String
        String str = "Ar pi th a  N  Ko lar  K ar n ata ka  I nd ia 56 31 3 3";
        Function<String, String> fString = f -> f.replaceAll(" ", "");
        System.out.println(fString.apply(str));

        //count number of Spaces in Strings(length of String with space - length of String without space)
        Function<String, Integer> fStrCount = f -> f.length() - f.replaceAll(" ", "").length();
        System.out.println(fStrCount.apply(str));


        //function chaining
        Function<String, String> fChain = f -> f.toUpperCase();
        Function<String, String> fChain2 = f -> f.substring(0, 7);

        System.out.println(fChain.apply("ArpithaNarayanaSwamy"));
        System.out.println(fChain2.apply("ArpithaNarayanaSwamy"));
        System.out.println(fChain.andThen(fChain2).apply("ArpithaNarayanaSwamy"));
        System.out.println(fChain.compose(fChain2));
        System.out.println(fChain.compose(fChain2).apply("ArpithaNarayanaSwamy"));

        Function<Integer, Integer> fInt = f -> f + f;
        Function<Integer, Integer> fInt2 = f -> f * f * f;

        //andThen()->1st apply to fInt then fInt2
        System.out.println(fInt.andThen(fInt2).apply(2)); //4*4*4=64

        //compose()->1st apply to fInt2 then fint
        System.out.println(fInt.compose(fInt2).apply(3)); //8+8=16

        //identity()-static method
        Function<String, String> f = Function.identity();
        System.out.println(f.apply("Arpitha"));


    }
}
