// Last updated: 9/26/2025, 11:30:47 PM
class Solution {
    public int maxProfit(int[] prices) {
        return stockProfit(prices);
    }
    public int stockProfit(int[] prices){
        int n = prices.length;
        int profit =0;
        int buy = prices[0];
        for(int i=1;i<n;i++){
            if(buy> prices[i]){
                buy = prices[i];
            }
            int sellProfit = prices[i]-buy;
            if(sellProfit > profit){
                profit = sellProfit;
            }
        }
        return profit;
    }
}