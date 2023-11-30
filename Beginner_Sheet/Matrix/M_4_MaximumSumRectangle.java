// package Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class M_4_MaximumSumRectangle {
    static int maximum_sum_rectangle(int R,int C,int M[][]){
        int max_so_far=Integer.MIN_VALUE;
        for(int i=0;i<C;i++){
            int cur_col[]=new int[R];
            for(int j=i;j<C;j++){
                // Applying Kadane Here
                int max_ending_here=0;
                for(int k=0;k<R;k++){
                    cur_col[k]+=M[k][j];
                    max_ending_here=max_ending_here+cur_col[k];
                    max_so_far=Math.max(max_so_far,max_ending_here);
                    if(max_ending_here<0){
                        max_ending_here=0;
                    }
                }
            }
    
        }
        return max_so_far;

    }
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader((System.in)));
        int N,M;
        String S[]=read.readLine().split(" ");
        N=Integer.parseInt(S[0]);
        M=Integer.parseInt(S[1]);
        int a[][]=new int[N][M];
        for (int i=0;i<N;i++){
            String s[]=read.readLine().trim().split(" ");
            for(int j=0;j<M;j++) a[i][j] =Integer.parseInt(s[j]);
        }        
        System.out.println(maximum_sum_rectangle(N,M,a));
        
    }
}

// 4 5
// 1 2 -1 -4 -20
// -8 -3 4 2 1
// 3 8 10 1 3
// -4 -1 1 7 -6