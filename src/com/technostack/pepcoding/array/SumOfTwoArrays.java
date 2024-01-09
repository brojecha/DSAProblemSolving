package com.technostack.pepcoding.array;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            a1[i] = scanner.nextInt();
        }


        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scanner.nextInt();
        }


        int[] ans = sumOfTwoArrays(a1, a2);

        for (int an : ans) {
            System.out.println(an);
        }
    }

    private static int[] sumOfTwoArrays(int[] a1, int[] a2) {
        int len = a1.length > a2.length ? a1.length +1:a2.length +1;
        int[] ans = new int[len];

        int i = a1.length -1;
        int j = a2.length -1;
        int k = ans.length -1;

        int carry = 0;
        while(i >=0 || j >=0 || carry>=0){
            int sum = carry;
            if(i >=0){
                sum+=a1[i];
            }
            if(j >= 0){
                sum+=a2[j];
            }
            int val = sum % 10;
            carry = sum/10;
            ans[k] = val;

            i--;
            j--;
            k--;

        }

        return ans;
    }

}




