package com.technostack.week5;

import java.util.Scanner;

public class FunctionWith2DArray {
    public static void main(String[] args) {
        int[][] ints = takeInput();
        printArray(ints);
    }

    public static int[][] takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter no of columns");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    public static void printArray(int[][] myaaray){
        int rows = myaaray.length;
        int colmuns = myaaray[0].length;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<colmuns;j++){
                System.out.print(myaaray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
