package com.technostack.pepcoding.array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {91,87,6,32,12,334,654,999,-5};
        selectionSortImplementation(array);
        printArray(array);
    }

    static void selectionSortImplementation(int[] array){
        int temp;
        for(int i = 0;i<array.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<array.length;j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Prints the array
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr)
            System.out.print(j + " ");
    }
}
