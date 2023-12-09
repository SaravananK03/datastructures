import java.util.*;
//Node class
public class Node {
    int data;
    Node next;
}

//main class
public class LinkedList {
    public static void main(String[] args) {
        Linklist list=new Linklist();
        list.insert(3);
        list.insert(9);
        list.insert(10);
        list.insert(12);
        list.insertAt(1);
        list.insertindex(6,2);
        list.deleteAt(2);
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
    public void insertAt(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }
    public void insertindex(int data,int index){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(index==0){
            insertAt(node.data);
        }
        else {
            Node n = head;
            for (int i=0;i<index-1;i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void deleteAt(int index){
        if(index==0){
            head=head.next;
        }
        else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
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
