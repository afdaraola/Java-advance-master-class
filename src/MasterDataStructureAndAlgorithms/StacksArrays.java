package MasterDataStructureAndAlgorithms;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StacksArrays {

    public static void main(String[] args) {
        StacksArrays stacksArrays = new StacksArrays();
      //  stacksArrays.peek();
        stacksArrays.PrintLists();
        stacksArrays.push(4);
        stacksArrays.push(20);
        stacksArrays.push(99);
        stacksArrays.PrintLists();
        System.out.println(stacksArrays.peek());
        stacksArrays.pop();
        stacksArrays.PrintLists();

    }

    private List<Integer>  list = new ArrayList<>();


    public StacksArrays(){
    }


    public int peek(){
       if(list.size()==0){
           throw  new EmptyStackException();
       }

       return list.get(list.size()-1);
    }

    public int pop(){
        if(list.size()==0){
            throw new EmptyStackException();
        }

        return list.remove(list.size()-1);
    }

    public void push(int valueToPush){

        list.add(valueToPush);
    }

    public void PrintLists(){
        for( int a : list){
            System.out.println("==>>"+ a);
        }
        System.out.println();
    }

}
