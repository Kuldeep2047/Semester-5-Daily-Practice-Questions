// Last updated: 8/9/2025, 1:36:27 PM
class Solution {
    public int[] minCosts(int[] cost) {
        return Cost(cost);
    }
    public static int[] Cost(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int[] cost = new int[n];
        for(int i=0;i<n;i++){
            min = Math.min(arr[i],min);
            cost[i] = min;
        }
        return cost;
    }
}