package BinarySearch;

public class SearchInRowWiseAndColumnWiseSortedArray {
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        int target = 29;

        System.out.println(search(arr,target));

    }

    private static boolean search(int[][] matrix,int target) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}
