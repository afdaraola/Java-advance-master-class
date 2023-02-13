package MasterDataStructureAndAlgorithms;

public class Robbers {

    public static void main(String[] args) {

        int num[] = {1,2,3,1};
        System.out.println(   rob(num));

    }

    public static int rob(int[] nums) {


        if(nums.length == 0){
            return -1;
        }

        int dp[] = new int[nums.length+1];

        dp[0]  = 0;
        dp[1] = nums[0];

        for(int i = 1; i < nums.length; i ++){

            dp[i+1] = Math.max(dp[i], dp[i-1]+ nums[i]);
        }

        return dp[nums.length];
    }
}
