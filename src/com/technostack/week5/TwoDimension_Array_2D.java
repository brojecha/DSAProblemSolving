package com.technostack.week5;

import java.util.Scanner;

public class TwoDimension_Array_2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter the no of cols");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];

        //initialize the loop to read the value of array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //System.out.println("provide the number at" + i + "rows" + j + "column");
                array[i][j] = scanner.nextInt();
            }
        }

        //print the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
