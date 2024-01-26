package com.technostack.week4;

public class LargestElementInAnArray_UsingForLoop {
    public static void main(String[] args) {
        int[] array = {1};
       int val =  largestElementInArrayUsingForLoop(array);
        System.out.print("Largest Value using for Loop"+" "+val);
    }

    private static int largestElementInArrayUsingForLoop(int[] array) {
        int n = array.length;
        if(n == 0){
            return -1;
        }

        if(n == 1){
            return array[array.length-1];
        }

        int max = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
