// Last updated: 8/9/2025, 1:45:19 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] arr){
        int ans =0;
        Set<Integer> set = new HashSet<>();
        for(int n:arr){
            set.add(n);
        }

        for(int n:set){
            if(!set.contains(n-1)){
                int start = n;
                int len =1;
                while(set.contains(n+1)){
                    len++;
                    n++;
                }

                ans = Math.max(ans,len);
            }
        }
        return ans;

    }
}