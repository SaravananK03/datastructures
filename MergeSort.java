import java.util.*;
public class MergeSort {
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
        mergesort(a,0,a.length-1);
        System.out.println();
        System.out.println("After Sorting");
        for(int num:a){
            System.out.print(num+" ");
        }
    }

    public static void mergesort(int[] a, int l, int r) {
        if(l<r){
            int mid=(l+r)/2;
            mergesort(a,l,mid);
            mergesort(a,mid+1,r);
            merged(a,l,mid,r);
        }


    }

    public static void merged(int[] a, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;
        int[] al=new int[n1];
        int[] ar=new int[n2];
        for(int i=0;i<n1;i++){
            al[i]=a[l+i];
        }
        for(int i=0;i<n2;i++){
            ar[i]=a[mid+1+i];
        }
        int x=0,y=0,k=l;
        while(x<n1 && y<n2){
            if(al[x]<ar[y]){
                a[k]=al[x];
                x++;
            }
            else{
                a[k]=ar[y];
                y++;
            }
            k++;
        }
        while(x<n1){
            a[k]=al[x];
            x++;
            k++;
        }
        while(y<n2){
            a[k]=ar[y];
            y++;
            k++;
        }
    }
}
