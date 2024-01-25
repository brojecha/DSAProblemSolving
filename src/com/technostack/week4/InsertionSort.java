package com.technostack.week4;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5,6,90,2,1,3};
        insertionSortImplementation(array);
        for(int val : array){
            System.out.print(val+" ");
        }
    }

    static void insertionSortImplementation(int[] array){
        int n = array.length;

        for(int i = 1; i< n;i++){
            int j = i;
            while(j > 0 && array[j] > array[j-1]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }

        }

    }
}
