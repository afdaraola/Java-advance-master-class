package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class PairOfNegativePositiveValue {

    public static void main(String[] args) {

        int arr[] = {4,8,9,-4,1,-1,-8,-9};
        int n = arr.length;

        PrintPairs(arr,n);
    }
    public static void PrintPairs(int arr[], int n){

        ArrayList<Integer> pair = new ArrayList<Integer>();


        // for each element in the array

        for(int i = 0; i < n; i ++){

            // try to pair the -ve value

            for (int j = i+1; j < n; j ++){
                // if the absolute value are equal
                //print the value
              if(  Math.abs(arr[i]) == Math.abs(arr[j])){

                  pair.add(arr[i]);
              }
            }

        }

        // check the size of the collection
        if(pair.size()==0){
            return;
        }

            // sort the collection
       Collections.sort(pair);


        //print the value in pair of +ve & -ve values

        for(int i = 0; i < pair.size(); i ++){
            System.out.print(-pair.get(i) + " " +  pair.get(i));
        }
    }
}
