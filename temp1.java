import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class temp1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc =sc.nextInt();
        while(tc-->0){
            String str=sc.next();
            int[] table = new int[256];
            for(int i=0;i<str.length();i++){
                if(table[str.charAt(i)]==0){
                    table[str.charAt(i)]=-1;
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }

    }
}