package com.bridgelabz.day8employeewage;

import java.util.ArrayList;

public class EmployeeWage {
    static ArrayList<CompanyEmpWage> companyList =  new ArrayList<CompanyEmpWage>();

    static void printWelcome(){
        System.out.println("Welcome to Employee + Wage Computation Program");
    }
    
    public static void main(String[] args) {
        printWelcome();
        CompanyEmpWage infosys = new CompanyEmpWage("infosys",1000,400,20);
        infosys.getTotalWage();
        CompanyEmpWage tcs = new CompanyEmpWage("tcs",900,800, 22);
        tcs.getTotalWage();
    }
}
