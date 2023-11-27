package LinkedLists;
import java.util.Scanner;

public class LL_3_Reverse {
    static class Node{
        int data;
        Node next;
        Node(int key){
            data=key;
            next=null;
        }
    }
    static Node head;
    public static  Node recurse(Node head){
        if(head.next==null){
            return  head;
        }
        Node temp=recurse(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
    public static Node reverse(Node head)
    {
    //    Node prev=null;
    //    Node curr=head;
    //    Node next=null;
    //    while(curr!=null){
    //         next=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next;
    //    }
    //    return prev;
        return recurse(head);
        
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
 
        Node result=reverse(head);
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
