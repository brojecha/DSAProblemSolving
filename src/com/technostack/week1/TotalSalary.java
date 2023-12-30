package com.technostack.week1;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basic = scanner.nextDouble();
        char grade = scanner.next().charAt(0);
        int allowence = 0;
        double totalSalary = 0;

        double hra = .20 * basic;
        double da = .50 * basic;


        if (grade == 'A') {
            allowence = 1700;
        } else if (grade == 'B') {
            allowence = 1500;
        } else {
            allowence = 1300;
        }

        double pf = .11 * basic;

        totalSalary = basic + hra + da + allowence - pf;
        System.out.println(totalSalary);
    }
}
