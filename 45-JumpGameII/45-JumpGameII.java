// Last updated: 10/1/2025, 2:46:58 PM
class Solution {
    public int jump(int[] nums) {
        return Jump_2(nums);
    }
    public static int Jump_2(int[] arr){
        int n = arr.length;
        int maxJump = 0;
        int count =0;
        int endJump = 0;
        for(int i = 0; i< n-1;i++){
            maxJump = Math.max(maxJump, arr[i]+i);
            if(i == endJump){
                count++;
                endJump = maxJump;
            }
        }
        return count;
    }
}