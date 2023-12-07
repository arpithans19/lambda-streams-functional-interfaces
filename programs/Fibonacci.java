package com.programs;

public class Fibonacci {
    public static void main(String[] args) {


        int n1 = 0, n2 = 1, n3;
        int count = 8;

        //printing 0 and 1
        System.out.print(n1 + " " + n2);

        //loop starts from 2 because 0 and 1 are already printed
        for (int i = 2; i < count; ++i)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }


    }
}
