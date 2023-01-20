package com.bridgelabz.employeewagecomputation;

public class EmpWageBuilderTotalWageSave {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingHours;
    private final int maxWorkingDays;
    private int totalEmpWage;

    public EmpWageBuilderTotalWageSave(String company, int empRatePerHour, int numOfWorkingHours, int maxWorkingDays) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingHours = numOfWorkingHours;
        this.maxWorkingDays = maxWorkingDays;
    }

    void computeEmployeeWage() {
        //Variables
        int empHrs = 0;
        int totalWorkHours = 0;
        int totalWorkingDays = 0;
        while (totalWorkHours <= numOfWorkingHours && totalWorkingDays < maxWorkingDays) {
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
        totalEmpWage = totalWorkHours * empRatePerHour;
    }

    @Override
    public String toString() {
        return "Total Wage of " + company + " is " + totalEmpWage;
    }

    public static void main(String[] args) {
        EmpWageBuilderTotalWageSave wipro = new EmpWageBuilderTotalWageSave(" Wipro", 20, 100, 20);
        EmpWageBuilderTotalWageSave infosys = new EmpWageBuilderTotalWageSave("Infosys", 15, 120, 25);
        wipro.computeEmployeeWage();
        infosys.computeEmployeeWage();
        System.out.println(wipro);
        System.out.println(infosys);
    }
}
