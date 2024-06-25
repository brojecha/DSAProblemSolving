package com.technostack.week6;

public class PredictTheOutput_4 {
    public static void main(String[] args) {
        String a = "coding";
        for(int i = 2;i<5;i++){
            System.out.print(a.substring(i-2,i+1));

            // substring with index range are exclusive, which means last value it do not return

        }
        System.out.println();
        System.out.println(a.substring(2,5)); //here the value return from 2 index to 4 index, 5 index value do not return.
        System.out.println(a.substring(2,6)); ////here the value return from 2 index to 5 index, 6 index value do not return.
    }
}
