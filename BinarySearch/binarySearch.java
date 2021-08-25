package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int t = 7;
        System.out.println(search(arr, t));
    }
    private static int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }
}

