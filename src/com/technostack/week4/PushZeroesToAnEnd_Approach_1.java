package com.technostack.week4;

import java.util.Arrays;

public class PushZeroesToAnEnd_Approach_1 {
    public static void main(String[] args) {
        //int[] array = {2,0,0,1,3,9,0,3,0};
        int[] array = {2,3,7,0,0,1};
        System.out.println(Arrays.toString(pushZeroesToAnEndImplementation(array)));
    }

    private static int[] pushZeroesToAnEndImplementation(int[] array) {

        if(array.length == 1){
            return array;
        }

        int[] myArray = new int[array.length];
        int count = 0;
        for(int number : array){
            if(number != 0){
                myArray[count] = number;
                count++;
            }
        }
        return myArray;
    }
}
