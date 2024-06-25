package com.technostack.leetcode;

public class ScoreOfString {
    public static void main(String[] args) {
        //String s = "zaz";
        String s = null;
        int val = getScoreOfStringASCIIValue(s);
        System.out.println("Print Value :"+val);

    }

    static int getScoreOfStringASCIIValue(String s){
        if(s == null || s.isEmpty()){
            return -1 ;
        }
        int total = 0;
        int length = s.length();
        for(int i = 0;i<length-1;i++){
            total+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return total;
    }
}
