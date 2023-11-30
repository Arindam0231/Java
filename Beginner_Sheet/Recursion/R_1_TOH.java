//package Recursion;

import java.util.Scanner;

public class R_1_TOH {
    static long TOH(int N,int from,int to,int aux){
        if(N==1){
            System.out.println("move disk 1 from rod "+from+" to rod "+to);
            return 1;
        }
        long count=1;
        count+=TOH(N-1,from,aux,to);
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
        count+=TOH(N-1,aux,to,from);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(TOH(n,1,3,2));
    }
    
}