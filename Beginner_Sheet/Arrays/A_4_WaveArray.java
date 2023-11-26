package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_4_WaveArray {
    static void swap(int a[],int i,int j){
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
    }
    public static void convertToWave(int n, int[] a) {
        for(int i=1;i<a.length;i+=2){
            swap(a,i,i-1);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader((System.in)));
        int N=Integer.parseInt(read.readLine());
        int a[]=new int[N];
        String[] S=read.readLine().trim().split(" ");
        for(int i=0;i<N;i++)a[i]=Integer.parseInt(S[i]);
        convertToWave(N, a);
        for(int i=0;i<N;i++)System.out.print(a[i]+" ");
    }

}
