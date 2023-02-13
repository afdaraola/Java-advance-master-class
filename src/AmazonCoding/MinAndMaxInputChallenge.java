package AmazonCoding;


import java.util.Scanner;


public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        MinAndMaxInput();
    }
    public static  void MinAndMaxInput()

    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Number: ");

            boolean asInt = scanner.hasNextInt();

            if(asInt){
                int number = scanner.nextInt();

                if(max < number){
                    max = number;
                }

                if (min > number){
                    min = number;
                }

            }else{
                break;
            }

        }

        scanner.close();

        System.out.println("Min= "+ min + " Max= "+max);
    }

}
