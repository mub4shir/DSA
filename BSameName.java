import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BSameName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set=new HashSet<>();
        sc.nextLine();

        for (int i = 1; i <=n; i++) {
            String s= sc.nextLine();
            set.add(s);
        }
        System.out.println(set.size()==n?"No":"Yes");
    }
}
