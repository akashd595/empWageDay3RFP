package com.bridgelabz.Day3LPEmployeeWageProblem;
import java.util.*;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        Random random = new Random();
        int attendance = random.nextInt(2);
        int IS_FULL_DAY = 1;
        int IS_HALF_DAY = 2;
        int IS_ABSENT_TODAY = 0;

        if (attendance == IS_ABSENT_TODAY) {
            System.out.println("Employee is absent today");
        } else {
            System.out.println("Employee is Present today");
        }

    }
}
