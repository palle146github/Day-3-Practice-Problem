public class Main {
    public static void main(String[] args) {

            int isPresent = 0;
            isPresent = (int) Math.random()*10%2;
            int present = 1;
            if( isPresent == present ){
                System.out.println(" Employee Present");
            }
            else {
                System.out.println("Employee is Absent");
            }
        }
    }
