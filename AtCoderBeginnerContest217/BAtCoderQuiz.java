package AtCoderBeginnerContest217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  BAtCoderQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        String[] contests = {"ABC", "ARC", "AGC", "AHC"};
        String one = bR.readLine();
        String two = bR.readLine();
        String three = bR.readLine();
        for (String name : contests) {
            if (!(name.equals(one) || name.equals(two) || name.equals(three))) {
                System.out.println(name);
            }
        }
    }
}