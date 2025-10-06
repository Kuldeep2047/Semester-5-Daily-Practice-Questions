// Last updated: 10/6/2025, 2:25:44 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return product(nums ,k);
    }
    public int product(int[] arr ,int k){
        int n = arr.length;
        int si =0;
        int ei =0;
        int p=1;
        int ans =0;

        while(ei < n){
            p *= arr[ei];

            while(p>=k && si<=ei){
                p =p/arr[si];
                si++;
            }

            ans += (ei-si+1);
            ei++;
        }
        return ans;
    }
}