package com.technostack.dailyleetcode.Day2;

public class BubbleSortImplementation {
    public static void main(String[] args) {
        int[] array = {3,1,7,89,1,311};
        Sort(array);
        for(int i = 0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }

    }

    public static void Sort(int[] array){

        //pass or turn
        for(int turn = 1; turn<array.length;turn++){

            for(int k = 0; k<array.length -turn;k++){
                if(array[k] > array[k+1]){
                    int temp = array[k];
                    array[k] = array[k+1];
                    array[k+1] = temp;
                }
            }
        }
    }
}
