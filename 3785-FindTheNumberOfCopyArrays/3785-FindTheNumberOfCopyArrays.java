// Last updated: 8/9/2025, 1:36:42 PM
class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        return Copy_Array(original,bounds);
    }
    public static int Copy_Array(int[] original,int[][] bounds){
        int n = original.length;
        int min = bounds[0][0];
        int max = bounds[0][1];

        for(int i=1;i<n;i++){
            int d = original[i]-original[i-1];
            min = Math.max(bounds[i][0],min+d);
            max = Math.min(bounds[i][1],max+d);
            if(min>max){
            return 0;
            }
        }

        
        // int ans = Math.min(max-min+1,Integer.MAX_VALUE);
        return max-min+1;
    }
}