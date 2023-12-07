package com.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {


        Supplier<Date> sDate = () -> new Date();
        System.out.println(sDate.get());

        //Random name generating
        Supplier<String> sStr = () -> {
            String s1[] = {"arpitha", "Sudhiir", "Anvesh"};
            int x = (int) (Math.random() * 3);
            return s1[x];
        };
        System.out.println(sStr.get());


        //generating OTP
        Supplier<String> sOtp = () -> {
            String otp = "";
            for (int i = 0; i <= 6; i++) {
                otp = otp + (int) (Math.random() * 10);

            }
            return otp;
        };
        System.out.println(sOtp.get());


        //Random password generating

        //8 charcaters, 2 4 6 8 places should be numbers , 1 3 5 7 places should be charcaters
        Supplier<String> s = () -> {

            Supplier<Integer> d = () -> (int) (Math.random() * 10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXZ@#$";
            Supplier<Character> sc = () -> symbols.charAt((int) Math.random() * 29);

            String password = "";
            for (int i = 1; i <= 8; i++) {
                if (i % 2 == 0) {
                    password = password + d.get();

                } else {
                    password = password + sc.get();
                }
            }
            return password;

        };

        System.out.println(s.get());


    }


}
