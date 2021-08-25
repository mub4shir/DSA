package BinarySearch;

public class AllocateMinimumNumberOfPages {
    static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int x :arr)
            max=Math.max(x,max);
        return max;
    }
    static int sum(int[] arr){
        int sum=0;
        for (int x: arr)
            sum+=x;
        return sum;
    }
    private static boolean isValid(int[] arr, int n, int k,int currMin) {
        int studentsRequired = 1;
        int currSum=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]> currMin) return false;
            if(currSum+arr[i]>currMin){
                studentsRequired++;
                currSum=arr[i];
                if(studentsRequired>k) return false;
            }
            else
                currSum +=arr[i];
        }
        return true;
    }
    private static int minPages(int[] arr, int n, int k) {
        if(n<k) return -1;
        int start = max(arr);
        int end = sum(arr);
        int res =-1;
        while (start<=end){
            int mid = start +(end - start)/2;
            if(isValid(arr,n,k,mid)){
                res=mid;
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return res;
    }



    public static void main(String[] args) {

        int[] arr={12, 34, 67, 90};
        int k =2;
        int n = arr.length;
        System.out.println(max(arr));
        System.out.println(sum(arr));
        System.out.println(minPages(arr,n,k));

    }




}
