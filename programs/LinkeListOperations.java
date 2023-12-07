package com.programs;

import java.util.LinkedList;

/*Implement a linked list with basic operations like insert, delete, and display.*/
public class LinkeListOperations {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(29);
        linkedList.add(63);
        linkedList.add(6);
        linkedList.add(68);
        linkedList.add(66);
        linkedList.add(60);
        linkedList.remove(1);


        System.out.println(linkedList);
    }
}
