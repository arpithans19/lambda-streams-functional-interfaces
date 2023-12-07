package com.lambda;

/*
 * without lambda Expresiion calling method
 */
@FunctionalInterface
interface j {
    public void abstractMethod();
}

@FunctionalInterface
interface a {
    public void astractMethod2(int a, int b);
}

interface st {
    public int abstractSring(String str);

}


interface squ{
    public int squareRoot(int i);
}

class Demo implements j, a, st,squ {

    public void abstractMethod() {
        System.out.println("abstractMethod FunctionImplementaion");

    }

    public void astractMethod2(int a, int b) {
        System.out.println(a + b);
    }

    public int abstractSring(String str) {
        return str.length();
    }


    public int squareRoot(int i) {
        return  i*i;
    }
}

public class CallingLambda {
    public static void main(String[] args) {


        j inn = new Demo();
        inn.abstractMethod();

        a ini = new Demo();
        ini.astractMethod2(3, 5);

        st ins = new Demo();
        System.out.println(ins.abstractSring("Arpitha"));

        //creating object for interface
        squ sq=new Demo();
        System.out.println(sq.squareRoot(9));

    }
}











/*
 * with lambda Expression calling method
 */

//@FunctionalInterface
//interface i {
//    public void abstractMethod();
//}
//
//interface Lambda.a {
//    public void addAbstractMethod(int Lambda.a, int b);
//}
//
//interface Lambda.st {
//    public int stringAbstract(String str);
//}
//
//interface sq{
//    public int squareRoot(int x);
//}
//
//public class Lambda.CallingLambda {
//    public static void main(String[] args) {
//
//
//        i in = () -> System.out.println("abstractMethod Implemntation");
//        in.abstractMethod();
//
//        Lambda.a inn2 = (Lambda.a, b) -> System.out.println("the sum:" + (Lambda.a + b));
//        inn2.addAbstractMethod(1, 5);
//        inn2.addAbstractMethod(2, 4);
//
//        Lambda.st ins = s -> s.length();
//        System.out.println(ins.stringAbstract("ARpitha"));
//
//        sq Lambda.squ=x->x*x;
//        System.out.println(Lambda.squ.squareRoot(78));
//
//
//
//    }
//}
