package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10};
        int x =4;
        System.out.println(bs(arr,x));
    }

    private static int bs(int[] arr, int x) {
        int n = arr.length;
        int l=0;
        int h=n-1;
        int ans =-1;
        while(l<=h){
            int m = l +(h-l)/2;
            if(arr[m]>=x) {
                ans = m;
                h = m - 1;
            }else
                l=m+1;

        }
        return ans;
    }

}
