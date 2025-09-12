// Last updated: 9/12/2025, 2:07:49 PM
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        return answer(nums,k);
    }
    public int answer(int[] arr ,int k){
        int ans =0;
        int si =0;
        int ei = 0;
        int n = arr.length;
        // int sum=0;
        Map<Integer, Integer> map = new HashMap<>();
        while(ei<n){
            // sum += arr[ei];
            map.put(arr[ei], map.getOrDefault(arr[ei],0)+1);

            while(map.get(arr[ei])>k && si<=ei){
                map.put(arr[si], map.get(arr[si])-1);
                si++;
            }

            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;

    }

}