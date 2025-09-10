package functions;

public class binomialCoefficient {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n - r);

        int binCoeff = (nFact / (rFact * nrFact));
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
}
