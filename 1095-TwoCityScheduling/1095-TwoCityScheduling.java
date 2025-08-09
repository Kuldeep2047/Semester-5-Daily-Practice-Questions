// Last updated: 8/9/2025, 1:41:30 PM
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        return Min_Cost(costs);
    }
    public static int Min_Cost(int[][] cost){
        int ans =0;
        Arrays.sort(cost,Comparator.comparingInt(a -> a[0]-a[1]));
        int mid = cost.length/2;
        for(int i=0;i<mid;i++){
            ans += cost[i][0];
        }
        for(int i=mid;i<cost.length;i++){
            ans += cost[i][1];
        }
        return ans;
    }
}