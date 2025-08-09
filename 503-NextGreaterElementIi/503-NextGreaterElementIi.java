// Last updated: 8/9/2025, 1:43:06 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        return Greater_Element(nums);
    }
    public static int[] Greater_Element(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<2*n;i++){
            int ele = nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<ele){
                ans[st.pop()] = ele;

            }
            if(i<n){
                st.push(i);
            }
        }
        while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
        return ans;
    }
    
}