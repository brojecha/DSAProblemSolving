package com.technostack.pepcoding.array;

public class FindElemenetInArray {
    public static void main(String[] args) {
        int[] array = {12, 45, 3, 6, 78, 9};
        int target = 78;
        int index = findElementInArray(array, target);
        System.out.println(index);
    }

    static int findElementInArray(int[] array, int target) {
        int index = 0;
        //we can use,for loop, while loop,
        //here we are using enhanced for loop
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                return index;
            }
        }
        return -1;
    }
}
