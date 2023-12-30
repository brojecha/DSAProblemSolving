package com.technostack.week3;

public class FindUniqueUsing_Boolean {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 14, 3};
        int val = findUniqueUsingBoolean(arr);
        System.out.println(val);
    }

    static int findUniqueUsingBoolean(int[] arr) {
        int value = -1;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                value = arr[i];
                break;
            }
        }
        return value;
    }
}
