package Lec49;

import java.util.Scanner;

public class T_2_BST {
    public  static void main(String[] args){
        BST tree=new BST();
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,20};
        tree.populateSorted(arr);
//        tree.display();
//        System.out.println(tree.search(110));
//        System.out.println(tree.balanced());
        tree.prettyDisplay();
        tree.preOrder();
        tree.inOrder();
        tree.postOrder();
    }

}
