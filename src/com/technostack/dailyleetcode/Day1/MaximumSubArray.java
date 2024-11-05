package com.technostack.dailyleetcode.Day1;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {5,-7,8,3};
        int maxSubArraySum = findMaxSubArraySum(nums);
        System.out.println(maxSubArraySum);
    }

    private static int findMaxSubArraySum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            int previousSum = 0;
           for(int j = i;j<nums.length;j++){
               previousSum+=nums[j];
               max = Math.max(max,previousSum);
           }
        }
        return max;
    }
}
