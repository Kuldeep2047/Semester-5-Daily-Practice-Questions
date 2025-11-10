// Last updated: 11/10/2025, 8:52:37 PM
class Solution {
    public int minOperations(int[] nums) {
        return answer(nums);
    }

    public static int answer(int[] arr){
        int c =0;

        Stack<Integer> st = new Stack<>();
        for(int i=0 ;i< arr.length ;i++){
            while(!st.isEmpty() && st.peek()> arr[i]){
                st.pop();
            }


            if(arr[i]>0 && (st.isEmpty() || arr[i] > st.peek())){
                st.push(arr[i]);

                c++;
            }
        }
        return c;
    }
}