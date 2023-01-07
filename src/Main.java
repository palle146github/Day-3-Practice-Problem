public class Main {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    public static void main(String[] args) {
            int empDailywage = 0 ;
            int isPresent = 0;
            isPresent = (int) ( Math.random() * 10 ) % 2;
            int present = 1;
            if( isPresent == present ){
                empDailywage  =  WAGE_PER_HOUR * FULL_DAY_HOUR;
            }
            else {
                System.out.println("Employee is Absent");
            }
        System.out.println("Daily Employee Wage ==> "+ empDailywage);

    }

    }
