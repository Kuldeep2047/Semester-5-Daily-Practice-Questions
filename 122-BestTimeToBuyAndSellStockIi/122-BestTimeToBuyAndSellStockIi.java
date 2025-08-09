// Last updated: 8/9/2025, 1:45:20 PM
class Solution {
    public int maxProfit(int[] prices) {
        return buy_and_sell_stock(prices);
    }
    public static int buy_and_sell_stock(int[] prices){
        int ans=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                ans += prices[i+1]-prices[i];
            }
        }
        return ans;
    }
}