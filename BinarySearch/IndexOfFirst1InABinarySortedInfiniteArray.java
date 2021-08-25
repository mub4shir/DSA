package BinarySearch;

public class IndexOfFirst1InABinarySortedInfiniteArray {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,};
        int target =1;
        int l = 0;
        int h = 1;
        while (arr[h]==0) {
            l = h;
            h*=2;
        }
        System.out.println(search(arr,target,l,h));
    }

    private static int search(int[] arr, int target,int l, int h) {
        int res=-1;
        while (l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==target){
                res=m;
                h=m-1;
            }
            else l=m+1;

        }
        return res;
    }
}
