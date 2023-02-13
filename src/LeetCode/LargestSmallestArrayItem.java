package LeetCode;

import java.util.Scanner;

public class LargestSmallestArrayItem {
    public static void main(String[] args) {
        LargestSmallestArrayItem1();
    }

    public static void LargestSmallestArrayItem1(){
        Scanner sc = new Scanner(System.in);

        int size , largest , smarlest , minPostion = 0, maxPosition = 0;
        System.out.println("Enter the array size");
        size = sc.nextInt();

        int [] smallest_arr = new int [size];
        System.out.println("\n Enter the array value : ");
        for (int i = 0; i < size; i ++){
            smallest_arr[i] =  sc.nextInt();
        }

        smarlest = smallest_arr[0];
        largest = smallest_arr[0];

        for(int i = 0; i < size; i ++){
            if (smarlest > smallest_arr[i]){
                smarlest = smallest_arr[i];
                minPostion=i;
            }else{
                if(largest < smallest_arr[i]){
                    largest=smallest_arr[i];
                    maxPosition=i;
                }
            }
        }

        System.out.println("\n Smallest number inn the array size "+ size + "  is "+ smarlest);
        System.out.println("\n position of the array "+ minPostion);
        System.out.println("\n largest number in the array "+ size +" is " + largest);
        System.out.println("\n the position of larges array "+ maxPosition);
    }
}
