public class PrintDigitOfNumberInWords {
        public static void main(String[] args) {
            // TODO: Replace with any number
            printDigits(1024);
        }
        static String[] numInWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        static void printDigits(int N) {
            if (N == 0){
                return;
            }
            printDigits(N / 10);
            System.out.print((N < 10 ? "" : " ") + numInWords[N % 10]);
        }
    }


