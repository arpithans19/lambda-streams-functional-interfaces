package com.arrays;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int[] a = new int[]{90, 30, 9, 8, 73, 89};

        //using sort method
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        for (int num:a){
            System.out.println(num);
        }

    }
}

