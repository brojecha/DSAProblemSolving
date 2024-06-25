package com.technostack.week5;

public class PrdictTheOutPut {
    public static void main(String[] args) {
        int[][] myArray = new int[4][5];
        for(int i = 0;i<4;i++){
            myArray[i][0] = 2;
        }
        System.out.println(myArray[3][0]);
    }
}
