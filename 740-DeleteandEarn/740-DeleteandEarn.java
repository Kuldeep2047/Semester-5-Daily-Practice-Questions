// Last updated: 11/25/2025, 9:06:26 PM
class Solution {
    public int deleteAndEarn(int[] nums) {
        return answer(nums);
    }
    public int answer(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        int max = nums[n-1];
        int[] arr = new int[max+1];

        for(int num : nums){
            arr[num] += num;
        }

        int prev2 =0;
        int prev = arr[0];

        for(int i=1 ;i<arr.length ;i++){
            int take = arr[i] + prev2;
            int not_take = prev;

            int curr = Math.max(take, not_take);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}