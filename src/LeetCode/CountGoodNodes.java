package LeetCode;

public class CountGoodNodes {
    public static void main(String[] args) {

        TreeNode tree;
        tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.left.left = new TreeNode(3);
        tree.right= new TreeNode(4);
        tree.right.left = new TreeNode(1);
        tree.right.right = new TreeNode(5);

       int res =  GoodNodes(tree);
        System.out.println("Good Count : "+res);


    }

   static int  count = 0;
   static int max = Integer.MIN_VALUE;

    public static class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

    }

    public static int GoodNodes(TreeNode root){

        helper(root,max);
        return count;
    }

    public static int helper(TreeNode root, int max){
        if(root == null){
            return count;
        }

        if(root.val >= max){
            max = root.val;
            count++;
        }

        int left = helper(root.left, max);
        int right = helper(root.right, max);

        System.out.println( count + " left  : "+left);
       System.out.println(count + " right : "+right);
        return left ; //+ right;
    }
}
