// Last updated: 10/2/2025, 8:59:32 PM
class Solution {
    public int jump(int[] nums) {
        return Jump_2(nums);
    }
    public static int Jump_2(int[] arr){
        int n = arr.length;
        int farthest = 0;
        int jump =0;
        int end = 0;
        for(int i = 0; i< n-1;i++){
            farthest = Math.max(farthest, arr[i]+i);
            if(i == end){
                jump++;
                end = farthest;
            }
        }
        return jump;
    }
}