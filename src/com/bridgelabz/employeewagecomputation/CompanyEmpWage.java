package com.bridgelabz.employeewagecomputation;

public class CompanyEmpWage {
    // Variables
    String company;
    int maxWorkingDay, maxWorkingHour, wagePerHour, ;

    double totalSalary;

    public CompanyEmpWage(String company, int maxWorkingDay, int maxWorkingHour, int wagePerHour) {
        this.company = company;
        this.maxWorkingDay = maxWorkingDay;
        this.maxWorkingHour = maxWorkingHour;
        this.wagePerHour = wagePerHour;
    }

    @Override
    public String toString() {
        return "Employee Company name : " + company
                + "\nEmployee monthly wage : $"
                + totalSalary + " USD"
                + "\nEmployee Total working hour : "
                + totalWorkingHour + " Hours\n"
                + "------------------------------------";
    }
}
