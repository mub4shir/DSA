
import java.lang.*;
        import java.util.*;

public class ColumnWiseSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] arr=new int[n][m];
        int[] res=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                arr[i][j]=sc.nextInt();
        }

        for(int j=0;j<m;j++) {
            for (int i = 0; i < n; i++)
                res[j] += arr[i][j];
        }
        for(int x: res)
            System.out.print(x+" ");



    }
}