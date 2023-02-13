package Traversal;

import java.util.LinkedList;
import java.util.List;

public class InorderTraversal {
    public static void main(String[] args) {

TreeNode tree = new TreeNode(1);
  tree.right = new TreeNode(2);
  tree.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(tree));

    }

    public static List<Integer> inorderTraversal(TreeNode root){

        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> out_arr = new LinkedList<>();

        if(root==null){
            return out_arr;
        }

        TreeNode current  = root;

        while(current!=null || stack.isEmpty()){
            while (current!=null){
                 stack.push(current);
                current =  current.left;
            }

            current = stack.pop();
            out_arr.add(current.val);
            current=current.right;
        }
        return out_arr;
    }
}


