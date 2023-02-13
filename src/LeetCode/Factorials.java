package LeetCode;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        FactorialOfNumber();
    }
    private static Scanner sc;
    public static void FactorialOfNumber(){

        int number;
        long factorial = 1;

        sc = new Scanner(System.in);
        System.out.println("Please Enter Number find the factorial");

        number = sc.nextInt();

        for(int i =1; i <=number; i ++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+ number + " = "+ factorial);
    }
}
