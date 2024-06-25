package com.technostack.dsatracker;

public class SumOfMaxAndMin {
    public static void main(String[] args) {
        int[] array = {-1,-4,5,8,9,3};
        int val = sumOfMAxAndMinElementsInArray(array);
        System.out.println("Summation of MAx and Min Value"+":"+val);
    }

    private static int sumOfMAxAndMinElementsInArray(int[] arr) {
        if(arr.length == 0){
            return -1;
        }

        int max = arr[0];
        int min = arr[0];

        for(int j : arr){
            if(j > max){
                max = j;
            }else if(j < min){
              min = j;
            }
        }
        return max+min;
    }
}
