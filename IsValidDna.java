public class IsValidDna {
    public static void main(String[] args) {
        System.out.println(isvalidDna("ATCGATCGGGGG"));
    }

    private static boolean isvalidDna(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c !='A' && c !='T' && c!='C' && c!='G')
                return false;


        }
        return true;
    }
}
