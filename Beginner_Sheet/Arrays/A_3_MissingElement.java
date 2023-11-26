package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_3_MissingElement {
    static int missingNumber(int array[], int n) {
        int sum=0;
        for(int val:array){
            sum+=val;
        }
        int normal_sum=(n*(n+1))/2;
        return (normal_sum-sum);
     }
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader((System.in)));
        int N=Integer.parseInt(read.readLine());
        int a[]=new int[N-1];
        String[] S=read.readLine().trim().split(" ");
        for(int i=0;i<N-1;i++)a[i]=Integer.parseInt(S[i]);
        System.out.println(missingNumber(a, N));
    }
}

