package BackTracking;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class SubSet {

    public static void main(String[] args) {

//        int [] nums = {1,2,3};
//
//       List<List<Integer>> output = subsets(nums);
//        System.out.println(output);

//        String  text= "   hellloo ";
//
//        String newText = text.trim();
//        System.out.println(newText);
//        String step2 = newText.substring(0,5).toUpperCase();
//
//        System.out.println(valueOf(step2)) ;

        int sum=0;
        int var =31118;
        // your code goes here
        for(int i = 0; var>0 ; i ++){
            System.out.println(var%10);
            sum+=var%10;

            var/=10;
        }

        System.out.println(sum);
//
//        int nums = 1000;
//        System.out.println("Value of Int is: "+ nums);
//        System.out.println(nums);
//        // print your int variable here
//        float floatVariable = 10.292f;
//        System.out.println("Value of Float is: ");
//        System.out.println(floatVariable);
//        // print your float variable here
//        double doubleVaribale = 5.12365123E-12;
//        System.out.println("Value of Double is: "+ doubleVaribale);
//        System.out.println(doubleVaribale);
//        // print your double variable here
//        char charn = 'N';
//        System.out.println("Value of Char is: "+ charn);
//        System.out.println(charn);
//        // print your char variable here
//        boolean istrue = true;
//        System.out.println("Value of Bool is: "+ istrue);
//        System.out.println(istrue);
//        // print bool double variable here


    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        int n = nums.length;

        for (int i = (int)Math.pow(2, n); i < (int)Math.pow(2, n + 1); ++i) {
            // generate bitmask, from 0..00 to 1..11
            String bitmask = Integer.toBinaryString(i).substring(1);

            // append subset corresponding to that bitmask
            List<Integer> curr = new ArrayList();
            for (int j = 0; j < n; ++j) {
                if (bitmask.charAt(j) == '1') curr.add(nums[j]);
            }
            output.add(curr);
        }
        return output;
    }




}
