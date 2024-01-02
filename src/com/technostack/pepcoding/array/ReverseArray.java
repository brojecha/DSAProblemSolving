package com.technostack.pepcoding.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arrayVal = {12,5,3,7,9};
        reverseArrayValue(arrayVal);
    }

    static void reverseArrayValue(int[] array){
        //1. Bruteforce Approach [But it is not feasible approach]
        //read the array values from back side and print the value
        for(int i = array.length-1;i>=0;i--){
            System.out.print(array[i]);
        }
    }
}
