package com.arrays;

public class FindingMissingNumber {

    public static int findMissingNumber(int num[]) {

        int n = num.length;
        int actualSum = 0;
        int expectedSum = n * (n - 1) / 2;

//        int missingNum = expectedSum - actualSum;

        for (int i=0;i<num.length-1;i++) {
            actualSum = actualSum + num[i];

        }
        return expectedSum-actualSum;


    }

    public static void findMissingNumbers(int[] arr) {

        int indexValue = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - i != indexValue) {

                while (indexValue < arr[i] - i) {
                    System.out.print((i + indexValue) + " ");
                    indexValue++;
                }
            }
        }


    }

    public static void main(String[] args) {
        int arr[] = { 0,1, 2, 4, 5,6,7,8};
        System.out.println(findMissingNumber(arr));

        findMissingNumbers(arr);


    }
}
