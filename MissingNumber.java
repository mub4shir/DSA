import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x1 = sc.nextLong();
        long x2 = 1;
        for (long i = 1; i < n-1; i++)
            x1 ^=sc.nextLong();
        for (long i = 2; i <=n ; i++)
            x2 ^=i;
        System.out.println(x1^x2);


    }
}
