package MasterDataStructureAndAlgorithms;

public class MyBinaryNode {

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyBinaryNode getLeft() {
        return left;
    }

    public void setLeft(MyBinaryNode left) {
        this.left = left;
    }

    public MyBinaryNode getRight() {
        return right;
    }

    public void setRight(MyBinaryNode right) {
        this.right = right;
    }

    private int value;
    private MyBinaryNode left;
    private MyBinaryNode right;


    public MyBinaryNode(int value, MyBinaryNode left, MyBinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public MyBinaryNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }



}
