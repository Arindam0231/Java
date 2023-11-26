import java.util.Scanner;
public class M_3_SummedMatrix {
    static long sumMatrix(long n, long q) {
        if(q<0 || q>(n*2))return 0;
        return n-Math.abs(n+1-q);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long q=sc.nextLong();
        System.out.println(sumMatrix(n, q));
        sc.close();
    }
}
