public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr={0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;
        while (i+1 < N && A[i] < A[i+1])
            i++;
        if (i == 0 || i == N-1)
            return false;
        while (i+1 < N && A[i] > A[i+1])
            i++;
        return i == N-1;
    }



//    class Solution {
//        public boolean validMountainArray(int[] arr) {
//            int peak = 0, left = 0, right = 0;
//            while((peak < arr.length-1) && (arr[peak] < arr[peak+1])){
//                peak++;
//                left++;
//            };
//            while((peak < arr.length-1) && (arr[peak] > arr[peak+1])){
//                peak++;
//                right++;
//            };
//            return (left * right > 0) && (peak == arr.length-1);
//
//        }
//    }
}
