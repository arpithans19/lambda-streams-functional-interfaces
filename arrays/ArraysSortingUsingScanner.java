package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortingUsingScanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elemnts");
        int arr[]=new int[4];
        for (int i=0;i<4;i++){
            arr[i]= sc.nextInt();
        }

        //sorting
        Arrays.sort(arr);
        for(int num:arr){
            System.out.println(num);
        }

        //sum
        int sum=0;
        for(int n:arr){
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
