package com.technostack.gfg;

import java.util.HashMap;

public class FindMissingArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,5};
       // int val = findMissingUsingHAshMap(array);
        //System.out.println(val);

        int valUsingArray = findMissingNumberUsingArray(array);
        System.out.println(valUsingArray);
    }

    private static int findMissingNumberUsingArray(int[] array) {
        if(array.length == 0){
            return -1;
        }

        //create an array of size n+1
        int[] hashArray = new int[array.length+1];

        //store frequencies of elements
        for(int i = 0;i<array.length-1;i++){
            hashArray[array[i]]++;
        }

        //find the missing number
        for(int i = 1;i<=hashArray.length;i++){
            if(hashArray[i] == 0){
                return i;
            }
        }


        return -1;
    }

    private static int findMissingUsingHAshMap(int[] array) {
        if(array.length == 0){
            return -1;
        }

        //create a HAshMap
        HashMap<Integer,Boolean> hmap = new HashMap<>();
        //add array elements to HAshMap
        for(int val : array){
            hmap.put(val,true);
        }

        //iterate the array and check if map contains that values
        for(int i = 1; i<=array.length;i++){
            if(!hmap.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}
