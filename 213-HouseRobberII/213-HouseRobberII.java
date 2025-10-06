// Last updated: 10/6/2025, 11:50:05 AM
class Solution {
    public int rob(int[] nums) {
        int a = answer(nums , 1, nums.length-1);
        int b = answer(nums, 0, nums.length-2);
        return Math.max(a,b);
    }
    public int answer(int[] arr, int si ,int ei){
        if(arr.length == 1){
            return arr[0];
        }
        int prev2 =0;
        int prev =arr[si];
        for(int i=si+1;i<=ei ;i++){
            int pick = arr[i] + prev2;
            int not_pick = prev;
            int curr = Math.max(pick, not_pick);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}