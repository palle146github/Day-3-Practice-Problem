package com.bridgelabz.employeewagecomputation;

import java.util.*;
// implementation of interface

public class EmpWageBuilderGettingTotalWage implements ICompanyEmpWage {

    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;
    List<CompanyEmpWage> companies;
    public EmpWageBuilderGettingTotalWage() {
        this.companies = new ArrayList<CompanyEmpWage>();
    }

    @Override
    public void addCompany(String companyName, int maxWorkingDay, int maxWorkingHour, int wagePerHour) {
        CompanyEmpWage company = new CompanyEmpWage(companyName, maxWorkingDay, maxWorkingHour,wagePerHour);
        companies.add(company);
    }

    @Override
    public void computeEmpWage() {
        for (int i = 0; i < companies.size(); i++) {
            computeEmpWage(companies.get(i));
//			System.out.println(companies.get(i));
        }
        System.out.println(
                "Total companies : " + totalCompanies());
    }

    @Override
    public int totalCompanies() {
        return companies.size();
    }

    @Override
    public CompanyEmpWage getTotalEmpWage(String companyName) {
        for (CompanyEmpWage companyEmpWage : companies) {
            if (companyEmpWage.company.toLowerCase().equals(companyName.toLowerCase()))
                return companyEmpWage;
        }
        return null;
    }

    public double computeEmpWage(CompanyEmpWage company) {
        //Variables
        int empHrs;
        int totalWorkHours = 0;
        int totalWorkingDays = 0;
        while (totalWorkHours <= company.maxWorkingHour && totalWorkingDays < company.maxWorkingDay) {
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
            System.out.println("Day# " + totalWorkingDays + " Working Hours " + empHrs + " Daily wage " + empHrs * company.wagePerHour);
        }
        company.totalSalary = totalWorkHours * company.wagePerHour;
        company.totalWorkingHour = totalWorkHours;
        System.out.println("Total Working Hours " + totalWorkHours);
        System.out.println("Total wage " + company.totalSalary);
        return company.totalSalary;
    }


    public static void main(String[] args) {
        EmpWageBuilderGettingTotalWage empWageBuilder = new EmpWageBuilderGettingTotalWage();
        empWageBuilder.addCompany("DMart", 20, 60, 25);
        empWageBuilder.addCompany("Reliance", 22, 80, 35);
        empWageBuilder.addCompany("Asus", 20, 48, 22);
        empWageBuilder.addCompany("Tech Mahindra", 25, 80, 40);

        empWageBuilder.computeEmpWage();

        System.out.println(empWageBuilder.getTotalEmpWage("Asus"));
    }
    //Constants

}
