package Traversal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal {
    public static void main(String[] args) {

    }

    public static List<Integer> preOrderTraversal(Node root){

        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> out_arr = new LinkedList<>();

        if(root ==null){
            return out_arr;
        }

        stack.add(root);

        while (!stack.isEmpty()){
            Node current = stack.pollFirst();
            out_arr.add(current.val);
            Collections.reverse(current.children);
            for(Node  child  : current.children){
                stack.add(child);

            }
        }
        return out_arr;
    }
}
