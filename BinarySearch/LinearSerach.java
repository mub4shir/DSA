package BinarySearch;

public class LinearSerach {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        int n =7;
        System.out.println(lS(arr,n));
    }

    private static int lS(int[] arr, int n) {
        int pos=0;
        for (int x :arr) {
            pos++;
            if(x==n)
                return pos-1;
        }
        return -1;
    }

    }


