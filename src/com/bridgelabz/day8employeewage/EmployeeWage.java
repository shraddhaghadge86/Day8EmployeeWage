package com.bridgelabz.day8employeewage;

import java.util.ArrayList;

public class EmployeeWage {
    static ArrayList<CompanyEmpWage> companyList =  new ArrayList<CompanyEmpWage>();

    static void printWelcome(){
        System.out.println("Welcome to Employee + Wage Computation Program");
    }

    static void addToList(CompanyEmpWage emp){
        companyList.add(emp);
    }

    static void displayCompanyList(){
        System.out.println("Companies");
        System.out.println("__________________");
        for(int i=0;i<companyList.size();i++){
            System.out.println("Company : " + companyList.get(i).companyName);
            System.out.println("__________________");
            System.out.println("Company : " + companyList.get(i).companyName);
            System.out.println("Wage per hour : " + companyList.get(i).wagePerHour);
            System.out.println("total wage : " + companyList.get(i).totalWage);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printWelcome();
        CompanyEmpWage infosys = new CompanyEmpWage("infosys",1000,400,20);
        infosys.getTotalWage();
        CompanyEmpWage tcs = new CompanyEmpWage("tcs",900,800, 22);
        tcs.getTotalWage();
        addToList(tcs);
        addToList(infosys);

        displayCompanyList();
    }
}
