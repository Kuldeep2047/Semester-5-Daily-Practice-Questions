// Last updated: 8/9/2025, 1:37:55 PM
class Solution {
    public long findScore(int[] nums) {
        return Array_Score(nums);
    }

    public static long Array_Score(int[] nums){
        long score=0;
        boolean[] marked = new boolean[nums.length];
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        
        // int min = Integer.MAX_VALUE;
        // int idx = -1;
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i=0;i<nums.length;i++){
            int n = pairs[i][0];
            int idx = pairs[i][1];

            if(marked[idx]){
                continue;
            }
            
            score +=n;
            marked[idx]=true;
            if(idx-1>=0){
                marked[idx-1]=true;
            }
            if(idx+1<nums.length){
                marked[idx+1]=true;
            }

        
        }
        
        return score;
        
    }
}