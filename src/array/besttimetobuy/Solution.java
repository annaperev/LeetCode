package array.besttimetobuy;

public class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int buyIndex = 0;
        for (int sellIndex = 1; sellIndex < prices.length; sellIndex++) {
        int subProfit = 0;
            if ( prices[sellIndex] - prices[buyIndex]<0 ){
                buyIndex++;
                continue;
            } else {
                if (prices.length - sellIndex > 2) {
                    int[] subPrice = new int[prices.length - sellIndex - 1];
                    for (int index = 0; index < subPrice.length; index++) {
                        subPrice[index] = prices[index + sellIndex + 1];
                    }
                    subProfit = maxProfit(subPrice);
                }


                if (prices[sellIndex] - prices[buyIndex]+subProfit >= profit) {
                    profit = prices[sellIndex] - prices[buyIndex] +subProfit;
                }
            }
        }
        return profit;
    }
}
