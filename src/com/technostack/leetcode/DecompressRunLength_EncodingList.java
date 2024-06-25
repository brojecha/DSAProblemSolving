package com.technostack.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLength_EncodingList {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        int[] ints = deCompressEncodingLiust(nums);
        for(int printVal : ints){
            System.out.print(printVal+" ");
        }
    }

    static int[] deCompressEncodingLiust(int[] nums){
        int frequency = 0;
        int val = 0;
        List<Integer> intList = new ArrayList<>();
        int length = nums.length;

        //step 1 : find the pain in the array
        for(int i = 0;i<length;i+=2){
            frequency = nums[i];
            val = nums[i+1];

            // based on frequency we need to add the result[arrayList]
            for(int j = 0;j<frequency;j++){
                intList.add(val);
            }
        }
        // now retrive the data from array list

        int[] resArray = new int[intList.size()];
        for(int i = 0;i<intList.size();i++){
            resArray[i] = intList.get(i);
        }
        return resArray;
    }
}
