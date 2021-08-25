package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hi My name is Andrei";
        //String[] a = s.split(" ");
        char[] arr = s.toCharArray();
        char[] backward = new char[s.length()];
        ArrayList<Character> list = new ArrayList<>();
        for (int i = s.length()-1; i >=0 ; i--) {
          list.add(arr[i]);
        }

        for (Character ch: list) {
            System.out.print(ch);

        }
        System.out.println();
        int n =arr.length;
        for (char ch:arr)
            System.out.print(ch);
        System.out.println();
        System.out.println(reverse(arr,n));
    }

    private static String reverse(char[] arr, int n) {
        for(int i=0; i<n/2; i++){
            char temp =arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;

        }
        return Arrays.toString(arr);
    }

}
