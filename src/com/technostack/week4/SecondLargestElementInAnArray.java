package com.technostack.week4;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] array = {4,3,10,9,2};
       int secondLargest =  secondLargestElementInArray(array);
        System.out.println("SecondLargest Element in an Array"+" "+secondLargest);
    }

    private static int secondLargestElementInArray(int[] array) {
        int size = array.length;
        //sort the array using bubble sort
        for(int i = 0;i<array.length;i++){
            for(int j = i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
       // int largest = array.length - 2;
        //return array[largest];
        return array[size -2];
    }
}
