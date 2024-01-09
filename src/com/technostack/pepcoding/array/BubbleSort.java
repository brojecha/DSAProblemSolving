package com.technostack.pepcoding.array;

public class BubbleSort {
    public static void main(String[] args) {
        //Unsorted Array
        // Steps

        //1.Let assume arr[0] element is a bubble element.
        //2.Compare the bubble element with the adjacent element, if found greater element then swap the element.
        //3. The total no of swaps or steps to sort the element will be [array.length -1]
        //4.If the largest element is at its correct position [RIGHT MOST POSITION],
        // then for the remaining pass we do not have to compare that element, as it is in the correct
        // position and is already sorted.

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
