package operators;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println((3>2) && (1!=0));
        System.out.println((3<2) || (1!=1));
        System.out.println(!((3<2) || (1!=1)));
    }
}
