package com.technostack.week4;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,4,6,10,13};
        int[] arr2 = {2,5,7,9};
        mergeSortedArrayImplementation(arr1,arr2);
    }

    private static void mergeSortedArrayImplementation(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;

        int[] ans = new int[l1+l2];
        int k = 0;

        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                while (i<l1 && j<l2){
                    if(arr1[i] <= arr2[j]){
                        ans[k] = arr1[i];
                        i++;
                        k++;
                    }else {
                        ans[k] = arr2[j];
                        j++;
                        k++;
                    }
                }

                while(i< l1){
                    ans[k] = arr1[i];
                    i++;
                    k++;
                }

                while(j< l2){
                    ans[k] = arr1[j];
                    j++;
                    k++;
                }
            }
        }

        for(int val : ans){
            System.out.print(" "+val);
        }
    }
}
