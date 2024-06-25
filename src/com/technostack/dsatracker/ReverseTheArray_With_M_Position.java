package com.technostack.dsatracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseTheArray_With_M_Position {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1,2,3,4,5,6);
        int m = 3;
        reverseArrayWith_M_Position(array,m);
    }

    /**
     *
     * @param array
     * @param m
     */
    static void reverseArrayWith_M_Position(List<Integer> array,int m){
        int j = array.size() -1;
        for(int i = m+1;i<array.size()-1;i++){
            Collections.swap(array,i,j--);
        }
    }
}
