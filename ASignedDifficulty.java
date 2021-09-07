import java.util.Scanner;

public class ASignedDifficulty {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float xy =sc.nextFloat();
        int x= (int)xy;
        float y = xy*10;
        y%=10;
        if(y>=0&&y<=2)
            System.out.println(x+"-");
        else if(y>=3&&y<=6)
            System.out.println(x);
        else if(y>=7&&y<=9)
            System.out.println(x+"+");
    }
}
