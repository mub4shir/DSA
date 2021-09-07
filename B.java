import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class B {

    static class CP {
        static boolean isPrime(long n) {
            if (n <= 1)
                return false;
            if (n == 2 || n == 3)
                return true;
            if (n % 2 == 0 || n % 3 == 0)
                return false;
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0)
                    return false;
            }
            return true;
        }

        static int ifnotPrime(int prime[], int x)
        {
            // checking whether the value of element
            // is set or not. Using prime[x/64],
            // we find the slot in prime array.
            // To find the bit number, we divide x
            // by 2 and take its mod with 32.
            return (prime[x/64] & (1 << ((x >> 1) & 31)));
        }

        // Marks x composite in prime[]
        static void makeComposite(int prime[], int x)
        {
            // Set a bit corresponding to given element.
            // Using prime[x/64], we find the slot
            // in prime array. To find the bit number,
            // we divide x by 2 and take its mod with 32.
            prime[x/64] |= (1 << ((x >> 1) & 31));
        }

        // Prints all prime numbers smaller than n.
        static ArrayList<Integer> bitWiseSieve(int n)
        {
            ArrayList<Integer> al=new ArrayList<Integer>();
            int prime[] = new int[n/64 + 1];


            // 2 is the only even prime so we
            // can ignore that loop starts from
            // 3 as we have used in sieve of
            // Eratosthenes .
            for (int i = 3; i * i <= n; i += 2) {

                // If i is prime, mark all its
                // multiples as composite
                if (ifnotPrime(prime, i)==0)
                    for (int j = i * i, k = i << 1;
                         j < n; j += k)
                        makeComposite(prime, j);
            }

            // writing 2 separately
            al.add(2);

            // Printing other primes
            for (int i = 3; i <= n; i += 2)
                if (ifnotPrime(prime, i) == 0)
                    al.add(i);

            return al;
        }

        static List<Integer> sieve(long size) {
            ArrayList<Integer> pr = new ArrayList<Integer>();
            boolean prime[] = new boolean[(int)size];
            for (int i = 2; i < prime.length; i++) prime[i] = true;
            for (int i = 2; i * i < prime.length; i++) {
                if (prime[i]) {
                    for (int j = i * i; j < prime.length; j += i) {
                        prime[j] = false;
                    }
                }
            }
            for (int i = 2; i < prime.length; i++) if (prime[i]) pr.add(i);
            return pr;
        }

        static long binary_Expo(long a, long b)   // calculating a^b
        {
            long res = 1;
            while (b != 0) {
                if ((b & 1) == 1) {
                    res *= a;
                    --b;
                }
                a *= a;
                b /= 2;
            }
            return res;
        }

        static long Modular_Expo(long a, long b) {
            long res = 1;
            while (b != 0) {
                if ((b & 1) == 1) {
                    res = (res * a) % 1000000007;
                    --b;
                }
                a = (a * a) % 1000000007;
                b /= 2;
            }
            return res;
        }

        static int i_gcd(int a, int b)  // iterative way to calculate gcd.
        {
            while (true) {
                if (b == 0)
                    return a;
                int c = a;
                a = b;
                b = c % b;
            }
        }

        static long gcd(long a, long b)  // here b is the remainder
        {
            if (b == 0)
                return a; //because each time b will divide a.
            return gcd(b, a % b);
        }

        static long ceil_div(long a, long b)   // a numerator b denominator
        {
            return (a + b - 1) / b;
        }

        static int getIthBitFromInt(int bits, int i) {
            return (bits >> (i - 1)) & 1;
        }

        static int upper_Bound(int a[], int x)  //closest to the left+1
        {
            int l = -1, r = a.length;
            while (l + 1 < r) {
                int m = (l + r) >>> 1;
                if (a[m] <= x)
                    l = m;
                else
                    r = m;
            }
            return l + 1;
        }

        static int upper_Bound(List<Integer> a, int x) //closest to the left+1
        {
            int l = -1, r = a.size();
            while (l + 1 < r) {
                int m = (l + r) >>> 1;
                if (a.get(m) <= x)
                    l = m;
                else
                    r = m;
            }
            return l + 1;
        }

        static int lower_Bound(int a[], int x)  //closest to the right
        {
            int l = -1, r = a.length;
            while (l + 1 < r) {
                int m = (l + r) >>> 1;
                if (a[m] >= x)
                    r = m;
                else
                    l = m;
            }
            return r;
        }

        static int lower_Bound(List<Integer> a, int x)  //closest to the right
        {
            int l = -1, r = a.size();
            while (l + 1 < r) {
                int m = (l + r) >>> 1;
                if (a.get(m) >= x)
                    r = m;
                else
                    l = m;
            }
            return r;
        }

        static boolean isSquarefactor(int x, int factor, int target) {
            int s = (int) Math.round(Math.sqrt(x));
            return factor * s * s == target;
        }

        static boolean isSquare(int x) {
            int s = (int) Math.round(Math.sqrt(x));
            return x * x == s;
        }

        static void sort(int a[]) // heap sort
        {
            PriorityQueue<Integer> q = new PriorityQueue<>();
            for (int i = 0; i < a.length; i++)
                q.add(a[i]);
            for (int i = 0; i < a.length; i++)
                a[i] = q.poll();
        }

        static void shuffle(int[] in) {
            for (int i = 0; i < in.length; i++) {
                int idx = (int) (Math.random() * in.length);
                fast_swap(in, idx, i);
            }
        }

        static void reverse_ruffle_sort(int a[]) {
            shuffle(a);
            Arrays.sort(a);
            for (int l = 0, r = a.length - 1; l < r; ++l, --r)
                fast_swap(a, l, r);

        }

        static void ruffle_sort(int a[]) {
            shuffle(a);
            Arrays.sort(a);
        }

        static int getMax(int arr[], int n) {
            int mx = arr[0];
            for (int i = 1; i < n; i++)
                if (arr[i] > mx)
                    mx = arr[i];
            return mx;
        }

        static int[] z_function(String s) {
            int n = s.length(), z[] = new int[n];

            for (int i = 1, l = 0, r = 0; i < n; ++i) {
                if (i <= r)
                    z[i] = Math.min(z[i - l], r - i + 1);

                while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i]))
                    ++z[i];

                if (i + z[i] - 1 > r) {
                    l = i;
                    r = i + z[i] - 1;
                }
            }
            return z;
        }

        static void swap(int a[], int idx1, int idx2) {
            a[idx1] += a[idx2];
            a[idx2] = a[idx1] - a[idx2];
            a[idx1] -= a[idx2];
        }

        static void fast_swap(int[] a, int idx1, int idx2) {
            if (a[idx1] == a[idx2])
                return;

            a[idx1] ^= a[idx2];
            a[idx2] ^= a[idx1];
            a[idx1] ^= a[idx2];
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class Pair {
        int l,r,count;

        Pair(int l,int r,int count) {
            this.l=l;
            this.r=r;
            this.count=count;
        }
    }
    //int[] input = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,String> map=new HashMap<String,String>();
        int n=Integer.parseInt(br.readLine());
        int flag=0;
        for(int i=0;i<n;i++)
        {
            String str[]=br.readLine().split(" ");
            String s1=str[0];
            String s2=str[1];
            if(map.containsKey(s1) && map.get(s1).equals(s2))
            {
                flag=1;
                break;
            }
            else
            {
                map.put(s1,s2);
            }
        }
        System.out.println((flag==1)?"Yes":"No");
    }
}
