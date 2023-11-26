import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M_1_Transpose {
    static void transpose(int n,int a[][])
    {
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j){
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
    }
     public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader((System.in)));
        int N=Integer.parseInt(read.readLine().split(" ")[0]);
        int a[][]=new int[N][N];
        for (int i=0;i<N;i++){
            String s[]=read.readLine().trim().split(" ");
            for(int j=0;j<N;j++) a[i][j] =Integer.parseInt(s[j]);
        }        
        transpose(N,a);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");

        }
        
    }
}
