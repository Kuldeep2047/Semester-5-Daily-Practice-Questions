// Last updated: 8/9/2025, 1:36:18 PM
class Solution {
    public long minCuttingCost(int n, int m, int k) {
        return answer(n,m,k);
    }
    public static long answer(int n,int m,int k){
        long min = Long.MAX_VALUE;
        if(m<=k){
            for(int i=1;i<n;i++){
                int len1 = i;
                int len2 = n-i;
                if(len1<=k && len2<=k){
                    long cost = 1L*len1*len2;
                    min = Math.min(min,cost);
                }
            }
        }
        if(n<=k){
            for(int i=1;i<m;i++){
                int len1 = i;
                int len2 = m-i;
                if(len1<=k && len2<=k){
                    long cost = 1L*len1*len2;
                    min = Math.min(min,cost);
                }
            }
        }
        if(n<=k && m<=k){
            return 0;
        }
        return (min==Long.MAX_VALUE) ? 0 : min;
    }
}