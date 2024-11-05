package com.technostack.dailyleetcode.Day2;

public class SelectionSortImplementation {
    public static void main(String[] args) {
        int[] array = {2,34,5,7,9,1};
        selectionSortImplementation(array);
        for (int i = 0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
    }

    private static void selectionSortImplementation(int[] array) {

        //first loop for pass

        for(int i = 0; i< array.length;i++){
            int min_index_val = i;
            for(int j = i+1;j<array.length;j++){
                if(array[j]< array[min_index_val]){
                    min_index_val = j;
                }
            }

            int temp = array[i];
            array[i] = array[min_index_val];
            array[min_index_val] = temp;
        }
    }
}
