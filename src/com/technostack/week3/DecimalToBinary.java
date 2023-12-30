package com.technostack.week3;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 3 different approaches




        // Using in built method
        //convertDecimalToBinaryUsingInbuiltMethod(n);
        // Using array
      //  convertUsingArray(n);
        // Using string
        convertUsingString(n);

    }

    private static void convertUsingString(int n) {
        String str = "";
        while (n != 0){
            int mod = n % 2;
            str =mod+str;
            n = n/2;

        }
        System.out.print(str);
    }

    private static void convertUsingArray(int n) {
        int[] binaryArray = new int[32];
        int index = binaryArray.length-1;
        while(n != 0){
           binaryArray[index] = n % 2;
           n= n/2;
           index --;
        }

        for(int myVal : binaryArray){
            System.out.print(myVal);
        }
    }

    static void convertDecimalToBinaryUsingInbuiltMethod(int n){
        String s = Integer.toBinaryString(n);
        System.out.print(s);
    }
}
