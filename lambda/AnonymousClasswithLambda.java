package com.lambda;

/*Anonymous class without Lambda*/
//public class AnonymousClasswithLambda {
//    public static void main(String[] args) {
//
//
//        //its anonymous inner class (Runnable -its implements)
//        Runnable rn=new Runnable() {
//
//            public void run() {
//
//                for(int i=0;i<9;i++){
//                    System.out.println("Inside anonymous-child thread");
//                }
//            }
//        };
//        Thread t=new Thread();
//        t.start();
//        for(int i=0;i<9;i++){
//            System.out.println("Main thread");
//        }
//
//    }
//}

/*Anonymous class with Lambda*/
//public class AnonymousClasswithLambda {
//    public static void main(String[] args) {
//
//        Runnable r = () -> {
//            for (int i = 0; i < 4; i++) {
//                System.out.println("Child Thread");
//            }
//
//        };
//
//        //without lambda
//        Thread t=new Thread(r);
//        t.start();
//        for (int i=0;i<3;i++){
//            System.out.println("without lambda - Main thread");
//        }
//
//
//        //lambda expression
//        Thread t1=new Thread(() -> {
//            for (int i = 0; i < 4; i++) {
//                System.out.println("with lambda - main Thread");
//            }
//
//        });
//        t1.start();
//    }
//
//
//}



/*Difference b/w Lambda and Anoymous*/

interface functionalInterface1 {
    public void m1();
}

class LambdaVsAnonymous {
    int x = 10;

    public void m2() {

        int y = 20;

        //by using lambda ,we can access enclosing class variables=(x) and enclosing method variables=(y)

        // Local variables(used by methods)  which is refernced by Lambda those variables are acts as Final Variables

        functionalInterface1 I1 = () -> {
            x = 9; //class variable
//            y=0;    // method variable
            System.out.println(x);
            System.out.println(y);


        };
        I1.m1();
    }
}

public class AnonymousClasswithLambda {
    public static void main(String[] args) {
        LambdaVsAnonymous la = new LambdaVsAnonymous();
        la.m2();

    }
}