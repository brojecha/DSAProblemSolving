package com.technostack.gfg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> duplicate = duplicate(array, n);
        for (int k = 0; k < duplicate.size(); k++) {
            System.out.println(duplicate);
        }
    }

    static ArrayList<Integer> duplicate(int[] array, int n) {
        ArrayList<Integer> myList = new ArrayList<>();
        int duplicate = -1;
        // Iterate over all arr[i].
        for (int i = 0; i < array.length; i++) {
            // For each arr[i], consider all elements arr[j].
            // We iterate from j = i + 1, so this guarantees that i != j.
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicate = array[i];
                    break;
                }
            }
            if(duplicate != -1){
                myList.add(duplicate);
                break;
            }

        }
        return myList;
    }
}
