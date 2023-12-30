package com.technostack.week1;

public class FindTheOutput_02 {
    public static void main(String[] args) {
        int i = 10;
        while ((i = i - 1) > 0) {
            System.out.print(i);
            if (i % 5 == 0)
                return;
        }
    }
}
