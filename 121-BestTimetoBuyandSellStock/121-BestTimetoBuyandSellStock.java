// Last updated: 1/4/2026, 1:00:11 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        return stockProfit(prices);
4    }
5    public int stockProfit(int[] prices){
6        int n = prices.length;
7        int profit =0;
8        int buy = prices[0];
9        for(int i=1;i<n;i++){
10            if(buy> prices[i]){
11                buy = prices[i];
12            }
13            int sellProfit = prices[i]-buy;
14            if(sellProfit > profit){
15                profit = sellProfit;
16            }
17        }
18        return profit;
19    }
20}