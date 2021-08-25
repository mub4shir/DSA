import java.util.Scanner;
class SalesByMatch  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] colors=new int[101];
        for(int i=0;i<n;i++)
            colors[sc.nextInt()]++;
        int total=0;
        for(int i=0;i<101;i++)
            total+=colors[i]/2;
        System.out.print(total);
    }
}
