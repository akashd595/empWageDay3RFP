package com.bridgelabz.Day3LPEmployeeWageProblem;
import java.util.*;

public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        Random random = new Random();
        final int IS_FULL_DAY = 1;
        final int IS_HALF_DAY = 2;
        final int IS_ABSENT_TODAY = 0;
        final int FULL_DAY_HOUR = 8;
        final int HALF_DAY_HOUR = 4;
        final int ABSENT_DAY_HOUR = 0;
        final int WAGE_PER_HOUR = 20;
        int total_empl_hours = 0;
        int total_empl_wage = 0;
        int total_working_days = 0;
        int attendance;

        while ( total_empl_hours<=100 && total_working_days<20) {
            attendance = random.nextInt(3);
            switch (attendance) {
                case IS_FULL_DAY:
                    total_empl_hours += FULL_DAY_HOUR;
                    total_working_days++;
                    break;
                case IS_HALF_DAY:
                    total_empl_hours += HALF_DAY_HOUR;
                    total_working_days++;
                    break;
                case IS_ABSENT_TODAY:
                    total_empl_hours += ABSENT_DAY_HOUR;
                    total_working_days++;
                    break;
                default:
                    total_empl_hours = ABSENT_DAY_HOUR;
            }
        }

        total_empl_wage += WAGE_PER_HOUR * total_empl_hours;
        System.out.println("Total working days "+total_working_days);
        System.out.println("Total working hours "+total_empl_hours);
        System.out.println("Total wage:- " + total_empl_wage);


    }
}
