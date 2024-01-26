package com.technostack.week4;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int d = 2;
        rotate(array,d);
    }

    private static void rotate(int[] array, int d) {
        //Approach
        //1.Create a temporary array
        //2. Store the elements from d to n-1 in the temp array

        //create the temp array
        //// Storing rotated version of array
        int[] temp = new int[array.length];

        // Keeping track of the current index
        // of temp[]
        int k = 0;

        //iterate the array and store the element from d to n-1 in the temp array [n-d elements]
        for(int i = d;i<array.length;i++){
            temp[k] = array[i];
            k++;
        }

        // Storing the first d elements of array arr[]
        // into temp
        for(int i = 0;i<d;i++){
            temp[k] = array[i];
            k++;
        }

        // Copying the elements of temp[] in arr[]
        // to get the final rotated array
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }

        for(int printVal :array){
            System.out.print(" "+ printVal);
        }
    }
}
