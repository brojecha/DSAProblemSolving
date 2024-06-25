package com.technostack.dsatracker;

import java.util.Arrays;


public class ReverseArray_Upto_Given_Position {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int k = 4;
        reverseArrayUptoGivenPosition(array,k);
        printArray(array);
    }

    /**
     *
     * @param array
     * @param k
     */
    private static void reverseArrayUptoGivenPosition(int[] array, int k) {
        if(array.length == 0 || k > array.length){
            System.out.println("Invalid Array"+":"+ Arrays.toString(array) +"and Value of K"+":"+k);
        }
        System.out.println("Array value At 0 index"+":"+array[0]);
        int start = 0;
        int end = k-1;
        int tempSwap = 0;
        while(start < end) {
            tempSwap = array[start];
            array[start] = array[end];
            array[end] = tempSwap;
            start++;
            end--;
        }
        System.out.println("After Swap"+":");

        System.out.println("Array value At 0 index"+":"+array[0]);
    }

    /**
     *
     * @param array
     */

    /* Utility that prints out an array on a line */
    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

}
