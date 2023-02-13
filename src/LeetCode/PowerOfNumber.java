package LeetCode;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        PowerOfNumbers();
    }

    public static void PowerOfNumbers(){
        int number, i =1 , exponent = 0;
        long power = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        number = sc.nextInt();
        System.out.println("Enter the Exponent Value");

        exponent = sc.nextInt();


     //   for(i = 1; i <= exponent; i ++){
       //     power = power * number;
        //}
        while(i <=exponent){
            power = power * number;

            i++;
        }


        System.out.println("Final result of "+ number + " power of "+ exponent+ " is "+ power);
    }
}



