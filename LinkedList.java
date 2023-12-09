import java.util.*;
//Node class
public class Node {
    int data;
    Node next;
}

//main class
public class LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three Data:");
        int data=sc.nextInt();
        int data2=sc.nextInt();
        int data3=sc.nextInt();
        Linklist list=new Linklist();
        list.insert(data);
        list.insert(data2);
        list.insert(data3);
        list.show();

    }
}

//link class
public class Linklist {
    Node head;
    public void insert(int data){
        Node node=new Node();
        node.data=data;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next !=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show(){
        Node node=head;
        while(node.next !=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}
