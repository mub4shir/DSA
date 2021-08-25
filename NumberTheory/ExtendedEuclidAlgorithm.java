package NumberTheory;

public class ExtendedEuclidAlgorithm {
    public static int d , x, y;
    public static void main(String[] args) {
        extendedEuclid(16, 10);
        System.out.println("GCD: " + d);
        System.out.println("Coefficients x and y are: " + x + " and " + y);



    }
    private static void extendedEuclid(int A, int B) {
        if(B == 0) {
            d = A;
            x = 1;
            y = 0;
        }
        else {
            extendedEuclid(B, A%B);
            int temp = x;
            x = y;
            y = temp - (A/B)*y;
        }
    }

}
