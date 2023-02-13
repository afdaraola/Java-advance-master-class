package IGotAnOffer;

public class ConstructBinaryTree {
    public static void main(String[] args) {
      int[] pre = {4,2,5,1,6,3};
      int[] in = {1,2,4,5,3,6};

    TreeNode root =   BuildTree(pre,in);
      printOrder(root);
    }


/*
"Given preorder and inorder traversal of a tree, construct the binary tree."

Our aim is to find out the index of right child for current node in the preorder array
We know the index of current node in the preorder array - preStart (or whatever your call it), it's the root of a subtree
Remember pre order traversal always visit all the node on left branch before going to the right ( root -> left -> ... -> right), therefore, we can get the immediate right child index by skipping all the node on the left branches/subtrees of current node
The inorder array has this information exactly. Remember when we found the root in "inorder" array we immediately know how many nodes are on the left subtree and how many are on the right subtree
Therefore the immediate right child index is preStart + numsOnLeft + 1 (remember in preorder traversal array root is always ahead of children nodes but you don't know which one is the left child which one is the right, and this is why we need inorder array)
numsOnLeft = root - inStart.

 */

    public static TreeNode BuildTree(int[] preOrder, int[] inOrder) {

        return helper(0, 0, inOrder.length-1, preOrder, inOrder);
    }

    public static TreeNode helper(int preStart, int inStart, int inEnd, int[] preOrder, int[] inOrder) {
        if (preStart > preOrder.length - 1 || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preStart]);
        int inIndex = 0; // index of current root in inorder
        for (int i = inStart; i < inEnd; i++) {
            if (inOrder[i] == root.val) {
                inIndex = i;
            }
        }

        root.left = helper(preStart +1 , inStart, inIndex - 1, preOrder, inOrder);
        root.right = helper(preStart + inIndex - inStart +1, inIndex + 1, inEnd, preOrder, inOrder);
        return root;

    }

    public static void printOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        printOrder(treeNode.left);
        System.out.println(treeNode.val);
        printOrder(treeNode.right);

    }
}
