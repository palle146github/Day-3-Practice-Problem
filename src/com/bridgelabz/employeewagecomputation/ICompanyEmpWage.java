package com.bridgelabz.employeewagecomputation;

public interface ICompanyEmpWage {
    public void addCompany(String company, int empRatePerHour, int numOfWorkingHours, int maxWorkingDays);
    public int computeEmpWage(CompanyEmpWage companyEmpWage);
    public void computeEmpWage();
}
