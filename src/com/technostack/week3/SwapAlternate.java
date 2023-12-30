package com.technostack.week3;

public class SwapAlternate {
    public static void main(String[] args) {
        int[] array = {12, 3, 56, 4, 3, 78, 9, 0};
        int temp = 0;
        for (int i = 0; i < array.length; i += 2) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        printArray(array);
    }

    static void printArray(int[] array){
        for(int element :array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
