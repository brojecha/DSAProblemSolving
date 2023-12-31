package com.technostack.striversA2Zsheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestElementInArray {

    // Multiple Approaches
        //1. Bruteforce Approach
        //2. Recursion Approach
        //3.TopBottom Approach
        //4.By Java 8 Methods
    public static void main(String[] args) {
        int[] arrayVal = {10,34,56,7,890};
        int printlargestNum = findLargest(arrayVal);
        System.out.println(printlargestNum);
    }

    // Brute Force Approach
    private static int findLargest(int[] arrayVal) {
        // If Array is Empty and does not have any value
        if(arrayVal.length == 0){
            return -1;
        }

        // If Array is not empty and contain only one value
        if(arrayVal.length == 1){
            return arrayVal[arrayVal.length-1];
        }

        int max = arrayVal[0];
        for (int j : arrayVal) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
