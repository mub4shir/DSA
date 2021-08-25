package Hashing2;

import java.util.HashMap;
import java.util.Set;

public class MaxFreChar {
    public static void main(String[] args)  {
        String s = "abcdsssssssssss";
        System.out.println(s.length());
        System.out.println(maxFreqChar(s));
    }
    private static char maxFreqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        //store the frequency of all the characters in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int val = map.get(ch);
                map.put(ch, val+1);
            }else
                map.put(ch,1);
        }
        //the keyset function basically gives you all the keys present in the
        //hashmap and store it in a set.
        Set<Character> keyset =map.keySet();
        int maxFreq =Integer.MIN_VALUE;
        char maxChar=' ';
        for (char key:keyset) {
            if(map.get(key)>maxFreq){
                maxFreq=map.get(key);
                maxChar=key;
            }
        }
        System.out.println(maxFreq);
        return maxChar;
    }

}

