package com.technostack.week3;

public class    Sort_0_1_Approach1 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 0, 0, 0, 1};
        sortZeroAndOne(array);
        for(int val : array){
            System.out.print(val+" ");
        }
    }

    static void sortZeroAndOne(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            array[i] = 0;
        }

        for(int i = count;i<array.length;i++){
            array[i] = 1;
        }

    }
}
