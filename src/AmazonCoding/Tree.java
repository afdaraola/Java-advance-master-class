package AmazonCoding;

import java.util.HashMap;


public class Tree {
    public static Node root;

    static HashMap<Character, Integer> mp = new HashMap<>();
    static int preIndex = 0;

    public static Node buildTree (char[] in , char[] pre, int inStart, int inEnd ){

        if(inStart>inEnd){
            return null;
        }

        char curr = pre [preIndex];
        Node tNode;
        tNode = new  Node(curr);

        if(inStart==inEnd){
            return tNode;
        }

        int inIndex = mp.get(curr);

        tNode.left = buildTree(in, pre, inStart, inIndex -1);
        tNode.right =buildTree(in, pre, inIndex +1, inEnd);

        return tNode;
    }

    public static Node buildTreeWrap( char[] in, char[] pre, int len){
        for (int i = 0; i < len; i++){
            mp.put(in[i],i);
        }
        return buildTree(in,pre,0,len-1);
    }

    static void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        char[] in = {'D','B','E','A','F','C'};
        char[] pre ={'A','B','D','E','C','F'};
        int len = in.length;

        Tree.root = buildTreeWrap(in,pre,len);
        System.out.println("Inorder Traversal of the constructed tree is");

        printInOrder(root);

    }
}
