package com.bridgelabz.employeewageproblems;

public class MultipleCompaniesEmployeeWage {
    // static variable declaration
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    static void EmployeeWageComputation(String companyName, int wagePerHour, int monthWorkDays, int monthWorkHours) {// creating a static method to compute employee daily wage
        int dayCount = 1;
        int workHours = 0;
        int empDailywage = 0;
        int totalEmpDailywage = 0;
        int totalWorkingHours = 0;
        int isPresent = 0;
        System.out.println(" ");
        while (dayCount <= monthWorkDays && workHours <= monthWorkHours) {
            isPresent = (int) (Math.random() * 10) % 3;
            int presentFulltime = 1;
            int presentParttime = 2;
            switch (isPresent) {
                case IS_FULL_TIME:// full time employee daily wage computation
                    System.out.println("Employee is Full TIme");
                    empDailywage = wagePerHour * FULL_DAY_HOUR;
                    workHours = workHours + FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:// part time employee daily wage computation
                    System.out.println("Employee is Part Time");
                    empDailywage = wagePerHour * PART_TIME_HOUR;
                    workHours = workHours + PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    break;
            }
            System.out.println("Daily Employee Wage of day " + dayCount + " is " + empDailywage);
            totalEmpDailywage += empDailywage;
            System.out.println("Working Hours ==> " + workHours);
            dayCount++;
        }
        System.out.println(" ");
        System.out.println("Company Name " + companyName);
        System.out.println("Total Working Hours " + workHours);
        System.out.println("Total Working Days " + dayCount);
        System.out.println("Total Employee Wage " + totalEmpDailywage);
    }
    public static void main(String[] args) {
        EmployeeWageComputation("Infosys", 20, 20, 100);// calling a Employee Wage Computation static method
        EmployeeWageComputation("TechM", 30, 24, 120);// calling a Employee Wage Computation static method
        EmployeeWageComputation("Wipro", 40, 18, 90);// calling a Employee Wage Computation static method
    }
}