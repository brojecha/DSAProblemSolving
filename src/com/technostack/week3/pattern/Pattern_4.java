package com.technostack.week3.pattern;

public class Pattern_4 {
    public static void main(String[] args) {
        int n = 4;
        printPattern4(n);
    }

    static void printPattern4(int n) {
        int row = 1;
        while(row <= n){
            int column = 1;
            while(column <= n){
                System.out.print(column+" ");
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
