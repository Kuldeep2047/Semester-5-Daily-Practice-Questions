// Last updated: 10/22/2025, 2:54:12 PM
class Solution {
    public int calculate(String s) {
        return answer(s);
    }
    public static int answer(String s){
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        
        int curr =0;
        char op = '+';

        for(int i=0 ; i<n ;i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <='9'){
                curr = curr*10 + (ch-'0');
            }

            if(( !Character.isDigit(ch) && ch != ' ') || i==n-1){
                if(op == '+'){
                    st.push(curr);
                }
                else if(op == '-'){
                    st.push(-curr);
                }
                else if(op == '*'){
                    st.push(st.pop() * curr);
                }
                else if(op == '/'){
                    st.push(st.pop() / curr);
                }
                
                curr =0;
                op = ch;
                

            }

        }

        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}