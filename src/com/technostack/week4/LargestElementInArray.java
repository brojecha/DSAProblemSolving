package com.technostack.week4;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = {12,5,6,7,89,990};
        int val = largestElemnInArray(array);
        System.out.println("Largest Element in an Array"+" "+val);
    }

     static int largestElemnInArray(int[] array) {
       int max = array[0];
       for(int val : array){
           if(val > max){
               max = val;
           }
       }
        return max;
    }
}
