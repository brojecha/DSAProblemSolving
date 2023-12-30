package com.technostack.pepcoding.array;

public class BarChart_Array {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 4, 3};
        printBarChartArray(array);
    }

    static void printBarChartArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        for (int h = max; h >= 1; h--) {
            for (int i = 0; i < array.length; i++) {
                if(h <= array[i]){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
