public class ReverseString {
    static String reverseString(String s){
        int n = s.length();
        char[] a =s.toCharArray();
        for (int i = 0; i < n/2; i++) {
            char temp = a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        return new String(a);
    }
    public static void main(String[] args) {
        System.out.println(reverseString("helloworld"));
    }
}
