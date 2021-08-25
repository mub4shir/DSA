package Arrays;

public class Key {
    public static void main(String[] args) {
        int[] arr = {21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25};
        int k=5;
        int x=23;
        System.out.println(check(arr,k,x));

    }

    private static String check(int[] arr, int k,int x) {
        int n= arr.length;
        for(int i =0; i<n;i+=k){
            if(arr[i]==x)
                return "Yes";


        }
        return "No";
    }
}
