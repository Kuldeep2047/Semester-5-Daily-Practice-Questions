// Last updated: 10/5/2025, 9:20:31 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        return Closest_Sum(nums, target);
    }
    public int Closest_Sum(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0;
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i<n ;i++){
            int si = i+1;
            int ei = n-1;

            while(si<ei){
                int sum = arr[i] + arr[si] + arr[ei];
                if(Math.abs(sum - target) < diff){
                    ans = sum;
                    diff = Math.abs(sum - target);
                }

                if(sum > target){
                    ei--;
                }else{
                    si++;
                }
            }
        }
        return ans;
    }
}