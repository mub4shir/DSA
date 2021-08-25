package hacker;

import java.io.*;
import java.util.*;


public class MaximumPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_nums = br.readLine().split(" ");
            int[] nums = new int[N];
            for(int i_nums = 0; i_nums < arr_nums.length; i_nums++)
            {
                nums[i_nums] = Integer.parseInt(arr_nums[i_nums]);
            }

            long out_ = MaxPairs(N, nums);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static long MaxPairs(int N, int[] nums){
        // Write your code here
        long result = 0;
        int prev = 0;

        int countSets[] = new int[32];
        for(int n: nums) {
            int leastSetBit = 0;
            // if(n == 0) prev++;
            while(n > 0) {
                if((n & 1) ==1) {
                    countSets[leastSetBit]++;
                    break;
                }
                n = n>>1;
                leastSetBit++;
            }
        }


        int i = 31;
        while(countSets[i] == 0) i--;
        for(; i >= 0; i--) {
            int pairs = prev + countSets[i];
            prev = pairs%2;
            result += ((1L<<i)*(pairs/2L));
        }
        return result;

    }
}