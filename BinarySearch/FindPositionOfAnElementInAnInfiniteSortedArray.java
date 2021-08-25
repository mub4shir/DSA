package BinarySearch;

public class FindPositionOfAnElementInAnInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12,13,14,15};
        int target = 7;
        int l = 0;
        int h = 1;
        while (target>arr[h]) {
            l = h;
            h*=2;
        }
        System.out.println(search(arr, target, l, h));

    }

    private static int search(int[] arr, int target, int l, int h) {
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (target == arr[m]) return m;
            if (target>arr[m]) l = m + 1;
            else h = m - 1;
        }
        return -1;
    }
}
