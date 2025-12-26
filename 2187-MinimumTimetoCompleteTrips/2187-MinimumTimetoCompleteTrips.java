// Last updated: 12/26/2025, 12:11:43 PM
1class Solution {
2    public long minimumTime(int[] time, int totalTrips) {
3        return answer(time, totalTrips);
4    }
5
6    public long answer(int[] time, int tT){
7        Arrays.sort(time);
8        long low = time[0];
9        long high = (long)tT * time[0];
10        
11        long ans = high;
12
13        while(low<=high){
14            long mid = low - (low-high)/2;
15            if(isPossible(time, mid, tT)){
16                ans = mid;
17                high = mid-1;
18            }else{
19                low = mid+1;
20            }
21        }
22        return ans;
23    }
24
25    public boolean isPossible(int[] time ,long mid, int tT){
26        long trip = 0;
27        for(int t : time){
28            trip += mid/t;
29            if(trip >= tT){
30                return true;
31            }
32        }
33        return false;
34
35    }
36}