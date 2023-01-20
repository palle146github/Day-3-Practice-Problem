package com.bridgelabz.employeewagecomputation;

public class CompanyEmpWage {
    // Variables
    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingHours;
    public final int maxWorkingDays;
    public int totalEmpWage;
    // Constructor
    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingHours, int maxWorkingDays) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingHours = numOfWorkingHours;
        this.maxWorkingDays = maxWorkingDays;
    }
    // Storing the total wage
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    @Override// Overriding toStringmethod
    public String toString(){
        return "Total wage of " + company + " is " + totalEmpWage;
    }
}
