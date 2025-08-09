// Last updated: 8/9/2025, 1:42:28 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        return temp(temperatures);
    }
    public static int[] temp(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.peek()] = i-st.pop() ;
            }
            st.push(i);

        }
        while(!st.isEmpty()){
            ans[st.pop()]=0;
        }
        return ans;
    }
}