package LinkedLists;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int key){
        data=key;
        next=null;
    }
}
public class LL_4_DeleteKth {
    static Node head;
    public static Node deleteNode(Node head, int k)
    {
       if (k==1)return head.next;
       Node temp=head;
       for(int i=1;i<k-1;i++){
        temp=temp.next;
       }
       temp.next=temp.next.next;
       return head;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        addToTheLast(head);
        for(int i = 1; i < n; i++)
        {
            int a = sc.nextInt();
            addToTheLast(new Node(a));
        }
        int k = sc.nextInt();   
       
        Node result=deleteNode(head,k);
        while(result!=null){
            System.out.print(result.data+" ");
            result=result.next;
        }
        
        sc.close();
    }
    
    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
                temp.next = node;
        }
    }
}
