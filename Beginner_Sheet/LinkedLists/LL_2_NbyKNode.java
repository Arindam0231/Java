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
public class LL_2_NbyKNode {
    static Node head;
    public static int nknode(Node head, int k)
    {
       
        Node temp=head;
        int length=0;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        temp=head;
        for(int i=0;i<length/k;i++){
           temp=temp.next;
        }
        return temp.data;
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
        System.out.println(nknode(head, k));
        
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
