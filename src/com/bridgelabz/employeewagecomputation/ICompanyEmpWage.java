package com.bridgelabz.employeewagecomputation;
// Interface declaration

public interface ICompanyEmpWage {
    public void addCompany(String companyName, int maxWorkingDay, int maxWorkingHour, int wagePerHour);

    public void computeEmpWage();

    public int totalCompanies();

    public CompanyEmpWage getTotalEmpWage(String companyName);
}
