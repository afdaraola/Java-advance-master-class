package MasterDataStructureAndAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyBinarySearchTree {

    private MyBinaryNode root;

    public MyBinarySearchTree() {
        root = null;
    }

    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        myBinarySearchTree.insert(9);
        myBinarySearchTree.insert(4);
        myBinarySearchTree.insert(20);
        myBinarySearchTree.insert(1);
        myBinarySearchTree.insert(6);
        myBinarySearchTree.insert(15);
        myBinarySearchTree.insert(170);
        System.out.println("==> " + myBinarySearchTree.lookup(20));

        System.out.println("BreadthFirstSearch iteratively " + myBinarySearchTree.breadthFirstSearch());
        // System.out.println(myBinarySearchTree.breadthFirstSearchRecursively();
        System.out.println("Depth First Search In-order " + myBinarySearchTree.DepthFirstSearchInOrder(SeachTypes.IN_ORDER));
        System.out.println("Depth First Search pre_ordr " + myBinarySearchTree.DepthFirstSearchInOrder(SeachTypes.PRE_ORDER));
        System.out.println("Depth First Search post-order " + myBinarySearchTree.DepthFirstSearchInOrder(SeachTypes.POST_ORDER));

    }

    public void insert(int value) {

        if (root == null) {
            root = new MyBinaryNode(value);
        }


        MyBinaryNode currentNode = root;

        while (true) {
            if (value < currentNode.getValue()) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(new MyBinaryNode(value));
                    return;
                }

                currentNode = currentNode.getLeft();
            } else {

                if (currentNode.getRight() == null) {
                    currentNode.setRight(new MyBinaryNode(value));
                    return;
                }
                currentNode = currentNode.getRight();
            }
        }


    }


    public MyBinaryNode lookup(int value) {
        if (root == null) {
            return root;
        }

        MyBinaryNode currentNode = root;

        while (currentNode != null) {
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getLeft();
            } else if (value > currentNode.getValue()) {
                currentNode = currentNode.getRight();
            } else if (value == currentNode.getValue()) {
                return currentNode;
            }
        }
        return null;
    }

    public List<Integer> breadthFirstSearch() {

        MyBinaryNode currentNode = root;

        List<Integer> list = new ArrayList<>();
        Queue<MyBinaryNode> queue = new LinkedList<>();

        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.poll();

            list.add(currentNode.getValue());
            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }

        }

        return list;
    }

    public List<Integer> breadthFirstSearchRecursively() {

        return null; //breadthFirstSearchRecursively (root, new ArrayList<>());
    }

    public List<Integer> breadthFirstSearchRecursively(Queue<MyBinaryNode> queue, List<Integer> list) {

        if (queue.isEmpty()) {
            return list;
        }

        MyBinaryNode currentNode = queue.poll();

        list.add(currentNode.getValue());

        if (currentNode.getLeft() != null) {
            queue.add(currentNode.getLeft());
        }
        if (currentNode.getRight() != null) {
            queue.add(currentNode.getRight());
        }
        return breadthFirstSearchRecursively(queue, list);
    }


    public List<Integer> DepthFirstSearchInOrder(SeachTypes seachTypes) {
        return DFSInOrder(root, new ArrayList<>(), seachTypes);
    }


    private List<Integer> DFSInOrder(MyBinaryNode node, ArrayList<Integer> list, SeachTypes seachTypes) {

        if (seachTypes == SeachTypes.IN_ORDER)
            list.add(node.getValue());

        if (node.getRight() != null) {
            DFSInOrder(node.getRight(), list, SeachTypes.IN_ORDER);
        }

        if (node.getLeft() != null) {
            DFSInOrder(node.getLeft(), list, SeachTypes.IN_ORDER);
        }


        if (seachTypes == SeachTypes.PRE_ORDER) {

            list.add(node.getValue());

            if (node.getLeft() != null) {
                DFSInOrder(node.getLeft(), list, seachTypes);

            }

        }

        if (seachTypes == SeachTypes.POST_ORDER) {
            list.add(node.getValue());
        }
        return list;
    }


    private void PrintTree(MyBinaryNode node){

        System.out.println(node.getValue());
        System.out.println();
         count ++;


        if(node.getLeft()!=null){
           // System.out.println("\t" .repeat(Math.max(0, count)) + "Left ");
           PrintTree(node.getLeft());
        }

        if(node.getRight()!=null){
          //  System.out.println("\t".repeat(Math.max(0, count)) + "Right ");
           PrintTree(node.getRight());
        }

        count --;
    }


    int count;

    public void printTree(){
        count =0;
      //  printTree(root);
    }



    enum SeachTypes {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }
}
