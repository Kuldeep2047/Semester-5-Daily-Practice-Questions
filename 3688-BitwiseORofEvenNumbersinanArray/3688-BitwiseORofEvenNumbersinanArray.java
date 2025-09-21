// Last updated: 9/21/2025, 8:37:43 PM
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        return answer(nums);
    }
    public int answer(int[] arr){
        int ans =0;
        for(int n :arr){
            if(n%2==0){
                ans = ans | n;
            }
        }
        return ans;
    }
}