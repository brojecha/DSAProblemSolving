package com.technostack.week4;

public class Sort_Zero_One_Two {
    public static void main(String[] args) {
        int[] arr = {2,0,1,2};
        int pz=0;
        int nextTwo=arr.length-1;
        for(int i=0;i<=nextTwo;i++){
            if(arr[i]==0){
                int temp=arr[pz];
                arr[pz]=arr[i];
                arr[i]=temp;
                pz++;
            }

            else if(arr[i]==2){
                int temp=arr[nextTwo];
                arr[nextTwo]=arr[i];
                arr[i]=temp;
                i--;
                nextTwo--;
            }
        }

        for(int val : arr){
            System.out.print(" "+val);
        }
    }
}
