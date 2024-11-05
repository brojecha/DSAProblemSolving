package com.technostack.dailyleetcode.Day1;

public class KadensAlgorithm {
    public static void main(String[] args) {
        int[] nums = {5,-7,8,3};
        int maxSubArraySumUsingKadensAlgo = findMaxSubArraySumUsingKadensAlgo(nums);
    }

    private static int findMaxSubArraySumUsingKadensAlgo(int[] nums) {
        int max = Integer.MIN_VALUE;
        int previousSum = 0;
        for(int i = 0;i<nums.length;i++){
            previousSum+=nums[i];
            max = Math.max(max,previousSum);
            if(previousSum<0){
                previousSum = 0;
            }
        }
        return max;
    }
}
