// Last updated: 10/17/2025, 12:29:05 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = nextGreater(nums2);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< nums2.length ;i++){
            map.put(nums2[i], nge[i]);
        }
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length ;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
        
    }

    public int[] nextGreater(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] nge = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
  
            if(stack.isEmpty()){
                nge[i] = -1;
            }else{
                nge[i] = arr[stack.peek()];
            }

            stack.push(i);
        }
        return nge;
    }
}