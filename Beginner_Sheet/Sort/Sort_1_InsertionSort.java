// package Beginner_Sheet.Sort;

import java.util.Scanner;

/**
 * Sort_1_InsertionSort
 */
public class Sort_1_InsertionSort {
    static void insertion_sort(int a[],int n){
        if(n==1)return;
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i;
            while(j>0 && temp<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
    }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        insertion_sort(a,n);
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");;
        sc.close();
    }
}