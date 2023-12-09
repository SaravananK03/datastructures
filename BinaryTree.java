import java.util.*;
//main class
public class Main {
    public static void main(String[] args){
        Binary tree=new Binary();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        System.out.println("Inorder");
        tree.inOrder();
        System.out.println();
        System.out.println("Preorder");
        tree.preOrder();
        System.out.println();
        System.out.println("postorder");
        tree.postOrder();
    }
}
//node class
class Node {
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data=data;
    }
}
//tree class
public class Binary{
    Node root;
    public void insert(int data){
        root=insertrec(root,data);
    }

    public Node insertrec(Node root,int data) {
        if(root==null){
            root=new Node(data);
        }
        else if(data<root.data){
            root.left=insertrec(root.left,data);
        }
        else if(data> root.data){
            root.right=insertrec(root.right,data);
        }
        return root;
    }
    public void inOrder(){
        inOrderrec(root);
    }

    public void inOrderrec(Node root){
        if(root !=null){
            inOrderrec(root.left);
            System.out.print(root.data+" ");
            inOrderrec(root.right);
        }
    }
    public void preOrder(){
        preOrderrec(root);
    }

    public void preOrderrec(Node root){
        if(root !=null){
            System.out.print(root.data+" ");
            preOrderrec(root.left);
            preOrderrec(root.right);
        }
    }
    public void postOrder(){
        postOrderrec(root);
    }

    public void postOrderrec(Node root){
        if(root !=null){
            postOrderrec(root.left);
            postOrderrec(root.right);
            System.out.print(root.data+" ");
        }
    }
}
