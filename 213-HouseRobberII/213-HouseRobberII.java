// Last updated: 9/10/2025, 10:48:54 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int a = answer(nums,0,n-2);
        int b = answer(nums,1,n-1);
        return Math.max(a,b);
    }
    public int answer(int[] arr,int si,int ei){
        int prev =0;
        int curr =0;
        while(si<=ei){
            int temp = Math.max(curr, prev+arr[si]);
            prev = curr;
            curr = temp;
            si++;
        }
        return curr;

        
    }
}