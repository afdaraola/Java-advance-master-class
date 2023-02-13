package AmazonCoding;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arrays = {3,6,1,2,8,4,5};

        System.out.println(missingNum(arrays));

    }


    public static int missingNum (int[] arrays){


        int sum_of_element = 0;

        for (int num : arrays){

            sum_of_element = sum_of_element + num;
        }

        System.out.println(sum_of_element);

        int n = arrays.length + 1;

        int actual_sum = (n*(n+1))/2;

        System.out.println(actual_sum);

      int missingNumber = actual_sum - sum_of_element;

        System.out.println("missingNumber:- "+ missingNumber);

        return missingNumber ;
    }



}
