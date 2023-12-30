package com.technostack.week3;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 6, 8, 5, 4, 3};
        int[] arr2 = {2, 11};
        printIntersectionOfArrays(arr1, arr2);
    }

    static void printIntersectionOfArrays(int[] arr1, int[] arr2) {

        //int infinity = Integer.MIN_VALUE;
        //we do not need to use this value
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                   // arr2[j] = infinity;
                    break;
                }
            }
        }
    }
}
