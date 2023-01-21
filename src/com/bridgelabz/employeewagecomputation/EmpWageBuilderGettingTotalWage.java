package com.bridgelabz.employeewagecomputation;

import java.util.*;
// implementation of interface

public class EmpWageBuilderGettingTotalWage implements ICompanyEmpWage{
    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    // Array Declaration
    private LinkedList<CompanyEmpWage> companyEmpWageLinkedList = new LinkedList<CompanyEmpWage>();//Creating LinkedList
    private Map<String, CompanyEmpWage> companyEmpWageMap = new HashMap<String, CompanyEmpWage>();
       //Creating Map

    public EmpWageBuilderGettingTotalWage(){
        companyEmpWageLinkedList = new LinkedList<CompanyEmpWage>();
        companyEmpWageMap = new HashMap<String, CompanyEmpWage>();    }
    @Override // Overriding the addCompnay method in the interface class
    public void addCompany(String company, int empRatePerHour, int numOfWorkingHours, int maxWorkingDays ){
        CompanyEmpWage companyEmpWage =new CompanyEmpWage(company,empRatePerHour,numOfWorkingHours,maxWorkingDays);
        companyEmpWageLinkedList.add(companyEmpWage);
        companyEmpWageMap.put(company, companyEmpWage);
    }
    // Employee Wage computation
    @Override// Overriding the computeEmpWage method in the interface class
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
            System.out.println("Day# " + totalWorkingDays + " Working Hours " + empHrs + " Daily wage "+ empHrs * companyEmpWage.empRatePerHour);
        }
        companyEmpWage.totalEmpWage = totalWorkHours * companyEmpWage.empRatePerHour;
        System.out.println("Total Working Hours " + totalWorkHours);
        return companyEmpWage.totalEmpWage;
    }
    // Compute employee wage for multiple companies
    @Override// Overriding the computeEmpWage method in the interface class
    public void computeEmpWage(){
        for( int i = 0; i < companyEmpWageLinkedList.size(); i++){
            companyEmpWageLinkedList.get(i).setTotalEmpWage((computeEmpWage(companyEmpWageLinkedList.get(i))));
            System.out.println(companyEmpWageLinkedList.get(i));
        }
    }

    public int getTotalWage(String company){
        return companyEmpWageMap.get(company).totalEmpWage;
    }

    public static void main(String[] args) {
        EmpWageBuilderGettingTotalWage empWageBuilderArray = new EmpWageBuilderGettingTotalWage();// Object declaration
        empWageBuilderArray.addCompany(" Wipro", 20, 100, 20);
        empWageBuilderArray.addCompany("Infosys", 15, 120, 25);
        empWageBuilderArray.addCompany(" TCS", 22, 110, 20);
        empWageBuilderArray.addCompany("Cognizant", 25, 90, 25);
        empWageBuilderArray.addCompany(" Capgemini", 18, 120, 20);
        empWageBuilderArray.computeEmpWage();
        System.out.println("Total Employee Wage of Capgemini is " +  empWageBuilderArray.getTotalWage("Capgemini"));
    }
}
