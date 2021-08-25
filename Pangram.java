import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pangram {


    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyzssssssghjjjjjjjjjjjksx";
        //System.out.println(s.length());
        System.out.println(checkIfpangram(s));

    }

    private static boolean checkIfpangram(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch :s.toCharArray())
            set.add(ch);
        return set.size()==26;
    }
}
