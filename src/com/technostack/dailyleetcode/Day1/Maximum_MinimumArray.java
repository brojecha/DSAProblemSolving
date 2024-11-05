package com.technostack.dailyleetcode.Day1;

public class Maximum_MinimumArray {
    public static void main(String[] args) {
        int[] array = {22, 14, 8, 17, 35, 3};
        int minFromArray = findMinFromArray(array);
        int maxFromArray = findMaxFromArray(array);
        System.out.println("Min and Max from Array :"+" "+ "Min :"+minFromArray+" "+"||"+" "+"Max :"+maxFromArray);

    }

    static int findMinFromArray(int[] array){
        int setMin = Integer.MAX_VALUE;
        for(int i = 0;i<array.length;i++){
            if(array[i] < setMin){
                 setMin = array[i];
            }
        }
        return setMin;
    }

    static int findMaxFromArray(int[] array){
        int setMax = Integer.MIN_VALUE;
        for(int i = 0;i<array.length;i++){
            if(array[i] > setMax){
                  setMax = array[i];
            }
        }
        return setMax;
    }


}
