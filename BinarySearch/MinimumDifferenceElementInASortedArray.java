package BinarySearch;

public class MinimumDifferenceElementInASortedArray {
    public static void main(String[] args) {
        int[] arr={1,3,8,10,11,15,17,19};
        int target =12;
        int l=0;
        int h=arr.length-1;
        System.out.println(search(arr,target,l,h));
    }

    private static int search(int[] arr, int target, int l, int h) {
        while (l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==target) return arr[m];
            else if(target<arr[m]) h=m-1;
            else l=m+1;
        }
        if(Math.abs(arr[l]-target)<Math.abs(arr[h]-target))
            return arr[l];
        else
            return arr[h];
    }

}
