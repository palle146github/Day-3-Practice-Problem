package com.bridgelabz.employeewagecomputation;

public class EmpWageBuilderArray implements ICompanyEmpWage{
    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    // Array Declaration
    CompanyEmpWage[] companyEmpWageArray = new CompanyEmpWage[10];
    int noOfCompany = 0;

    public void addCompany(String company, int empRatePerHour, int numOfWorkingHours, int maxWorkingDays ){
        companyEmpWageArray[noOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfWorkingHours,maxWorkingDays);
        noOfCompany++;
    }
    // Employee Wage computation
    public int computeEmpWage(CompanyEmpWage companyEmpWage){
        //Variables
        int empHrs = 0;
        int totalWorkHours = 0;
        int totalWorkingDays = 0;
        while (totalWorkHours <= companyEmpWage.numOfWorkingHours && totalWorkingDays < companyEmpWage.maxWorkingDays) {
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalWorkingDays++;
            totalWorkHours += empHrs;
            System.out.println("Day# " + totalWorkingDays + " Working Hours " + empHrs);
        }
        companyEmpWage.totalEmpWage = totalWorkHours * companyEmpWage.empRatePerHour;
        System.out.println("Total Working Hours " + totalWorkHours);
        return companyEmpWage.totalEmpWage;
    }
    // Compute employee wage for multiple companies
    public void computeEmpWage(){
        for( int i = 0; i < noOfCompany; i++){
            companyEmpWageArray[i].setTotalEmpWage((computeEmpWage(companyEmpWageArray[i])));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    public static void main(String[] args) {
        EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();// Object declaration
        empWageBuilderArray.addCompany(" Wipro", 20, 100, 20);
        empWageBuilderArray.addCompany("Infosys", 15, 120, 25);
        empWageBuilderArray.addCompany(" TCS", 22, 110, 20);
        empWageBuilderArray.addCompany("Cognijant", 25, 90, 25);
        empWageBuilderArray.addCompany(" Capgemini", 18, 120, 20);
        empWageBuilderArray.computeEmpWage();
    }
}
