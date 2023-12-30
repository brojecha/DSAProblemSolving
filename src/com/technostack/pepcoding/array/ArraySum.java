package com.technostack.pepcoding.array;

public class ArraySum {
    public static void main(String[] args) {
        int[] array1 = {5, 7, 3};
        int[] array2 = {9, 7, 5};
        int[] ans = sumOFArray(array1, array2);
        
        for (int i = 0; i < ans.length; i++) {
            System.out.print(" " + ans[i]);
        }
    }

    static int[] sumOFArray(int[] array1, int[] array2) {
        int len = array1.length > array2.length ? array1.length + 1 : array2.length + 1;
        int[] ans = new int[len];

        int i = array1.length - 1;
        int j = array2.length - 1;
        int k = ans.length - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;
            if (i >= 0) {
                sum += array1[i];
            }
            if (j >= 0) {
                sum += array2[i];
            }
            int val = sum % 10;
            carry = sum / 10;

            ans[k] = val;
            i--;
            j--;
            k--;


        }


        return ans;
    }
}
