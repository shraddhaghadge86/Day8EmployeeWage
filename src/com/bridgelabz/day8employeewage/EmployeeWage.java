package com.bridgelabz.day8employeewage;

public class EmployeeWage {

        static final int Wage_Per_Hour = 20;
        static final int Full_Time_Hour = 8;
        static final int Part_Time_Hour = 4;
        static final int Is_Part_Time_Hour=1;
        static final int Is_Full_Time_Hour=2;
        public static void main(String[] args) {
            int employeeAttendance=(int)Math.floor(Math.random()*10)%3;
            System.out.println(employeeAttendance);
            int dailyWage = 0;

            switch (employeeAttendance) {
                case Is_Full_Time_Hour:
                    System.out.println("Employee is Present");
                    dailyWage = Wage_Per_Hour * Full_Time_Hour;
                    break;
                case Is_Part_Time_Hour:
                    dailyWage = Wage_Per_Hour * Part_Time_Hour;
                    System.out.println("Employee is Part Time");
                    break;
                default:
                    System.out.println("Absent");
            }

            System.out.println("daily Wage: "+dailyWage);
        }
}
