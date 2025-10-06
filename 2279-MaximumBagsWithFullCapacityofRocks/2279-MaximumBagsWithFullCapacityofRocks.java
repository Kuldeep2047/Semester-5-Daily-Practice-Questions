// Last updated: 10/6/2025, 2:55:01 PM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        return Bags(capacity, rocks , additionalRocks);
    }
    public int Bags(int[] capacity, int[] rocks, int extra){
        int n = capacity.length;

        int[] need = new int[n];
        for(int i=0; i<n ;i++){
            need[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(need);

        int ans =0;
        for(int i =0 ;i< n; i++){
            if(need[i] == 0){
                ans++;
            }
            else if(extra >= need[i]){
                extra = extra - need[i];
                ans++;
            }
        }
        return ans;
    }
}