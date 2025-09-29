// Last updated: 9/29/2025, 3:50:39 PM
class Solution {
    public int largestRectangleArea(int[] heights) {
        return Largest_Histogram(heights);
    }
    public int Largest_Histogram(int[] arr){
        int n = arr.length;
        int area =0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while( !st.isEmpty() && arr[i] < arr[st.peek()]){
                int  h = arr[st.pop()];
                int r =i;
                if(st.isEmpty()){
                    area = Math.max(area, h*r);
                }else{
                    int l = st.peek();
                    area = Math.max(area , h* (r-l-1));
                }

            }
            st.push(i);
        }
        int r = n;
        while(!st.isEmpty()){
            int  h = arr[st.pop()];
            if(st.isEmpty()){
                area = Math.max(area, h*r);
            }else{
                int l = st.peek();
                area = Math.max(area , h* (r-l-1));
            }
        }
        return area;
    }
}