// Last updated: 11/14/2025, 3:42:49 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        return Greater_Element(nums);
    }
    public static int[] Greater_Element(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<2*n;i++){
            int ele = nums[i%n]; //circular ke karan mod n kiya hai
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