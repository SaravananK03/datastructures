import java.util.*;
//main class
public class DynamicStack{
    public static void main(String[] args) {
        Dynamic s=new Dynamic();
        s.push(3);
        s.push(6);
        s.push(9);
        s.push(12);
        s.push(15);
        s.push(18);
        s.pop();
        s.pop();
        s.show();

    }
}
//dynamic class
public class Dynamic {
    int cap=2;
    int[] a=new int[cap];
    int top=0;
    public void push(int data) {
        if(size()==cap){
            expand();
        }
        a[top]=data;
        top++;
    }

    public void expand(){
        int length=size();
        int[] aa=new int[cap*2];
        System.arraycopy(a,0,aa,0,length);
        a=aa;
        cap*=2;
    }

    public int pop(){
        int data=0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            top--;
            data = a[top];
            a[top] = 0;
            shrink();
        }
        return data;
    }

    public void shrink() {
        int length=size();
        if(length<=(cap/2)/2){
            cap/=2;
        }
        int[] aa=new int[cap*2];
        System.arraycopy(a,0,aa,0,length);
        a=aa;
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
