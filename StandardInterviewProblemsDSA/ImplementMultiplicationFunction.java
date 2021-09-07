package StandardInterviewProblemsDSA;
/*
Advanced guide to algorithm competition-fast exponentiation, find a^b mod p
// Fast power, find a^b mod p
        int power(int a, int b, int p) {
        int ans = 1;
        for (; b; b >>= 1) {
        if (b & 1) ans = (long long)ans * a % p;
        a = (long long)a * a % p;
        }
        return ans;
        }

// O(log b) algorithm for 64-bit integer multiplication
        long long mul(long long a, long long b, long long p) {
        long long ans = 0;
        for (; b; b >>= 1) {
        if (b & 1) ans = (ans + a) % p;
        a = a * 2 % p;
        }
        return ans;
        }

// Long double algorithm for 64-bit integer multiplication
        long long mul(long long a, long long b, long long p) {
        a %= p, b %= p; // When a and b must be between 0 and p, this line is unnecessary.
        long long c = (long double)a * b / p;
        long long ans = a * b - c * p;
        if (ans < 0) ans += p;
        else if (ans >= p) ans -= p;
        return ans;
        }
        */

public class ImplementMultiplicationFunction {
    public static void main(String[] args) {
        long a=1000000000;
        long b=1000000000;
        System.out.println(mul(a,b));
        System.out.println(a*b);
    }

    private static long mul(long a, long b) {
        long ans=0;
        for (; b!=0;b/=2) {
            if(b%2==1) ans+=a;
            a+=a;
        }
        return ans;
    }
}
