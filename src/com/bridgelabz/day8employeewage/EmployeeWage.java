package com.bridgelabz.day8employeewage;

public class EmployeeWage {

    static final int Wage_Per_Hour = 20;
    static final int Full_Time_Hour = 8;
    public static void main(String[] args) {
        int employeeAttendance = (int)Math.round(Math.random());
        System.out.println(employeeAttendance);
        int dailyWage = 0;
        if (employeeAttendance == 1){
            System.out.println("Employee is Present");
            dailyWage = Wage_Per_Hour*Full_Time_Hour;
        }
        else {
            System.out.println("Employee is absent");
        }
        System.out.println("daily Wage: "+dailyWage);
    }
}
