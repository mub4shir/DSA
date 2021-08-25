package NumberTheory;

public class test1 {
    public static void main(String[] args) {
        int x=10;
        int n=18;
        int p = (int) 1e9+7;
        System.out.println(p);
        System.out.println(power(x,n,p));
    }
    private static long power(int x, int n,int p) {
        long res =1;
        while (n>0){
            if(n%2==1)
                res=(res*x)%p;
            x=(x*x)%p;
            n/=2;
        }
        return res;

    }

//    private static int power(int x, int n) {
//        if(n==0)
//            return 1;
//        else
//            return x*power(x,n-1);
//    }
//    private static long power(int x, int n) {
//        long res=1;
//        while(n-->0) res*=x;
//        return res;
//}
//    private static long power(int x, int n) {
//        if(n==0) return 1;
//        else if(n%2==0) return power(x*x,n/2);
//        else return x*power(x*x,(n-1)/2);
//    }
//    private static long power(int x, int n) {
//        long res =1;
//        while (n>0){
//            if(n%2==1)
//                res*=x;
//            x*=x;
//            n/=2;
//        }
//        return res;
//
//    }
//    private static long power(int x, int n, int p) {
//        if(n==0) return 1;
//        else if(n%2==0) return power((x*x)%p,n/2,p);
//        else return (x*power((x*x)%p,(n-1)/2,p))%p;
//    }




}
