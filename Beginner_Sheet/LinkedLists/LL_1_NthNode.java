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
public class LL_1_NthNode {
    static Node head;
    public static int getNth(Node node, int ind)
    {
       
       Node temp=node;
       int pos=1;
       while(temp.next!=null && pos!=ind){
           temp=temp.next;pos++;
       }
       if(pos!=ind){
           return -1;
       }
       return temp.data;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
              
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        addToTheLast(head);
        for(int i = 1; i < n; i++)
        {
            int a = sc.nextInt();
            addToTheLast(new Node(a));
        }
        
        System.out.println(getNth(head, k));
        
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


