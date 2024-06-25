package com.technostack.neetcode;

import java.util.Arrays;

public class DuplicateInteger_TwoPinterApproach {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        boolean val = findDuplicateNumber_ReturnTrue_TwoPointer(nums);
        System.out.println("Flag Val : "+" "+val);
    }

    private static boolean findDuplicateNumber_ReturnTrue_TwoPointer(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        boolean flag = false;
        Arrays.sort(nums);
        int start = 0;

        while(start < nums.length -1){
            if(nums[start] == nums[start+1]){
                flag = true;
            }
            start++;
        }

        return  flag;
    }


}
