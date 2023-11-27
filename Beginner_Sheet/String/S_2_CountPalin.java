import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2_CountPalin {
    static public int CountPS(String S, int N)
    {
        int count_palin=0;
        for(int i=0;i<N;i++){
            int l=i,r=i;
            while( (l>=0 && r<N) && S.charAt(l)==S.charAt(r)){
                if(l!=r)count_palin++;
                l--;r++;
            }
            l=i;r=i+1;
            while ((l>=0 && r<N) &&  S.charAt(l)==S.charAt(r)){
                count_palin++;
                l--;r++;
            }
        }
        return count_palin;
    }
   
    public static void main(String[] args) throws IOException{
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(read.readLine());
        String str=read.readLine();
        System.out.println(CountPS(str, N));
    }
    
}