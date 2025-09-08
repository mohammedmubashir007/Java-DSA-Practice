package loops;

public class whileLoop {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 100) {
            System.out.println("Hello "+counter);
            counter++;
        }
        System.out.println("Hello printed 100 times");
    }
}
