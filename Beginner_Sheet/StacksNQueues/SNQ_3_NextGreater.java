//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class SNQ_3_NextGreater{
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        long[] res = new Solution().nextLargerElement(arr, n);
        for (int i = 0; i < n; i++) 
            System.out.print(res[i] + " ");
        System.out.println();
	}
}




// } Driver Code Ends




class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Stack<Long>  maximum=new Stack<>();
        // long[] ans=new long[n];
        // for(int i=n-1;i>=0;i--){
        //     while(!maximum.empty() && maximum.peek()<arr[i]){
        //         maximum.pop();
        //     }
            
        //     if(maximum.empty()) ans[i]=-1;
        //     else ans[i]=maximum.peek();
        //     maximum.push(arr[i]);
            
        // }
        // return ans;
        Stack<Integer>  maximum=new Stack<>();
        long[] ans=new long[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            while(!maximum.empty() && arr[maximum.peek()]<arr[i]){
                ans[maximum.pop()]=arr[i];
            }
        
            maximum.push(i);
            
        }
        return ans;
        
        
    } 
}