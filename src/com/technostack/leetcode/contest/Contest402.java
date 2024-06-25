package com.technostack.leetcode.contest;

import java.util.zip.CheckedOutputStream;

public class Contest402 {
    public static void main(String[] args) {
        int [] hours = {12,12,30,24,24};
        int val = countCompleteDayPainrs(hours);
        System.out.println("Val"+val);
    }

    private static int countCompleteDayPainrs(int[] hours) {
        int pairOne = 0;
        int pairTwo = 0;
        int count = 0;
        for(int i = 0;i<hours.length;i++){
            for(int j = i+1;j<hours.length;j++) {
                if ((hours[i]+hours[j]) % 24 == 0) {
                    pairOne = i;
                    pairTwo = j;
                    count++;
                    System.out.println("Pair" + ":" + "(" + pairOne + "," + pairTwo + ")");
                }
            }
        }
        return count;
    }
}
