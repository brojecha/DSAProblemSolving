package com.technostack.week4;

import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        arrangeNumbersInArray(n,myArray);
    }

    static void arrangeNumbersInArray(int n,int[] myArray){
        int start = 0;
        int end = n-1;
        for(int i = 1;i<=n;i++)
            if (i % 2 == 1) {
                myArray[start++] = i;
            } else
                myArray[end--] = i;

        for (int i : myArray) {
            System.out.println("Print Value" + " " + i);
        }
    }
}
