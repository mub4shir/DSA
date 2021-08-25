package BinarySearch;

public class FindAnElementInARotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {6,7,8,1,2,3,4,5};
        int t =5;
        System.out.println(findAnElementInARotatedSortedArray(arr,t));
    }

    private static int findAnElementInARotatedSortedArray(int[] arr, int t) {
        int idx = findIndexOfMinElement(arr);
        System.out.println("index: "+ idx);
        if (bS(arr,0, idx-1, t)>=0)
            return bS(arr,0, idx-1, t);
        return bS(arr,idx, arr.length-1,t);
    }

    private static int findIndexOfMinElement(int[] arr) {
        int n= arr.length;
        if(arr[0]<arr[n-1])
            return 0;
        int l=0;
        int h=n-1;
        int pivot=-1;
        while(l<=h){
            if(arr[l]<arr[h]) return l;
            int m = l+(h-l)/2;
            int next = (m+1)%n;
            int prev = (m-1+n)%n;
            if(arr[m]<=arr[prev]&&arr[m]<=arr[next]) { pivot = m; break;}
            if (arr[l] <= arr[m]) l = m + 1;
            else if (arr[m] <= arr[h]) h = m - 1;
        }
        return pivot;
    }
    private static int bS(int[] arr, int l, int h, int t){
        while(l<=h){
            int m = l + (h-l)/2;
            if(arr[m]==t) return m;
            if(t<arr[m]) h=m-1;
            else l=m+1;
        }
        return -1;
    }

}
