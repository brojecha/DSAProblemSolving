package com.technostack.week4;

public class SumOfTwoArrays {
    public static void main(String[] args) {
       // int arr1[] = new int[n];
        //int arr2[] = new int [m];

        int[] arr1 = {3,0,1,7};
        int[] arr2 = {1,1,6,7};

        sumOfTwoArrays(arr1,arr2);
    }
    static void sumOfTwoArrays(int[] arr1,int[] arr2){
        int len = arr1.length >= arr2.length ? arr1.length+1: arr2.length+1;
        int[] ans = new int[len];

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = ans.length-1;

        int carry = 0;
        while(i>=0 || j>=0 || carry > 0){
            int sum = carry;
            if(i >= 0){
                sum+=arr1[i];
            }
            if(j >= 0){
                sum+=arr2[j];
            }

            int val = sum % 10;
            carry = sum/10;
            ans[k] = val;
            i--;
            j--;
            k--;
        }
        for(int printVal : ans){
            System.out.print(" "+printVal);
        }
    }
}
