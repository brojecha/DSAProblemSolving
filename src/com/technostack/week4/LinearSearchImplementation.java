package com.technostack.week4;

public class LinearSearchImplementation {
    public static void main(String[] args) {
        int[] array = {2,6,7,45,0,9};
        int number = 9;
        int index = linearSearchImplementation(array,number);
        System.out.println("Index Returned Value"+" "+index);
    }

    private static int linearSearchImplementation(int[] array, int number  ) {
        int size = array.length;
        if(size == 0){
            return  -1;
        }

        if(size == 1){
            return array[size -1];
        }

        for(int i = 0;i<array.length;i++){
            if(array[i] == number){
                return i;
            }
        }
        return -1;
    }
}
