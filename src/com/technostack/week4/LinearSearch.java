package com.technostack.week4;

import java.util.Scanner;

public class LinearSearch {

    // Implementation of Linear Search
    public static void main(String[] args) {
        int[] array = {12,4,56,789,900,9000};
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
       int myVal = implementLinearSearch(array,key);
        System.out.println("Index"+ ":" + myVal);

    }

    static int implementLinearSearch(int[] arrayVal ,int key){
        for(int i = 0; i < arrayVal.length;i++){
            if(arrayVal[i]==key){
                return i;
            }
        }
        return -1;
    }
}
