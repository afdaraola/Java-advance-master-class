package Traversal;

import java.util.LinkedList;
import java.util.List;

public class PostOrderTraversal {
    public static void main(String[] args) {

    }
    public static List<Integer> postOrderTraversal(Node root){
        LinkedList<Node> stack =new LinkedList<>();
        LinkedList<Integer> out_arr = new LinkedList<>();

        if(root ==null){
            return out_arr;
        }

        stack.add(root);

        while (!stack.isEmpty()){
            Node node =   stack.pollLast();
            out_arr.addFirst(node.val);

            for(Node child : node.children){
                stack.add(child);
            }
        }
        return out_arr;
    }

}
