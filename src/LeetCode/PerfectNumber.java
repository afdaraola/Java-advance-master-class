package LeetCode;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        PerfectumberUsingFor();
    }

    private static Scanner sc;

    public  static void PerfectumberUsingFor(){

    int number, sum=0;
        System.out.println("Enter the perfect number :");

        sc =  new Scanner(System.in);

        number = sc.nextInt();

        for (int i = 1; i < number; i ++){

            if (number%i ==0){
                sum += i;
            }
        }

        if(number == sum){
            System.out.println(number + " is a perfect number ");
        }else{
            System.out.println(number+ " is not a perfect number");
        }
    }
}
