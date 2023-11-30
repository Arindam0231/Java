package LinkedLists;

import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
public class LL_6_MergeSortedLL {
    Node head;

    static Node sortedMerge(Node head1, Node head2) throws NullPointerException {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node output=new Node(0);
     Node temp1=head1;
     Node temp2=head2;
     Node temp=output;
     while(temp1!=null && temp2!=null){
         if(temp1.data>temp2.data){
             temp.next=temp2;
             temp=temp.next;
             temp2=temp2.next;
             temp.next=null;
         }else{
             temp.next=temp1;
             temp=temp.next;
             temp1=temp1.next;
             temp.next=null;
         }
     }
    while(temp1!=null){
        temp.next=temp1;
        temp=temp.next;
        temp1=temp1.next;
        temp.next=null;
        
    }
    while(temp2!=null){
        temp.next=temp2;
        temp2=temp2.next;
        temp=temp.next;
        temp.next=null;
    }
    return output.next;
    
     
   } 

    public static void main(String args[])
    {
       
         Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Node head1 = new Node(sc.nextInt());
        Node tail1 = head1;
        for(int i=0; i<n1-1; i++)
        {
            tail1.next = new Node(sc.nextInt());
            tail1 = tail1.next;
        }
        Node head2 = new Node(sc.nextInt());
        Node tail2 = head2;
        for(int i=0; i<n2-1; i++)
        {
            tail2.next = new Node(sc.nextInt());
            tail2 = tail2.next;
        }
        
       
        Node head = sortedMerge(head1,head2);
        printList(head);
        sc.close();
			
	
			
      
    }

    public static void printList(Node head)
    {
        
        while (head!= null)
        {
           System.out.print(head.data+" ");
           head = head.next;
        }  
        System.out.println();
    }
}






