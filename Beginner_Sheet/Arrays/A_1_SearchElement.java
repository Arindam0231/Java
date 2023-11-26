package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_1_SearchElement {
    static int search(int arr[], int N, int X)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==X)return i;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader((System.in)));
        int N=Integer.parseInt(read.readLine());
        int a[]=new int[N];
        String[] S=read.readLine().trim().split(" ");
        for(int i=0;i<N;i++)a[i]=Integer.parseInt(S[i]);
        int X=Integer.parseInt(read.readLine());
        System.out.println(search(a, N, X));
    }
}
