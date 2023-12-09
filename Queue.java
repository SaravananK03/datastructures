import java.util.*;
//main class
public class Queue{
    public static void main(String[] args) {
        queue q=new queue();
        q.enQueue(3);
        q.enQueue(6);
        q.enQueue(9);
        q.enQueue(12);
        q.enQueue(15);
        q.deQueue();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.show();

    }
}
//queue class and also it is circular queue
public class queue {
    int size;
    int front;
    int rear;
    int[] a=new int[5];
    public void enQueue(int data){
        if(!isFull()) {
            a[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        }
        else{
            System.out.print("Queue is full");
        }
    }
    public int deQueue(){
        int data=0;
        if(isEmpty()) {
            System.out.print("Queue is empty");
        }
        else {
            data = a[front];
            front = (front + 1) % 5;
            size--;
        }
        return data;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size>=5;
    }
    public int sizeOf(){
        return size;
    }
    public void show(){
        System.out.print("Elements : ");
        for(int i=0;i<size;i++){
            System.out.print(a[(front+i)%5]+" ");
        }
    }
}
