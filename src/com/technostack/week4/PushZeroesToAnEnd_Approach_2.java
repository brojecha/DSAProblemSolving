package com.technostack.week4;

public class PushZeroesToAnEnd_Approach_2 {
    public static void main(String[] args) {
        int[] array = {4,5,0,1,0,56,8,0,90};
        pushZeroesToAnEndImplementation_Approach2(array);
    }

    private static void pushZeroesToAnEndImplementation_Approach2(int[] array) {
       //In this approach we are going to changes everything in the same array
        // Here the return type is void

        int count = 0;
        for(int value : array){
            if(value != 0){
                array[count] = value;
                count++;
            }
        }

        while(count < array.length){
            array[count] = 0;
            count++;
        }

        for(int myVal : array){
            System.out.print(" "+myVal);
        }
    }
}
