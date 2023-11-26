package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A_6_MaximumSubArray {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> output=new ArrayList<>();
        return output;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader((System.in)));
        String[] comm=read.readLine().trim().split(" ");
        int N=Integer.parseInt(comm[0]);
        int K=Integer.parseInt(comm[1]);
        int a[]=new int[N];
        String[] S=read.readLine().trim().split(" ");
        for(int i=0;i<N;i++)a[i]=Integer.parseInt(S[i]);

        System.out.println(max_of_subarrays(a, N, K));
        
    }
}
