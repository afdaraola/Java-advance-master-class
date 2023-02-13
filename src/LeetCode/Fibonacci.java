package LeetCode;



import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        FibonacciNumber();
    }

    public static void FibonacciNumber(){
        int number, i=0,firstValue=0, secondValue=1, next ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number ");

        number = sc.nextInt();

       while(i < number ){

            if(i <= 1){
                next = i;
            }else{
                next = firstValue + secondValue;

                firstValue= secondValue;

                secondValue = next;
            }
           System.out.println(next);
          i ++;
    }


    }
}


