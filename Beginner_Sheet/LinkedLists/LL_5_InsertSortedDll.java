package LinkedLists;
import java.util.Scanner;
class Node{
    int data;
    Node next, prev;
    Node(int item)
    {
        data = item;
        next = prev = null;
    }
}
public class LL_5_InsertSortedDll {

    public static Node sortedInsert(Node head, int x)
    {
        Node toAdd=new Node(x);
        Node temp=head;
        int n=0;
        while(temp.next!=null && temp.data<x){
            n++;
            temp=temp.next;
            
        }
        if(n==0){
            toAdd.next=head;
            head.prev=toAdd;
            head=toAdd;
            return head;
            
        }
        if(temp.next==null && temp.data<x){
            toAdd.prev=temp;
            temp.next=toAdd;
            return head;
        }
         toAdd.prev=temp.prev;
         toAdd.next=temp;
         temp.prev.next=toAdd;
         temp.prev=toAdd;
        return head;
    }
    public static boolean isChecked(Node head)
    {
        int lengthF=0;
        int lengthB=0;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            lengthF++;
        }
        
        while(temp.prev!=null)
        {
            temp=temp.prev;
            lengthB++;
        }
        
        return lengthF==lengthB? true:false;
    }
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Node head=null, tail=null;
        
        for (int i = 0;i < n;i++)
        {
            int a = sc.nextInt();
            if (head==null) 
            {
                head = new Node(a);
                tail = head;
            }
            else
            {
                tail.next=new Node(a);
                tail.next.prev=tail;
                tail = tail.next;
            }
        }
        
        int x = sc.nextInt();
            head =  sortedInsert(head, x);
            
        if(isChecked(head))
        printList(head);
        else
        System.out.print("The node has not been inserted correctly. Please fix the prev and next pointers");
        System.out.println();
        sc.close();
	    
	}
    public static void printList(Node head)
	{
	    Node temp = head;
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
	}
    

}


