package com.technostack.week3;

import java.util.Scanner;

public class CodeBinarySearch {
    public static void main(String[] args) {
        int[] array = {1,3,7,9,11,12,45};
        int target = 3;
        int i = codeToBinarySearch(array, target);
        System.out.println(i);
    }

    static int codeToBinarySearch(int[] array, int target){
        int start = 0;
        int end = array.length -1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(target < array[mid]){
                end = mid -1;
            } else if(target > array[mid]){
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
