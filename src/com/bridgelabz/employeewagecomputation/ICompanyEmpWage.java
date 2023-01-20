package com.bridgelabz.employeewagecomputation;
// Interface declaration

public interface ICompanyEmpWage {
    public void addCompany(String company, int empRatePerHour, int numOfWorkingHours, int maxWorkingDays);
    public int computeEmpWage(CompanyEmpWage companyEmpWage);
    public void computeEmpWage();
}
