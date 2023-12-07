package com.programs;

public class FuzzBizz {
    public static void main(String[] args) {

        int numbers = 100;
        for (int i = 1; i <= numbers; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Buzz");


            } else if (i % 5 == 0) {
                System.out.println("Fizz");


            } else {
                System.out.println(numbers);
            }

        }
    }

}
