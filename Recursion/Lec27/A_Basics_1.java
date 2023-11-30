
public class A_Basics_1{
    public static void main(String[] args) {
        System.out.println(product_of_digits(632));
    }
    static void fun(int n){
        if(n<=0){
            return;
        }
        System.out.println(n+" ");
        fun(n-1);
    }
    static void rev_fun(int n){
        if(n<=0){
            return;
        }
        rev_fun(n-1);
        System.out.println(n+" ");
    }
    static void fun_both(int n){
        if(n<=0){
            return;
        }
        System.out.println(n+" ");
        fun_both(n-1);
        System.out.println(n+" ");
    }
    static int factorial(int n){
        // System.out.println("Factorial called for "+n);
        if(n==1 || n==0){
            return 1;
        }
        int temp=factorial(n-1);
        System.out.println(temp);
        return n*temp;
    }
    static int sum_of_digits(int number){
        if(number==0)return 0;
        int temp=sum_of_digits(number/10);
        return number%10+temp;
    }
    static int product_of_digits(int number){
        if(number%10==number)return number;
        int temp=product_of_digits(number/10);
        return number%10*temp;
    }
    
}