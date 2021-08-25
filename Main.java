import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int max=sc.nextInt();
            int min=max;
            for(int i=0;i<n-1;i++){
                int x=sc.nextInt();
                max=x>max?x:max;
                min=x<max?x:min;
            }
            System.out.println(max + " " + min);
        }
    }
}