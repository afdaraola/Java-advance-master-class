package AmazonCoding;

import java.util.Stack;

public class InvertTree {

    Node root;

    public Node InvertTrees(Node root){

        if(root == null){
            return root;
        }

        Node left = InvertTrees(root.left);
        Node right = InvertTrees(root.right);

        //Swap

        root.right = left;
        root.left=right;

        return root;
    }

    public static void main(String[] args) {
        InvertTree tree = new InvertTree();
          tree.root = new Node(4);
          tree.root.left = new Node(2);
          tree.root.left.left = new Node(1);
          tree.root.left.right = new Node(3);
          tree.root.right = new Node(7);
          tree.root.right.right = new Node(9);
          tree.root.right.left = new Node(6);


    }
}
