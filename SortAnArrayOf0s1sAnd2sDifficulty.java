import java.util.*;

public class SortAnArrayOf0s1sAnd2sDifficulty {
    public static void main(String[] args) {
        int[] arr={ 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sortArray(arr);
    }

    private static void sortArray(int[] arr) {
        int i;
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for ( i=0; i<arr.length;i++) {
            switch (arr[i]){
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        i=0;
        while(cnt0-->0)
            arr[i++] = 0;
        while(cnt1-->0)
            arr[i++] = 1;
        while(cnt2-->0)
            arr[i++] = 2;
        for (i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");

        }
    }

}
