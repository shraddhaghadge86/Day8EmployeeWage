package com.bridgelabz.day8employeewage;

import java.util.ArrayList;

public class EmployeeWage {
    static ArrayList<CompanyEmpWage> companyList =  new ArrayList<CompanyEmpWage>();

    EmployeeWage(int wagePerHour, int workingHouirsInMonth, int workingDaysInMonth){
        this.wagePerHour = wagePerHour;
        this.workingHouirsInMonth = workingHouirsInMonth;
        this.workingDaysInMonth = workingDaysInMonth;
    }

    static final int FULL_DAY_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    static final int FULL_TIME_EMPLOYEE = 2;
    static final int PART_TIME_EMPLOYEE = 1;

    int workingHouirsInMonth;
    int wagePerHour;

    int workingDaysInMonth;

    static void printWelcome(){
        System.out.println("Welcome to Employee + Wage Computation Program");
    }

    void getTotalWage(){
        int wage = 0;
        int totalwage = 0;
        int totalHours = 0;
        int totaldays = 1;

        while(totaldays <=this.workingDaysInMonth && totalHours<=this.workingHouirsInMonth){
            int employeeCheck = (int) Math.floor(Math.random()*10) %3;
            switch(employeeCheck){
                case FULL_TIME_EMPLOYEE:
                    wage = FULL_DAY_HOUR * this.wagePerHour;
                    totalHours+= FULL_DAY_HOUR;
                    break;
                case PART_TIME_EMPLOYEE:
                    wage = PART_TIME_HOUR * this.wagePerHour;
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
        EmployeeWage infosys = new EmployeeWage(1000,400,20);
        infosys.getTotalWage();
        EmployeeWage tcs = new EmployeeWage(900,800, 22);
        tcs.getTotalWage();
    }
}
