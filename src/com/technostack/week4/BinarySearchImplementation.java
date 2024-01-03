package com.technostack.week4;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class BinarySearchImplementation {
    //Implementation Binary Search
    public static void main(String[] args) {
        int[] binaryArray = {2,3,4,10,40};
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int index = binarySearchImplementation(binaryArray,key);
        System.out.println("Index"+index);
    }

     static int binarySearchImplementation(int[] binaryArray, int key) {
         int start = 0;
         int end = binaryArray.length -1;

         while(start <= end){
             //finding the middle element
            int mid = start + (end-start)/2;

            if(key > binaryArray[mid]){
                start = mid +1;
            }else if(key < binaryArray[mid]) {
                end = mid -1;
            }else
                return mid;
         }

        return -1;
    }
}
