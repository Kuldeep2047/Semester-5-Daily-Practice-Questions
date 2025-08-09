// Last updated: 8/9/2025, 1:36:44 PM
class Solution {
    public long maxWeight(int[] pizzas) {
        return pizza(pizzas);
    }
    public static long pizza(int[] nums){
        Arrays.sort(nums);
        long ans=0;
        int n = nums.length;
        int left = n-1, right =0;
        // int n = nums.length;
        int m = n/4;
        int odd = (m+1)/2;
        int even = m- odd;

        for(int i=0;i<odd;i++){
            ans += nums[left];
            left--;
            right +=3;
        }
        for(int i=0;i<even ;i++){
            int one = nums[left];
            left--;
            int two = nums[left];
            left--;
            right+=2;
            ans += two;
            
        }
        return ans;
        
    }
}