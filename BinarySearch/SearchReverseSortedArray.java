package BinarySearch;

public class SearchReverseSortedArray {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        int t= 1;
        System.out.println(rBS(arr,t));
    }

    private static int rBS(int[] arr, int t) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(t==arr[mid]){
                return mid;
            }else if(t<arr[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }

        }
        return -1;
    }
}
