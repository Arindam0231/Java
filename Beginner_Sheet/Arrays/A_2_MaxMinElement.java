package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_2_MaxMinElement {
    static class Pair  
    {  
        long first, second;  
        public Pair(long first, long second)  
        {  
            this.first = first;  
            this.second = second;  
        }  
    }
    static Pair getMinMax(long a[], long n)  
    {
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(long i:a){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        return new Pair(min,max);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader((System.in)));
        String N=read.readLine();
        long a[]=new long[Integer.parseInt(N)];
        String[] S=read.readLine().trim().split(" ");
        for(int i=0;i<Integer.parseInt(N);i++)a[i]=Long.parseLong(S[i]);
        Pair answer=getMinMax(a, Long.parseLong(N));
        System.out.println(answer.first+" "+answer.second);
    }
}

