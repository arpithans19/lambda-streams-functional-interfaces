package com.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {


        //User
        Predicate<User> pUser = i -> i.userName.equals("Arpitha") && i.password.equals("1234");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter userName");
        String userName = scanner.next();

        System.out.println("Enter Password");
        String password = scanner.next();

        User user = new User(userName, password);

        if (pUser.test(user)) {
            System.out.println("valid user");
        } else {
            System.out.println("Invalid user ");

        }


        //softwareEngineer
        SoftwareEngineer[] list = {
                new SoftwareEngineer("Arpitha", 97, true),
                new SoftwareEngineer("Ravi", 98, false),
                new SoftwareEngineer("Sudhiir", 99, true),
                new SoftwareEngineer("Chethan", 13, false),
                new SoftwareEngineer("Madan", 16, false),
                new SoftwareEngineer("Puni", 18, true),

        };

        Predicate<SoftwareEngineer> pSoft=p->p.age>18 && p.developerOrNot;
        for (SoftwareEngineer se:list){
            if (pSoft.test(se)){
                System.out.println(se);
            }
        }




    }

}
