package com.technostack.week3.pattern;

import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPatternTriangleOfNumbers(n);
    }

    static void printPatternTriangleOfNumbers(int n){
        int i = 1;
        while(i<=n){
            int space = n -i;
            int j = 1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k<=i){
                System.out.print(i+k-1);
                k++;
            }

            int h = 1;
           // int dec_Count = 2*i - h -1;
            while(h<=i-1){
                System.out.print(2*i - h -1);
                h++;
            }
            System.out.println();
            i++;
        }
    }
}
