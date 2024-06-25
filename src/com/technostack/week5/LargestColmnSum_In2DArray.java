package com.technostack.week5;

public class LargestColmnSum_In2DArray {
    public static void main(String[] args) {
        int[][] arr ={{1,2,6},{3,4,9},{5,4,2}};
        int val =printLargestColumnSumMaxvalue(arr);
        System.out.println(val);
    }

    public static int printLargestColumnSumMaxvalue(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<row;i++){
           int sum = 0;
           for(int j = 0;j<col;j++){
               sum+=arr[i][j];
           }
           if(sum > max){
               max = sum;
           }

        }
        return max;
    }
}
