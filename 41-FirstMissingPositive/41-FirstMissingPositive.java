// Last updated: 9/26/2025, 1:48:34 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        return answer(nums);
    }
    public int answer(int[] arr){
        Set<Integer> set = new HashSet<>();
        int ans = 1;
        for(int n:arr){
            set.add(n);
        }
        while(true){
            if( ! set.contains(ans)){
                return ans;

            }
            ans++;
        }
    }
}