package com.bridgelabz.day8employeewage;

public class CompanyEmpWage {
    String companyName;
    int totalWage;

    CompanyEmpWage(String name,int wagePerHour, int workingHouirsInMonth, int workingDaysInMonth){
        this.wagePerHour = wagePerHour;
        this.workingHouirsInMonth = workingHouirsInMonth;
        this.workingDaysInMonth = workingDaysInMonth;
        this.companyName = name;
    }

    static final int FULL_DAY_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    static final int FULL_TIME_EMPLOYEE = 2;
    static final int PART_TIME_EMPLOYEE = 1;

    int workingHouirsInMonth;
    int wagePerHour;
    int workingDaysInMonth;



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

        this.totalWage = totalwage;
    }
    }

