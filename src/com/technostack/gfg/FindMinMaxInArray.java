package com.technostack.gfg;

import java.util.Scanner;

public class FindMinMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        for(int i = 0;i<=myArray.length-1;i++){
            myArray[i] = scanner.nextInt();
        }
        Pair minMax = getMinMax(myArray, n);
        System.out.println("Max"+":"+minMax.first);
        System.out.println("Min"+":"+minMax.second);
    }

    static Pair getMinMax(int[] myArrray ,int n){
        int max = myArrray[0];
        int min = myArrray[0];
        for(int i = 0;i<=myArrray.length-1;i++){
            if(myArrray[i] > max) {
                max = myArrray[i];
            }
            if(myArrray[i] < min) {
                min = myArrray[i];
            }
        }
        return new Pair(max,min);
    }

}
