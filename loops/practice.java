package loops;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // sum of even and odd
        /*
         * 
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter number of digits: ");
         * int numberOfInput = sc.nextInt();
         * 
         * int sumOfEven = 0;
         * int sumOfOdd = 0;
         * 
         * for (int i = 1; i <= numberOfInput; i++) {
         * int newNumber = sc.nextInt();
         * if (newNumber % 2 == 0) {
         * sumOfEven += newNumber;
         * } else {
         * sumOfOdd += newNumber;
         * }
         * }
         * System.out.println("Sum of even: " + sumOfEven);
         * System.out.println("Sum of even: " + sumOfOdd);
         */

        // factorial
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
