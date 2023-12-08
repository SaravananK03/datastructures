import java.util.*;
public class Insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number element in array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enetr the element:");
            a[i]=sc.nextInt();
        }
        System.out.println("Before Sorting");
        for(int num:a){
            System.out.print(num+" ");
        }
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(a[j]>key && j>=0){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println();
        System.out.println("After Sorting");
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
