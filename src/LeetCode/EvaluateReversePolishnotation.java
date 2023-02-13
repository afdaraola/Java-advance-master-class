package LeetCode;



import java.io.IOException;
import java.util.Stack;

public class EvaluateReversePolishnotation {

    public static void main(String[] args) throws IOException

    {
        String[] arrs = new String[]{"2", "1","+","3","*"};
        int EPN = EvalRPN(arrs);

        System.out.println(EPN);

    }

    public static int EvalRPN(String[] tokens){

        int returnValue=0;
        String operators = "+-*/";

        Stack<String> stack = new Stack<String>();

          for(String token : tokens){

              if(!operators.contains(token)){

                  System.out.println(token);

                  stack.push(token);

              }else{

                  int a = Integer.valueOf(stack.pop());
                  int b = Integer.valueOf(stack.pop());

                  int index = operators.indexOf(token);

               switch (index){
                   case 0 :
                       stack.push(String.valueOf(a+b));
                       break;
                   case 1:
                       stack.push(String.valueOf(b-a));
                       break;
                   case 2:
                       stack.push(String.valueOf(a*b));
                       break;
                   case 3:
                       stack.push(String.valueOf(b/a));
               }

              }

              returnValue = Integer.valueOf(stack.pop());
          }

        return returnValue;
    }
}
