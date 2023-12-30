package com.technostack.week3;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {15, 5, 3, 5, 15};
        int val = findUniqueElement(arr);
        System.out.println(val);
    }

    static int findUniqueElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
