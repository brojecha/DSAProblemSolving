package com.technostack.week4;

public class InsertionSort_CodingApproach2 {
    public static void main(String[] args) {
        int[] array = {6,3,9,0,2,1,7};
        for(int i = 1;i<array.length;i++){
            int j = i;
            int temp = array[i];
            while(j > 0 && array[j-1] > temp){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
        for (int j : array) {
            System.out.print(" " + j);
        }
    }
}
