package com.technostack.week3;

public class largestElementinArray {
    public static void main(String[] args) {
        int[] array = {12, 3, 5, 67, 8};
        int largeVal = findLargestElementInArray(array);
        System.out.println("Bigger Value in Array " + largeVal);
    }

    static int findLargestElementInArray(int[] array) {
        int largest = array[0];
        int temp = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] > array[0]) {
                temp = array[i];
                array[i] = array[0];
                largest = temp;
            }
        }
        return largest;
    }
}
