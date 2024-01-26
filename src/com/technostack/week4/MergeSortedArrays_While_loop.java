package com.technostack.week4;

public class MergeSortedArrays_While_loop {
    public static void main(String[] args) {
        int[] arr1 = {1,4,6,10,13};
        int[] arr2 = {2,5,7,9};
       int[] ans = merge(arr1,arr2);
       for(int val : ans){
           System.out.print(" "+val);
       }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[m+n];

        while(i < m && j < n){
            if(arr1[i] <= arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<m){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n){
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
