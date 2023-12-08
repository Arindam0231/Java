
import java.util.*;


class SNQ_2_QusingS
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
        Queue g = new Queue();
        
        int q = sc.nextInt();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1)
            {
                int a = sc.nextInt();
                g.enqueue(a);
            }
            else if(QueryType == 2)
            System.out.print(g.dequeue()+" ");
        q--;
        }	
        System.out.println();
            
	
	}
}


// } Driver Code Ends


class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	 if(input.empty())return -1;
	 while(!input.empty()){
	     output.push(input.pop());
	 }
	 int temp=output.pop();
	 while(!output.empty()){
	     input.push(output.pop());
	 }
	 return temp;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
        input.push(x);
    }
}

