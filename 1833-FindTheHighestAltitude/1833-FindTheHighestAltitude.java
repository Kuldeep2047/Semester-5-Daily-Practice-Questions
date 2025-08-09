// Last updated: 8/9/2025, 1:39:54 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int ans = 0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}