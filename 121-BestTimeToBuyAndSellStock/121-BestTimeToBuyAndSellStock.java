// Last updated: 8/9/2025, 1:45:22 PM
class Solution {
    public int maxProfit(int[] prices) {
        return stock(prices);
    }
    public static int stock(int[] prices){
        int profit=0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            if(prices[i]-buy>profit){
                profit = prices[i]- buy;
            }
        }
        return profit;
    }
}