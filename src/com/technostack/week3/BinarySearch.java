package com.technostack.week3;

public class BinarySearch {
    public static void main(String[] args) {
        //return index if target found
        // return -1, if the target index is not found
        int[] array = {1, 2, 5, 7, 9, 9, 23, 41, 55};
        int target = 55;
        int val = searchTargetUsingBinarySearch(array, target);
        System.out.println(val);
    }

    static int searchTargetUsingBinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            //find the middle element
            int mid = (start + end) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
