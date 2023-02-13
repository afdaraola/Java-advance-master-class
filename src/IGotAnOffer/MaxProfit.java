package IGotAnOffer;

public class MaxProfit {
    /*
    "Say you have an array for which the ith element is the price of a given stock on day i.
    If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
     design an algorithm to find the maximum profit. Note that you cannot sell a stock before you buy one."
     */
    public static void main(String[] args) {
 int[] prices = {7,1,5,3,6,4};
        int[] price =     {7,6,4,3,1};
        //System.out.println(maxProfit(prices));
        System.out.println(maxProfit(price));
    }

    public static int maxProfit(int[] prices){

        int minPrice = Integer.MAX_VALUE;
        int maxprof = 0;

        System.out.println("first minPrice "+ minPrice);
        for(int i = 0; i < prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
               System.out.println(minPrice);
            }else if (prices[i] - minPrice > maxprof){
                maxprof = prices[i] - minPrice;
            }
        }

        return maxprof;
    }
}
