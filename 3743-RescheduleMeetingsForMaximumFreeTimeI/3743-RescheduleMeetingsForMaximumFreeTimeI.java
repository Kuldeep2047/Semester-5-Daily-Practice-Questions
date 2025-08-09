// Last updated: 8/9/2025, 1:36:54 PM
class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        // int maxfree=0;
        int n = startTime.length;
        int[] freeTime=new int[n+1];
        freeTime[0] = startTime[0];
        for(int i=1;i<n;i++){
            freeTime[i] = startTime[i]-endTime[i-1];
        }
        freeTime[n] = eventTime-endTime[n-1];

        int p=0;
        int sum=0;
        int si=0;
        int ei=0;
        while(si<=n){
            sum+=freeTime[si];
            if(si-ei>k){
                sum-=freeTime[ei];
                ei++;
            }
            p=Math.max(p,sum);
            si++;
        }
        return p;
    }
    
}