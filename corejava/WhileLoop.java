package com.corejava;

public class WhileLoop {

    public static void main(String[] args) {
        int i=5;

        for(i=0;i<10;i++) {
            System.out.println(i);
        }


        // if while() is condition it will execute up to 5 times(i=5)
        // if while() is false then it will execute only one time */

        do {
            System.out.println("do while loop");
            System.out.println("while skipped");

            i--;
        }
        while(i<0);


    }


}
