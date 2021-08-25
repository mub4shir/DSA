package Strings;

public class FirstUniqueChar {
    static final int NO_Of_CHARS =256;
    static char[] count = new char[NO_Of_CHARS];
    static void getCharCountArray(String str){
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }
    static int firstNonRepeating(String str){
        getCharCountArray(str);
        int index = -1, i;
        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        String s = "aabbcdddedfgggh";
        int index=firstNonRepeating(s);
        System.out.println(index == -1
                        ? "Either all characters are repeating or string "
                        + "is empty"
                        : "First non-repeating character is "
                        + s.charAt(index));
    }
}
