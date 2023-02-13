package AmazonCoding;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
       inputThePrintSumAndAverage();
    }
    public static void inputThePrintSumAndAverage() {

        int sum = 0;
        long avg = 0;
        int counter = 0;
        int order = 0;

        Scanner scanner = new Scanner(System.in);



        while (true) {
           // order = counter + 1;

            System.out.println("Enter Number # ");

            boolean asInt = scanner.hasNextInt();

            if (asInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                avg =   Math.round(sum/counter);
            } else {
                break;
            }


        }

        scanner.close();

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
