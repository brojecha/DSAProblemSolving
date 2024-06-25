package com.technostack.leetcode;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.*;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
      //  List<Integer> targetIndices = findTargetIndices(nums, target);

      /*  for(Integer val : targetIndices){
            System.out.println("Printing index val :"+" "+val);
        }
        */
        List<Integer> getIndices = getTargetIndices(nums, target);
        for(Integer val : getIndices){
            System.out.println("Printing index val :"+" "+val);
        }

    }

    // Note : Here we have taken more time to execute. the solution is ok but not memoery wise and execution wise not good.
    // We have used two arrayList which is not appropriate as well.
    private static List<Integer> findTargetIndices(int[] nums, int target) {
        List<Integer> numList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        for(Integer data : nums) numList.add(data);
        sort(numList);
        for(int i = 0;i < numList.size();i++){
            if(target == numList.get(i)){
                indexList.add(i);
            }
        }
        return indexList;
    }

    //It is more appropriate and more good to use.
    private static List<Integer> getTargetIndices(int[] nums, int target) {
        // to sort Arrays we have sort method given in Arrays.
        Arrays.sort(nums);
        List<Integer> indexList = new ArrayList<>();
        for(int j = 0;j<nums.length;j++){
            if(target == nums[j]){
                indexList.add(j);
            }
        }
        return indexList;
    }
}
