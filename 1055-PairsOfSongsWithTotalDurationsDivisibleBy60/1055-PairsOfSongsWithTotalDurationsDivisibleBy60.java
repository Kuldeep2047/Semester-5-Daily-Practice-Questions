// Last updated: 8/9/2025, 1:41:32 PM
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        return Duration(time);
    }
    public static int Duration(int[] time){
        int count=0;
        long[] rem = new long[60];
        for(int i=0;i<time.length;i++){
            rem[time[i]%60]++;
        }
        for(int i=1;i<60;i++){
            if(i!=30)
            count += rem[i]* rem[60-i];
        }
        count = count/2;
        count+= (rem[0] * (rem[0]-1))/2; //for rem 0
        count+= (rem[30]*(rem[30]-1))/2; // for rem 30
        return count;
    }
}