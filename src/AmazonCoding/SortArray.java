package AmazonCoding;


import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
      int[] myIntNumber =   getIntegers(5);
      printArray(myIntNumber);

      int[] copyMyIntArrays = sortInteger(myIntNumber);
       printArray(copyMyIntArrays);

    }


    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
    int[] values = new int[number];
        System.out.println("Enter "+ number + "Number \r");
        for(int i=0; i<values.length ; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] values){
        for (int i =0; i<values.length; i++){
            System.out.println(values[i]);
        }
    }

    public static int[] sortInteger(int[] array){

     int [] sortedArray = new int[array.length];
    for(int i =0; i<array.length; i++){
        sortedArray[i] = array[i];
    }

    //int[] sortedArrays = Arrays.copyOf(array,array.length);

    boolean flag = true;
    int temp;
    while(flag){
        flag = false;

        for(int i =0; i<sortedArray.length-1; i++){

            if (sortedArray[i] < sortedArray[i+1]){
                temp= sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
                flag = true;
            }

        }
    }

        return sortedArray;
    }
}
