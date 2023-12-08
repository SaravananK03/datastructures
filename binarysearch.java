import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        //Binary search
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
        Arrays.sort(a);
        //int target=14;
        int result=binary(a,target);
        if(result==-1){
            System.out.print("Target value is not in a array");
        }
        else {
            System.out.println("element is found the index is:" + result);
        }

    }

    public static int binary(int[] a, int target) {
        int start=0;
        int end=a.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==target){
                return mid;
            }
            else{
                if(a[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
