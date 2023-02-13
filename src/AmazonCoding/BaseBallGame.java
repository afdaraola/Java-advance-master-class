package AmazonCoding;

import java.util.Stack;

public class BaseBallGame {

    public static void main(String[] args) {

    }

    public static  int Baseball(String[] ops){
        if(ops ==null){
            return 0;
        }
  int totalScore =0;
        Stack<Integer> stack = new Stack<>();

        for(String a : ops){
           if(a.equals("D")){
               int newScore = 2 * stack.peek();
               totalScore+= newScore;
           } else if(a.equals("C")){
               totalScore -= stack.pop();
           }else if(a.equals("+")){
               int scoreTwo = stack.pop();
               int newScore = scoreTwo + stack.peek();
               stack.push(scoreTwo);
               stack.push(newScore);
           }else{
               stack.push(Integer.parseInt(a));
               totalScore+=Integer.parseInt(a);
           }
        }
        return totalScore;
    }
}



