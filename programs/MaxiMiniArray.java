package com.programs;

import java.util.Arrays;
import java.util.Collections;

public class MaxiMiniArray {

    public static void findMinMax(int arr[]) {
        if (arr == null || arr.length == 0) {
            System.out.println("array is empty");
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }


    public static void main(String[] args) {

        int a[] = {1, 2, 9, 37, 83, 92};
        findMinMax(a);

        Integer b[] = {134, 273, 94, 37, 83, 92};

        Arrays.sort(b);
        System.out.println(" asc"+Arrays.toString(b));


        Arrays.sort(b, Collections.reverseOrder());
        for (int num:b){
            System.out.println(num);
        }




        }

    }

