package LeetCode;

import java.util.HashSet;

public class FindSumOfTwoValues {
    public static void main(String[] args) {

        int[] arrays = {2,5,4,8,9};
        int value = 5;

        boolean foundValues = FindSumOfTwo(arrays,value);

        System.out.println("found sume of two vale "+foundValues);

    }

    public static boolean FindSumOfTwo(int[] A, int val){

        HashSet<Integer> foundValue = new HashSet<Integer>();

        for(int a : A){
            if (foundValue.contains(val-a)){
                return true;
            }

            foundValue.add(a);
        }

        return false;
    }
}
