package com.technostack.gfg;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] myArray = new int[n];
        for(int i = 0;i<=myArray.length-1;i++){
            myArray[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int value = searchElemntInArray(n, myArray, x);
        System.out.println("Index returned Value"+" "+value);
    }

    static int searchElemntInArray(int n,int[] myArray,int x){
        for(int i = 0;i <= myArray.length-1;i++){
            if(myArray[i]==x){
              return i;
            }
        }
        return -1;
    }
}
