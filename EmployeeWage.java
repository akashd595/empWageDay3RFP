package com.bridgelabz.Day3LPEmployeeWageProblem;
import java.util.*;

public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        Random random = new Random();

        int attendance = random.nextInt(3);
        int IS_FULL_DAY = 1;
        int IS_HALF_DAY = 2;
        int IS_ABSENT_TODAY = 0;
        int FULL_DAY_HOUR = 8;
        int HALF_DAY_HOUR = 4;
        int ABSENT_DAY_HOUR = 0;
        int WAGE_PER_HOUR = 20;
        int total_empl_hours = 0;
        int total_empl_wage = 0;

        if (attendance == IS_ABSENT_TODAY) {
            System.out.println("Employee is absent today");
        } else if (attendance == IS_HALF_DAY) {
            System.out.println("Employee is Half today");
            total_empl_hours += HALF_DAY_HOUR;
            total_empl_wage += WAGE_PER_HOUR*HALF_DAY_HOUR;
        } else {
            System.out.println("Employee is Present today");
            total_empl_hours += FULL_DAY_HOUR;
            total_empl_wage += WAGE_PER_HOUR*FULL_DAY_HOUR;
        }

        System.out.println("Total wage:- "+total_empl_wage);

    }
}
