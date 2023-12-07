package com.programs;

import java.util.Optional;

public class SubString {
    public static void main(String[] args) {

        String str = "Arpitha N Uddappanahalli narasapur";


        String m = str.substring(0, 9);

        if (str.contains("Arpitha")) {
            System.out.println("Substring exist");
        } else {
            System.out.println("Not Exists");
        }


    }
}
