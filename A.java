import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sa = br.readLine().split("\\.");
        int x = Integer.parseInt(sa[0]);
        int y = Integer.parseInt(sa[1]);
        br.close();

        if (y <= 2) {
            System.out.println(x + "-");
        } else if (y <= 6) {
            System.out.println(x);
        } else {
            System.out.println(x + "+");
        }
    }
}
