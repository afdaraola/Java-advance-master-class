package MasterDataStructureAndAlgorithms;

import java.util.EmptyStackException;

public class Stacks {


    public static void main(String[] args) {
        Stacks stacks = new Stacks();

        stacks.push(9);
        stacks.push(7);
        stacks.push(8);
        System.out.println(stacks.peek());
        stacks.printLists();
        stacks.pop();
        stacks.printLists();




    }

    private MySinglyLinkedNode top;
    private MySinglyLinkedNode bottom;
    private int length;


    public Stacks(){
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }


    public int peek(){

        if(length == 0){
            throw new EmptyStackException();
        }

        return top.getValue();
    }


    public int pop(){
        if(length == 0){
            throw new EmptyStackException();
        }
        MySinglyLinkedNode nodeToPop = top;
        top = top.getNext();
        length--;

        if(length ==0){
            bottom = null;
        }

        return nodeToPop.getValue();
    }

    public void push(int pushValue){
        top = new MySinglyLinkedNode(pushValue, top);

        if(length==0){
           bottom=top;
        }
        length++;
    }



    public void printLists(){

        if(top==null){
            return;
        }

        MySinglyLinkedNode temptop= top;

        System.out.println("--> " +temptop.getValue());

         temptop = temptop.getNext();

        while (temptop!=null){
            System.out.println("--> "+ temptop.getValue());

            temptop = temptop.getNext();

        }
        System.out.println();
    }

}
