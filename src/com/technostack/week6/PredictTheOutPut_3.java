package com.technostack.week6;

public class PredictTheOutPut_3 {
    public static void main(String[] args) {
        String a = "coding";
        for(int i = 2;i<4;i++){
            System.out.print(a.substring(i));
            // from the i= 2 index will print the value to last index and again same goes for 3 index, print from 3 rd index to end of string.
            // But when loop increment and goes to 4, the for loop condition fails, control out of loop, print answer "dinging".
        }
        System.out.println();
        System.out.println(a.substring(2));
    }
}
