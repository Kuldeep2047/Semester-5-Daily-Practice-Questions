// Last updated: 10/5/2025, 2:03:29 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        return answer(time, totalTrips);
    }
    public long answer(int[] time, int tT){
        Arrays.sort(time);
        long low = time[0];
        long high = (long)tT * time[0];
        
        long ans = high;

        while(low<=high){
            long mid = low - (low-high)/2;
            if(isPossible(time, mid, tT)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] time ,long mid, int tT){
        long trip = 0;
        for(int t : time){
            trip += mid/t;
            if(trip >= tT){
                return true;
            }
        }
        return false;

    }
}