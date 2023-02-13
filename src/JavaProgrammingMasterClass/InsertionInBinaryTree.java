package JavaProgrammingMasterClass;

import sun.tools.tree.NewArrayExpression;

import java.sql.Statement;
import java.util.LinkedList;
import java.util.Queue;

public class InsertionInBinaryTree {
    static class Node {
        int key;
        Node left,right;

         Node (int data){
            key = data;
            left = right = null;
        }
    }

    static Node root;
    static Node temp = root;

    static void InOrder(Node temp){
       if(temp == null){
           return;
       }

       InOrder(temp.left);
        System.out.print(temp.key + "");
        InOrder(temp.right);

    }

    static void insert(Node temp, int key) {
        if (temp == null) {
            root = new Node(key);
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        ((LinkedList<Node>) q).add(temp);

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();


            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                ((LinkedList<Node>) q).add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            }else{
                ((LinkedList<Node>) q).add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print("InOrder ");
       InOrder(root);


        int key = 12;
        insert(root, key);

        System.out.print("\nInOrder After ");
        InOrder(root);

    }
}
