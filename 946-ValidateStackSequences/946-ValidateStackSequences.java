// Last updated: 11/19/2025, 6:04:20 PM
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        return answer(pushed,popped);
    }
    public static boolean answer(int[] pushed,int[] popped){
        
        int j=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}