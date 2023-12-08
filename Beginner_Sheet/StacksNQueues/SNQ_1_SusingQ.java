import java.util.*;


class SNQ_1_SusingQ
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		Queues g = new Queues();
        
        int q = sc.nextInt();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1)
            {
                int a = sc.nextInt();
                g.push(a);
            }
            else if(QueryType == 2)
            System.out.print(g.pop()+" ");
        q--;
        }	
        System.out.println();
				
			
			
	
	}
}


// } Driver Code Ends



class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    q1.offer(a);
    }
    
    //Function to pop an element from stack using two queues. 
    void reverse_push(Queue<Integer> from,Queue<Integer> to){
        if(from.peek()==null)return;
        int data=from.poll();
        reverse_push(from,to);
        to.offer(data);
    }
    int pop()
    {  
        if(q1.peek()==null){
            return -1;
        }
	   reverse_push(q1,q2);
	   int data=q2.poll();
	   reverse_push(q2,q1);
	   return data;
    }
	
}

