package com.bridgelabz.day8employeewage;

public class EmployeeWage {

        static final int Wage_Per_Hour = 20;
        static final int Full_Time_Hour = 8;
        static final int Part_Time_Hour = 4;
        public static void main(String[] args) {
            int employeeAttendance=(int)Math.floor(Math.random()*10)%3;
            System.out.println(employeeAttendance);
            int dailyWage = 0;

            if (employeeAttendance == 1){
                System.out.println("Employee is Present");
                dailyWage = Wage_Per_Hour*Full_Time_Hour;
            } else if (employeeAttendance == 2) {
                dailyWage = Wage_Per_Hour*Part_Time_Hour;
            } else {
                System.out.println("Employee is absent");
            }

            System.out.println("daily Wage: "+dailyWage);
        }
}
