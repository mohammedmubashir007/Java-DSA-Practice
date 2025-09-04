import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // negative or positive

        /*
         * Scanner sc = new Scanner(System.in);
         * int a = sc.nextInt();
         * 
         * String isPositive = (a>=1) ? "positive" : "negative";
         * if (a==0) isPositive = "nor positive nor negative ";
         * System.out.println(isPositive);
         */

        // fever or not
        /*
         * 
         * double temp = 103.5;
         * if (temp >= 100) {
         * System.out.println("fever");
         * } else {
         * System.out.println("no fever");
         * }
         */

        // leap year or not
        int year = 2000;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}
