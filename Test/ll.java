package Test;

import java.util.LinkedList;

public class ll {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 1; i < 7 ; i++) ll.add(i);
        for (int x :ll)
            System.out.print(x+"->");
        System.out.print("null");
        System.out.println();
        int size=ll.size();
        System.out.println(size);
        System.out.print("Middle element is: " );
        printMiddle(ll,size);}
    public static void printMiddle(LinkedList<Integer> ll,int size){
        System.out.println(ll.get(size/2));
    }
}
