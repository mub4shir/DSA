package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr={5,10,20,15};
        int l =0;
        int h= arr.length-1;
        System.out.println(search(arr,l,h));
    }

    private static int search(int[] arr, int l, int h) {
        if(arr.length==1) return 0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(m>0&&m<arr.length-1){
                if(arr[m]>arr[m-1]&&arr[m]>arr[m+1]) return m;
                else if(arr[m-1]>arr[m]) h =m-1;
                else l=m+1;
            }
            else if(m==0){
                if(arr[0]>arr[1]) return 0;
                else return 1;

            }
            else if(m==arr.length-1){
                if(arr[arr.length-1]>arr[arr.length-2]) return arr.length-1;
                else return arr.length-2;
            }
        }
        return -1;
    }


}
