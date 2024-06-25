package com.technostack.week5;

import java.util.Scanner;

public class RowWiseSum_2DArray {
    public static void main(String[] args) {
       // int[][] input = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] input ={{},{},{},{}};
        sumOf2DArray(input);
    }


    public static void sumOf2DArray(int[][] ints) {
        int rows = ints.length;
        if(rows == 0){
            return;
        }
        int col = ints[0].length;
        for (int i = 0; i < rows; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < col; j++) {
                currentRowSum += ints[i][j];
            }
            System.out.print(currentRowSum + " ");
            System.out.println();
        }

    }
}
