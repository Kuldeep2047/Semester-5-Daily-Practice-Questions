// Last updated: 8/9/2025, 1:43:21 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        return Intervals(intervals);
    }
    public static int Intervals(int[][] arr){
        Arrays.sort(arr,Comparator.comparingInt(a->a[1]));
        // int p1 = arr[0][0];
        int p2 = arr[0][1];
        int ans =0;
        for(int i=1;i<arr.length;i++){
            int e1 = arr[i][0];
            int e2 = arr[i][1];
            if((e1<p2)){
                ans++;
            }else{
                p2 = e2;
            }
            
        }
        return ans;
    }
}