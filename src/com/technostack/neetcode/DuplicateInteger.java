package com.technostack.neetcode;

public class DuplicateInteger {
    public static void main(String[] args) {
        int[] nums = {1,2,5,4,3};
        boolean val = findDuplicateNumber_ReturnTrue(nums);
        System.out.println("Flag Val : "+" "+val);
    }

    private static boolean findDuplicateNumber_ReturnTrue(int[] nums) {
        boolean flag = false;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    flag = true;
                }
            }
        }
        return flag;
    }
}
