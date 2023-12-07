package com.programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        int num = 89;
        int reverse = 0;

        // store the number to originalNum
        int originalNum = num;
        System.out.println(originalNum);

        //    store it in variable
        while (num != 0) {

            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(reverse);


        // check if reversedNum and originalNum are equal
        if (originalNum == reverse) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");
        }


        /*-----------String---------------------*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();

        String orgStr = str;
        String rever="";

        for (int i = str.length(); i > 0; --i) {
           rever =rever+ str.charAt(i - 1);

        }
        System.out.println(rever);


        if(orgStr.equals(rever)){
            System.out.println("palindrom string");

        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
