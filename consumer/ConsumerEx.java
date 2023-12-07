package com.consumer;

import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {

        Consumer<String> str=s -> System.out.println(s);
       str.accept("arpitha");
       str.accept("java");
    }

}

