package Lec49;

import java.util.Scanner;

public class T_2_BST {
    static class BinaryTree{
        public static class Node{
            private int value;
            private Node left;
            private Node right;
            private int height;
            public Node(int value){
                this.value=value;
            }
            public int getValue() {
                return value;
            }
        }

        private Node root;
        public int height(Node node){
            if(node==null)return -1;
            return node.height;
        }
        public boolean isEmpty(){
            return root==null;
        }
        public  void display(){
            display(root,"");
        }
        private void display(Node node, String indent){
            if(node==null)return;
            System.out.println(indent+node.getValue());
            display(node.left, indent+"\t");
            display(node.right,indent+"\t");
        }
        public void prettyDisplay(){
            prettyDisplay(root,0);
        }
        private void prettyDisplay(Node node, int level){
            if (node==null)return;
            prettyDisplay(node.right,level+1);
            if(level!=0){
                for(int i=0;i<level-1;i++){
                    System.out.print("|\t\t");
                }
                System.out.println("|----------->"+node.getValue());
            }else{
                System.out.println(node.getValue());
            }
            prettyDisplay(node.left,level+1);
        }

        public void insert(int value){
            if(root==null){
                root =new Node(value);
            }
            else if(value<root.value){
                root.left=insert(value,root.left);
            }else{
                root.right=insert(value,root.right);
            }
        }
        private Node insert(int value,Node node) {
            if (node == null){
                return new Node(value);}

            else if (value<node.value ) {
                node.left = insert(value, node.left);
            }
            else if (value>node.value ) {
                node.right = insert(value, node.right);
            }
            node.height=Math.max(height(node.left) ,height(node.right));
            return node;

        }
        public void populate(int[] nums){
            for(int i:nums){
                this.insert(i);
            }
        }
        public boolean balanced(){
            return balanced(root);
        }
        private boolean balanced(Node node){
            if(node==null)return true;
            return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);

        }
        private boolean search(Node node ,int n){
            if(node==null)return false;
            if(node.value==n)return true;
            if(n<node.value){
                return  search(node.left,n);
            }
            else{
                return search(node.right,n);
            }

        }
        public boolean search(int n){
            if(root==null)return false;
            if(root.value==n)return  true;
            if(n<root.value){
                return  search(root.left,n);
            }
            else{
                return search(root.right,n);
            }
        }
    }
    public  static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        int[] arr=new int[]{50,30,20,40,70,60,80};
        tree.populate(arr);
//        tree.prettyDisplay();
        System.out.println(tree.search(110));
    }

}
