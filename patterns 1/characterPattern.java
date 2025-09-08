public class characterPattern {
    public static void main(String[] args) {
        char alpha = 'A';
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
    }
}
