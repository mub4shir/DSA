package BinarySearch;

public class FindMaximumElementInBitonicArray {
    public static void main(String[] args) {
        int[] arr={1,3,8,12,4,2};
        int l=0;
        int h = arr.length-1;
        System.out.println(search(arr,l,h));
    }

    private static int search(int[] arr,int l, int h) {
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) //the maximum
                return arr[mid];
            if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) //in increasing zone
                l=mid+1;
            if(arr[mid]<arr[mid-1] && arr[mid+1]<arr[mid]) //in decreasing zone
                h=mid-1;
        }
        return arr[arr.length-1];

    }
}

//    private static int search(int[] arr,int l, int h) {
//        if(arr.length==1) return 0;
//        while(l<=h){
//            int m=l+(h-l)/2;
//            if(m>0&&m<arr.length-1){
//                if(arr[m]>arr[m-1]&&arr[m]>arr[m+1]) return arr[m];
//                else if(arr[m-1]>arr[m]) h =m-1;
//                else l=m+1;
//            }
//            else if(m==0){
//                if(arr[0]>arr[1]) return arr[0];
//                else return arr[1];
//
//            }
//            else if(m==arr.length-1){
//                if(arr[arr.length-1]>arr[arr.length-2]) return arr[arr.length-1];
//                else return arr[arr.length-2];
//            }
//        }
//        return 0;
//    }
//
//}
