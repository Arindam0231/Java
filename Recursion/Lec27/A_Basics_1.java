
public class A_Basics_1{
    public static void main(String[] args) {
        System.out.println(reverseIterative(1236));
    }
    static int reverseIterative(int number){
        int output=0;
        int count=0;
        while(number!=0){
            int digit=number%10;
            output+=(Math.pow(10,count)*digit);
            number=number/10;
            System.out.println(digit);
            count++;
        }
        return output;
    }
    
}