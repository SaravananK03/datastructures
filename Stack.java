import java.util.*;
public class Stack{
    public static void main(String[] args) {
        stackmethod s=new stackmethod();
        s.push(3);
        s.push(6);
        s.push(9);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.show();

    }
}
public class Stackmethod{
    int[] a=new int[5];
    int top=0;
    public void push(int data) {
        a[top]=data;
        top++;
    }
    public int pop(){
        int data;
        top--;
        data=a[top];
        a[top]=0;
        return data;
    }
    public int peek(){
        int data=a[top-1];
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }
    public void show(){
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
