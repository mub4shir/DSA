import java.lang.*;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arraylist=new ArrayList<Integer>();
        while(true){
            int a=sc.nextInt();
            sc.nextLine();
            if(a<0) break;
            arraylist.add(a);
        }
        sc.close();
        for(int i=arraylist.size()-1; i>=0;i--)
            System.out.print(arraylist.get(i)+" ");
    }
}