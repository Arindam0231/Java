import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M_2_Rotate90 {
    static void swap(int matrix[][],int from_x,int from_y,int to_x,int to_y){
        int temp=matrix[from_x][from_y];
        matrix[from_x][from_y]=matrix[to_x][to_y];
        matrix[to_x][to_y]=temp;
    }
    static void rotateby90(int matrix[][], int n) 
    { 
        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                swap(matrix,i,j,j,n-i-1);
            }
        }
        for(int i=1;i<n-1;i++){
            int value=Math.min(i,n-i-1);
            for(int j=0;j<value;j++){
                swap(matrix,i,j,n-j-1,i);
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
        rotateby90(a,N);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");

        }
    }
}
