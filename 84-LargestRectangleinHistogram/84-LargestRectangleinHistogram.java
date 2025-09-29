// Last updated: 9/29/2025, 9:31:46 PM
class Solution {
    public int largestRectangleArea(int[] heights) {
        return Largest_Rectangle(heights);
    }
    public int Largest_Rectangle(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans =0;

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h = arr[st.pop()];
                int r = i;
                if(st.isEmpty()){
                    ans = Math.max(ans , h*r);
                }else{
                    int l = st.peek();
                    ans = Math.max(ans, h*(r-l-1));
                }

            }
            st.push(i);
        }
        int r = n;
        while(!st.isEmpty()){
            int h = arr[st.pop()];
            if(st.isEmpty()){
                ans = Math.max(ans , h*r);
            }else{
                int l = st.peek();
                ans = Math.max(ans, h*(r-l-1));
            }
        }
        return ans;

    }
}