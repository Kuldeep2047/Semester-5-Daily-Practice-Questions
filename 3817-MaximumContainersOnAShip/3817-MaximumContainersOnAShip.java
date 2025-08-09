// Last updated: 8/9/2025, 1:36:30 PM
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int tc = n*n;
        if(maxWeight/w<=tc){
            return maxWeight/w;
        }
        return tc;
        
    }
}