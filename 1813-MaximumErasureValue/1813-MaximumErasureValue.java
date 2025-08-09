// Last updated: 8/9/2025, 1:40:00 PM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        return maximum_Sum(nums);
    }
    public static int maximum_Sum(int[] arr){
        int ans =0;
        int si=0;
        int ei =0;
        int sum =0;
        Set<Integer> set = new HashSet<>();
        while(ei<arr.length){
            if(!set.contains(arr[ei])){
                set.add(arr[ei]);
                sum+=arr[ei];
                ans = Math.max(ans,sum);
                ei++;
            }else{
                // ans = Math.max(ans,sum);
                // sum=0;
                set.remove(arr[si]);
                sum -= arr[si];
                si++;
            }
            
        }
        return ans;
    }
}