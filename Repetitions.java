import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        int count =0;
        int maxCount=0;
        for (char ch:s.toCharArray()) {
//            count =0;
//            if(ch == 'A' ) {
//                count++;
//                maxCount = Math.max(count, maxCount);
//            }
//            if(ch == 'C') {
//                count++;
//                maxCount = Math.max(count, maxCount);
//            }
            if(ch == 'G') //{
                count++;
//            }
//            if(ch == 'T') {
//                count++;
//                maxCount = Math.max(count, maxCount);
//            }
        }
        System.out.println(count);
    }
}