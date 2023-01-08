public class Main {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    public static void main(String[] args) {
            int empDailywage = 0 ;
            int isPresent = 0;
            isPresent = (int) ( Math.random() * 10 ) % 3;
            int presentFulltime = 1;
            int presentParttime = 2;

            if( isPresent == presentFulltime ){
                empDailywage  =  WAGE_PER_HOUR * FULL_DAY_HOUR;
            }
            else if ( isPresent == presentParttime ){
            empDailywage  =  WAGE_PER_HOUR * PART_TIME_HOUR;
            }

            else {
                System.out.println("Employee is Absent");

            }
        System.out.println("Daily Employee Wage ==> "+ empDailywage);

    }

    }
