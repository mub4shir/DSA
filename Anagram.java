import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Anagram {
    public static boolean checkIfAnagram(String sentence1, String sentence2 ) {
        int[] arr = new int[26];
        //int[] arr = new int [];
        for(char ch : sentence1.toCharArray())
            arr[ch - 'a']++;
        for(char ch : sentence2.toCharArray())
            arr[ch - 'a']++;

        for (int i : arr)
            if (i == 0)
                return false;
        return true;

    }

    public static void main(String[] args) {
        String s1 = "naman";
        String s2 = "manan";
        System.out.println(checkIfAnagram(s1,s2));
    }

}
