package Bits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1_CheckBitSet {
    static boolean checkKthBit(int n, int k)
    {
        int rem=0;
        for(int i=0;i<=k;i++){
            rem=n%2;
            n/=2;
        }
        if(rem==0)return false;
        return true;
    } 
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        String[] comm=read.readLine().trim().split(" ");
        int n=Integer.parseInt(comm[0]);
        int k=Integer.parseInt(comm[1]);
        System.out.println(checkKthBit(n, k));
    }

    

}
