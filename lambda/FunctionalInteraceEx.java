package com.lambda;

/*
 * Functional Interface - which contain only one abstract method in it - used to invoke/call lambda Expression
 */


@FunctionalInterface
public interface FunctionalInteraceEx {
    public void abstractMethod();
//    public void abstractMethod2();

    /*
     * It may contain any num... of default and static methods
     */

    default void defaultMethod() {
    }

    default void defaultMethod2() {
    }


    public static void staticMethod() {
    }

    public static void staticMethod2() {

    }

}

//if interface extends - child interface also should contain 0 or 1 abstract() or same method which is there in parent

@FunctionalInterface
interface p extends FunctionalInteraceEx {
    public void abstractMethod();

//    public void abstractMethod2();
}

interface c extends FunctionalInteraceEx {
    public void abstractMethod2();
}

