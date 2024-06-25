package com.technostack.week5;

public class PredictTheOutput_4 {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        //System.out.println(arr[2].length);  all values initialized with null. On null if we call a method we will get null pointer exception.
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[2].length);
        }
    }
}
 