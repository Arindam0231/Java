package Arrays.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_5_BitonicPoint {
    static int findMaximum(int[] arr, int n) {
        if(arr[n-1]>arr[n-2])return arr[n-1];
        int low=0,right=n-1;
        while(low<=right){
            if(arr[low]>arr[low+1]){
                return arr[low];
            }
             if(arr[right]>arr[right-1]){
                 return arr[right];
             }
             low++;right--;
        }
        return -1;
     }
     public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader((System.in)));
        int N=Integer.parseInt(read.readLine());
        int a[]=new int[N];
        String[] S=read.readLine().trim().split(" ");
        for(int i=0;i<N;i++)a[i]=Integer.parseInt(S[i]);
        System.out.println(findMaximum(a,N));
        
    }
}
