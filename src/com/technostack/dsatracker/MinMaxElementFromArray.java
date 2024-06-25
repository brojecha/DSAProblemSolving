package com.technostack.dsatracker;

public class MinMaxElementFromArray {
    public static void main(String[] args) {
        int[] array =  {1, 345, 234, 21, 56789};
        getMinMAxFromArray(array);
    }

    /**
     *
     * @param array
     */
    
    private static void getMinMAxFromArray(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int j : array) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        System.out.println("Min"+":"+min+"---"+"Max"+":"+max);
    }
}
