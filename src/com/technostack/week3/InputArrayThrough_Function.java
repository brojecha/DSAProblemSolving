package com.technostack.week3;

import java.util.Scanner;

public class InputArrayThrough_Function {

    static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.println(" " + array[i]);
        }
    }

    static int[] takeInputArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] myarray = takeInputArray();
        printArray(myarray);
    }
}
