package com.lambda;

import java.util.ArrayList;
import java.util.Collections;

class employe {
    int eNumb;
    String eName;


    //without toString o/p will be -> Lambda.employe@5a39699c
    @Override
    public String toString() {
        return "employee{" + "eNumb=" + eNumb + ", eName='" + eName + '\'' + '}';
    }

    public employe(int eNumb, String eName) {
        this.eNumb = eNumb;
        this.eName = eName;
    }

}

public class Employee {
    public static void main(String[] args) {

        /*without Lambda and Collections*/
        /*if variables are  private ,then should create Object*/
//        employe e = new employe(1, "Arpitha");
//        System.out.println(e);


        ArrayList<employe> alist = new ArrayList<>();
        alist.add(new employe(1, "aih"));
        alist.add(new employe(78, "kjasjkh"));
        alist.add(new employe(90, "hjksa"));
        alist.add(new employe(8, "aihKJD"));
        alist.add(new employe(89, "aihKJZ"));

        System.out.println("Before Strating" + alist);
        //comparator with using lambda
//if variable are private -> we can't access o1.eNumb, we should create getters and setters
        Collections.sort(alist, (o1, o2) -> (o1.eNumb > o2.eNumb) ? -1 : (o1.eNumb < o2.eNumb) ? 1 : 0);
        System.out.println("after sorting" + alist);

    }
}
