package loops;

public class reverseANumber {
    public static void main(String[] args) {
        int n = 10899;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.println("last digit " + lastDigit);
            n = n / 10;
        }
        System.out.println();
    }
}
