package BinarySearch;

public class CeilOfAnElementInASortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,10,10,12,19};
        int target=10;
        System.out.println(search(arr,target));
    }

    private static int search(int[] arr, int target) {
        int l=0;
        int h=arr.length-1;
        int res=0;
        while (l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==target) return arr[m];
            if(arr[m]>target) {
                res =arr[m];
                h = m - 1;
            }
            else l =m+1;

        }
        return res;
    }
}
