package com.interfacemethods;

interface i1{
    public static void m1(){
        System.out.println("static method inside interface");
    }
}
class C1 implements i1{

}


public class StaticMethodsInInterface implements i1 {
    public static void main(String[] args) {

        StaticMethodsInInterface sn=new StaticMethodsInInterface();

         i1.m1();  //u should call static() using interface object only
//        sn.m1(); //u should call static() using interface object only
    }
}
