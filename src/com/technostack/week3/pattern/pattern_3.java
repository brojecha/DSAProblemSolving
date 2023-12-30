package com.technostack.week3.pattern;

public class pattern_3 {
    public static void main(String[] args) {
        int n = 4;
        printPattern3(n);
    }
    static void printPattern3(int n){
        //outer loop is for rows
        int i = 1;
        while(i <= n){
            int column = 1;
            while(column <= n){
                System.out.print(i+" ");
                column++;
            }
            i++;
            System.out.println();
        }
    }
}
