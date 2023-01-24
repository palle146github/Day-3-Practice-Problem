public class Main {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int WORKING_DAYS_MONTH = 20;
    static final int WORKING_HOURS_MONTH = 100;

    static final int IS_PART_TIME = 1;

    static final int IS_FULL_TIME = 2;
    public static void main(String[] args) {
        int dayCount = 1;
        int workHours = 0;
        System.out.println( " ");
        while ( dayCount < WORKING_DAYS_MONTH && workHours <= WORKING_HOURS_MONTH){
            int empDailywage = 0 ;
            int isPresent = 0;
            isPresent = (int) ( Math.random() * 10 ) % 3;
            int presentFulltime = 1;
            int presentParttime = 2;
            switch ( isPresent ){
                case IS_FULL_TIME:
                    System.out.println( "Employee is Full TIme");

                    empDailywage  =  WAGE_PER_HOUR * FULL_DAY_HOUR;
                    workHours = workHours + FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println( "Employee is Part Time");
                    empDailywage  =  WAGE_PER_HOUR * PART_TIME_HOUR;
                    workHours = workHours + PART_TIME_HOUR;
                    break;
                default:
                    System.out.println( "Employee is Absent");
                    break;
            }
            System.out.println("Daily Employee Wage of day "+ dayCount + " is " + empDailywage);
            System.out.println( "Working Hours ==> " + workHours);
            dayCount++;

        }


    }

    }
