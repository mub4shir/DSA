package BinarySearch;

public class NextAlphabeticalElement {
    public static void main(String[] args) {
        char[] arr={'a','c','f','h'};
        char target='f';
        System.out.println(search(arr,target));
    }

    private static char search(char[] arr, char target) {
        int l=0;
        int h=arr.length-1;
        char res='#';
        while (l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==target) l = m+1;
            if(arr[m]>target) {
                res =arr[m];
                h = m - 1;
            }
            else l =m+1;

        }
        return res;
    }
}
