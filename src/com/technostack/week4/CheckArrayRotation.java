package com.technostack.week4;

public class CheckArrayRotation {
    public static void main(String[] args) {
        int[] array ={4,5,6,1,2,3,};
        // 5 > 6 false
        //6 > 1 true
       int arrayRotateBy_Val =  checkArrayRotationImplementation(array);
        System.out.println("ArrayRotateBy_Val"+" "+arrayRotateBy_Val);
    }



    private static int checkArrayRotationImplementation(int[] array) {
        int size = array.length;

        if(size == 0){
            return -1;
        }

        if(size == 1){
            return array[size -1];
        }

        for(int i = 0;i<array.length;i++){
           if(array[i] > array[i+1]){
               return i+1;
           }
        }
        return 0;
    }
}
