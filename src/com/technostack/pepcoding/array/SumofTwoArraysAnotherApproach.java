package com.technostack.pepcoding.array;

import java.util.Scanner;

public class SumofTwoArraysAnotherApproach {

    public static void sumOfTwoArrays(int[] arr1, int[] arr2, int[] output) {
        //Your code goes here

        int n=arr1.length;
        int m=arr2.length;
        int n1=output.length;

        int i=n-1;
        int j=m-1;
        int k=n1-1;
        int carry=0;

        while(i>=0 && j>=0){
            int rem=0;
            int p=arr1[i]+arr2[j]+carry;
            carry=p/10;
            rem=p%10;
            output[k]=rem;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            output[k]=carry;
        }

        while (j>=0){
            output[k]=arr2[j];
            j--;
            k--;
        }

        while(i>=0){
            output[k]=arr1[i];
            i--;
            k--;
        }
    }

}