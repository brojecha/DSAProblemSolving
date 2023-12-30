package com.technostack.week3;

import java.util.Scanner;

public class SqureRootIntegral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //checkSqureRoot(n);

        checkSqureRootIntegral(n);
    }

    private static void checkSqureRootIntegral(int n) {
        int out = 0; // Initialize out variable here to store result
        while (out * out <= n) { // Checking if out squared is less than or equal to n
            out = out + 1; // Incrementing out until its square exceeds or equals n
        }
       out = out - 1; // Adjusting out by subtracting 1 to find the integral part of the square root
        System.out.print(out);
    }

//     static void checkSqureRoot(int n){
//        int i = 0;
//        int ans = 0;
//        int temp = 0;
//        while (n != 0){
//            temp =(int)Math.pow(2,i++);
//            if(temp > n) {
//               ans =  temp ;
//                break;
//            }
//        }
//         System.out.println(ans);
//    }



}
