import java.util.*;
public class Quicksort {
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
        quick(a,0,a.length-1);
        System.out.println();
        System.out.println("After Sorting");
        for(int num:a){
            System.out.print(num+" ");
        }
    }

    public static void quick(int[] a, int low,int high) {
        if(low<high){
            int pi=partion(a,low,high);
            quick(a,low,pi-1);
            quick(a,pi+1,high);

        }
    }

    public static int partion(int[] a, int low, int high) {
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        int t=a[i+1];
        a[i+1]=a[high];
        a[high]=t;
        return i+1;
    }
}
