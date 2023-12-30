package com.technostack.week3;

public class FindDuplicateInAnArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 7};
       int val = findDuplicateInArray(array);
        System.out.println(val);
    }

    static int findDuplicateInArray(int[] array) {
        int inValidVal = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > 1) {
                return array[i];
            }
        }
        return inValidVal;
    }
}
