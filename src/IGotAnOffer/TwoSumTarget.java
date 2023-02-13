package IGotAnOffer;

public class TwoSumTarget {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     You may assume that each input would have exactly one solution, and you may not use the same element twice
     */
    public static void main(String[] args) {
 int[]  nums = {2,7,11,15}; int target = 18;
    int[] output =   TwoSum(nums,target);


    if(output != null){
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i]);
        }
    }

    }

    public static int[] TwoSum(int[] nums, int target){
        if(nums.length==0){
            return nums;
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
