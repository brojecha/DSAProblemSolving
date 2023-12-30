package com.technostack.week3;

public class PredictTheOutput {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        multi(arr);
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]);
        }
    }
    static void multi(int[] arr) {
        for (int i = 0; i < 5; i++) {
            arr[i]*=i;
        }
    }
}
