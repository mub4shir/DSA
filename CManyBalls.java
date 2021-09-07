import java.io.*;
public class CManyBalls  {
    public static void main(String[] args)throws Exception
    {
        BufferedReader bR=new BufferedReader(new InputStreamReader(System.in));
        long N=Long.parseLong(bR.readLine());
        StringBuilder s=new StringBuilder();
        while(N>0) {
            if(N%2==0) {
                s.append("B");
                N=N/2;
            }
            else {
                s.append("A");
                N=N-1;
            }
        }
        System.out.println(s.reverse());
    }}

