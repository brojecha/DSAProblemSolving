package com.technostack.pepcoding.array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray = {34,89,6,12,90};
        bubbleSortImplementation(myArray);
        printArray(myArray);
    }

    static void bubbleSortImplementation(int[] array){
        for(int i = 0;i <array.length;i++){
            int temp;
            for(int j = i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int j : arr)
            System.out.print(j + " ");
    }

}
