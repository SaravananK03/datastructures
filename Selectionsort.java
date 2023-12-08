import java.util.*;
public class Selectionsort{
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
        int temp=0;
        int min=0;
        for(int i=0;i<a.length-1;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        System.out.println();
        System.out.println("After Sorting");
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
