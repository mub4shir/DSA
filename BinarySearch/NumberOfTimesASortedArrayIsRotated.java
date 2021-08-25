package BinarySearch;

public class NumberOfTimesASortedArrayIsRotated {
    public static void main(String[] args) {
        int[] arr = {11, 12, 15, 18, 2, 5, 6, 8};
        System.out.println(rotationCount(arr));
    }

    private static int rotationCount(int[] arr) {
        int n = arr.length;
        if(arr[0]<arr[n-1])
            return 0;
        int pivot = -1;
        int l = 0, h = n - 1;
        while (l <= h) {
            if (arr[l] <= arr[h])
                return l;
            int m = l + (h - l) / 2;
            int next = (m + 1) % n;
            int prev = (m - 1 + n) % n;
            if (arr[m] <= arr[next] && arr[m] <= arr[prev]) {
                pivot = m;
             }
            if (arr[l] <= arr[m]) l = m + 1;
            else if (arr[m] <= arr[h]) h = m - 1;
        }
        return pivot;
    }
}
