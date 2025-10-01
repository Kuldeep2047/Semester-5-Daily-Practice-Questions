// Last updated: 10/1/2025, 9:20:13 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        return non_Overlapping(intervals);
    }

    public static int non_Overlapping(int[][] arr){
        int n = arr.length;
        Arrays.sort(arr , Comparator.comparingInt(a -> a[1]));
        int c=0;

        int first_end = arr[0][1];
        for(int i =1; i<n;i++){
            int sec_start = arr[i][0];
            if(sec_start < first_end){
                c++;
            }else{
                first_end = arr[i][1];
            }
        }
        return c;
    }
}