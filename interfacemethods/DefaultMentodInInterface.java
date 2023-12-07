package com.interfacemethods;

/*Default() implementaion*/
//interface i1 {
//    default void m1() {
//        System.out.println("default method inside interface");
//    }
//}
//class C1 implements i1{
//
//    public void m2() {
////        i1.super.m1();
//        System.out.println("ovverriding interface method here");
//    }
//}
//
//public class DefaultMentodInInterface implements i1 {
//    public static void main(String[] args) {
//        C1 c=new C1();
//        c.m1(); // default method inside interface - can directly used by main class
//        c.m2(); // default method inside interface - can override by another class
//
//    }
//}


/*Default() with multiple inheritance*/

interface aInterface {
    default void m1() {
        System.out.println("1st default method");
    }
}

interface bInterface {
    default void m1() {
        System.out.println("2d default method");
    }
}

class Class1 implements aInterface, bInterface {
    @Override
    public void m1() {
        aInterface.super.m1(); //which interface we want to override
        bInterface.super.m1();
        System.out.println("implemtation");

    }
}