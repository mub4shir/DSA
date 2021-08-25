package hacker;

import java.io.*;
import java.util.*;


public class array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            int Q = Integer.parseInt(br.readLine().trim());
            int[][] P = new int[Q][3];
            for(int i_P = 0; i_P < Q; i_P++)
            {
                String[] arr_P = br.readLine().split(" ");
                for(int j_P = 0; j_P < arr_P.length; j_P++)
                {
                    P[i_P][j_P] = Integer.parseInt(arr_P[j_P]);
                }
            }

            int[] out_ = query_game(N, A, Q, P);
            System.out.print(out_[0]);
            for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
            {
                System.out.print(" " + out_[i_out_]);
            }

            System.out.println();

        }

        wr.close();
        br.close();
    }
    static int[] query_game(int N, int[] A, int Q, int[][] P){
        // Write your code here
        List<Integer> result = new ArrayList();
        boolean isReversed = false;

        for(int[] query: P) {
            switch (query[0]) {
                case 1 -> isReversed = !isReversed;
                case 2 -> {
                    int i = isReversed ? (N - query[1]) : (query[1] - 1);
                    int j = isReversed ? (N - query[2]) : (query[2] - 1);
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
                case 3 -> {
                    int index = 0;
                    for (int k = 0; k < N; k++) {
                        if (A[k] == query[1]) {
                            index = k;
                            break;
                        }
                    }
                    result.add(isReversed ? (N - index) : (index + 1));
                }
            }
        }

        int[] res = new int[result.size()];
        for(int i =0; i<res.length;i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}