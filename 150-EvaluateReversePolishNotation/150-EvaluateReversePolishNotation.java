// Last updated: 10/17/2025, 12:41:51 PM
class Solution {
    public int evalRPN(String[] tokens) {
        return answer(tokens);
    }

    public int answer(String[] arr){
        Stack<Integer> st = new Stack<>();

        int n = arr.length;
        for(int i=0; i< n ;i++){
            String ch= arr[i];
            if(ch.equals("+")){
                st.push(st.pop() + st.pop());
            }
            else if(ch.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }
            else if(ch.equals("*")){
                st.push(st.pop() * st.pop());
            }
            else if(ch.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.peek();
    }
}