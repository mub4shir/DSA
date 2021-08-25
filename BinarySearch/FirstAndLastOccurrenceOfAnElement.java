package BinarySearch;

public class FirstAndLastOccurrenceOfAnElement {
    public static void main(String[] args) {
        int[] arr ={2,4,10,10,10,20};
        int t= 10;
        System.out.println(fLOE(arr,t));
        System.out.println(fLOELLL(arr,t));
        System.out.println(Math.abs(fLOELLL(arr,t)-fLOE(arr,t))+1);

    }

    private static int fLOE(int[] arr, int t) {
        int n = arr.length;
        int l=0;
        int h=n-1;
        int res=-1;
        while(l<=h){
            int m = l +(h-l)/2;
            if(t==arr[m]){
                res=m;
                h=m-1;
            }
            else if(t<arr[m]){
                h=m-1;
            }else {
                l=m+1;
            }

        }
        return res;
    }
    private static int fLOELLL(int[] arr, int t) {
        int n = arr.length;
        int l=0;
        int h=n-1;
        int res=-1;
        while(l<=h){
            int m = l +(h-l)/2;
            if(t==arr[m]){
                res=m;
                l=m+1;
            }
            else if(t<arr[m]){
                h=m-1;
            }else {
                l=m+1;
            }

        }
        return res;
    }
}
