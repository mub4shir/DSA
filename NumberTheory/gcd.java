package NumberTheory;

public class gcd {
    public static void main(String[] args) {
        int a = 16;
        int b = 10;
        System.out.println(GCD(a, b));
    }
//The time complexity of this function is O(min(A, B)).
//    private static int GCD(int a, int b) {
//        int m = Math.min(a, b), gcd;
//        for (int i = m; i > 0; --i)
//            if (a % i == 0 && b % i == 0) {
//                gcd = i;
//                return gcd;
//            }
//        return -1;
//    }

  // The time complexity is O(log(max(A, B))).
    private static int GCD(int a, int b) {
        if(b==0)
            return a;
        else
            return GCD(b, a % b);
}

}
