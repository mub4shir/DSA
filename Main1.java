public class Main1 {
    public static int[] implementMergeSort(int arr[], int start, int end){
        if(start<end){
            int m = (start+end)/2;
            implementMergeSort(arr,start,m);
            implementMergeSort(arr,m+1,end);
            merge1(arr,start,m,end);
        }
        return arr;
    }
    public static void merge1(int[] arr,int s, int m, int e){
        int l1 = m-s+1;
        int l2 = e-m;
        int[] left = new int[l1];
        int[] right = new int[l2];
        for (int i = 0;i<l1;i++){
            left[i] = arr[s+i];

        }
        for (int j = 0; j<l2;j++){
            right[j] = arr[m+1+j];
        }
        int i = 0, j = 0, k = s;
        while (i<l1 && j<l2){
            if (left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while (i<l1){
            arr[k++] = left[i++];
        }
        while (j<l2){
            arr[k++] = right[j++];
        }
    }
}
