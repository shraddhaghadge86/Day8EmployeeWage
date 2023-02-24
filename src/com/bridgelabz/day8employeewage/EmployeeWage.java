package com.bridgelabz.day8employeewage;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    static final int FULL_TIME_EMPLOYEE = 2;
    static final int PART_TIME_EMPLOYEE = 1;

    static final int NUM_DAYS_IN_MONTH = 20;

    static void printWelcome(){
        System.out.println("Welcome to Employee + Wage Computation Program");
    }

    static void getTotalWage(){
        int wage = 0;
        int totalwage = 0;
        int totalHours = 0;
        int totaldays = 1;

        while(totaldays <=20 && totalHours<=20){
            int employeeCheck = (int) Math.floor(Math.random()*10) %3;
            switch(employeeCheck){
                case FULL_TIME_EMPLOYEE:
                    wage = FULL_DAY_HOUR * WAGE_PER_HOUR;
                    totalHours+= FULL_DAY_HOUR;
                    break;
                case PART_TIME_EMPLOYEE:
                    wage = PART_TIME_HOUR * WAGE_PER_HOUR;
                    totalHours+= PART_TIME_HOUR;
                    break;
                default:
                    wage = 0;
            }
            totalwage = totalwage+wage;
            totaldays++;
        }

        System.out.println(totalwage);
    }

    public static void main(String[] args) {
        printWelcome();
        getTotalWage();

    }

}
