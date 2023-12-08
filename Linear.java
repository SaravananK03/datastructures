import java.util.*;
public class Linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number element in array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enetr the element:");
            a[i]=sc.nextInt();
        }
        //int[] a={4,6,78,2,14,87};
        System.out.println("Enter the target value:");
        int target=sc.nextInt();
        //Linear Search
        int result=linear(a,target);
        System.out.print(result!=-1?"Element is found the index is:"+result:"Element is not in the array");

    }

    public static int linear(int[] a, int target) {
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
}
