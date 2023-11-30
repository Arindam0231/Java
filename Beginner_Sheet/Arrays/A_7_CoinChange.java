package Arrays.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

    public class A_7_CoinChange {
        static long count_dp(int coins[],int sum,int N,long dp[][]){
            if(sum==0){
                return dp[N][sum]=1;
            }
            if(N==0 || sum <0){
                return 0;
            }
            if(dp[N][sum]!=-1)return dp[N][sum];
            return dp[N][sum]=count_dp(coins, sum-coins[N-1], N, dp)+count_dp(coins, sum, N-1, dp);
        }
        static long count(int coins[], int N, int sum) {
            long[][] dp = new long[N + 1][sum + 1];
            for (long[] row : dp)
                    Arrays.fill(row, -1);
            long res = count_dp(coins, sum, N, dp);
            return res;
        }
        public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader((System.in)));
        String[] comm=read.readLine().trim().split(" ");
        int sum=Integer.parseInt(comm[0]);
        int N=Integer.parseInt(comm[1]);
        int a[]=new int[N];
        String[] S=read.readLine().trim().split(" ");
        for(int i=0;i<N;i++)a[i]=Integer.parseInt(S[i]);

        System.out.println(count(a,N,sum));
        
    }
}
