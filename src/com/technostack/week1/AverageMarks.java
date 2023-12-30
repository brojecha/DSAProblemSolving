package com.technostack.week1;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = scanner.next();
        System.out.println("Enter marks of 3 students m1 , m2 , m3");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        printNameAndAverageMarksOfStudent(m1,m2,m3,name);
    }

    static void printNameAndAverageMarksOfStudent(int m1, int m2, int m3, String name){
        int average = m1+m2+m3/3;
        System.out.println("Name :"+name);
        System.out.println("Average Marks :"+average);
    }
}
