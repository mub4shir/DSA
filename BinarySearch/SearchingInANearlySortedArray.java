package BinarySearch;

public class SearchingInANearlySortedArray {
    public static void main(String[] args) {
        int[] arr={5,10,30,20,40};
        int target= 40;
        System.out.println(search(arr, target));

    }

    private static int search(int[] arr, int target) {
        int l= 0;
        int h=arr.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(arr[m]==target) return m;
            if(arr[m-1]==target&&m-1>=l) return m-1;
            if(arr[m+1]==target&&m+1<=h) return m+1;
            else if(target>arr[m]) l =m+2;
            else h =m-2;

        }
        return -1;
    }
}
