package BinarySearch;

public class SearchAnElementInBitonicArray {
    public static void main(String[] args) {
        int[] arr= {1,3,8,12,4,2};
        int target=2;
        int l=0;
        int h= arr.length-1;
        int idx =searchPeakElementIndex(arr,l,h);
        int x=searchIn(arr,l,idx-1,target);
        System.out.println( x!=-1? x : searchDe(arr,idx,h,target));

    }

    private static int searchIn(int[] arr, int l, int h, int target) {
        while(l<=h){
            int m=l+(h-l)/2;
            if(target==arr[m]) return m;
            else if(target>arr[m])l=m+1;
            else h=m-1;
        }
        return -1;
    }
    private static int searchDe(int[] arr, int l, int h, int target) {
        while(l<=h){
            int m=l+(h-l)/2;
            if(target==arr[m]) return m;
            else if(target>arr[m]) h=m-1;
            else l=m+1;
        }
        return -1;
    }

    private static int searchPeakElementIndex(int[] arr,int l, int h) {
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) //the maximum
                return mid;
            if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) //in increasing zone
                l=mid+1;
            if(arr[mid]<arr[mid-1] && arr[mid+1]<arr[mid]) //in decreasing zone
                h=mid-1;
        }
        return arr.length-1;

    }

}
