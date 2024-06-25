package com.technostack.week5;

import java.util.Scanner;

public class InputAndPrint2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter no of columns");
        int columns = scanner.nextInt();
        int[][] arr = new int[rows][columns];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                System.out.println("Enter the element at"+i+"row"+j+"column");
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
