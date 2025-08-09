// Last updated: 8/9/2025, 1:42:10 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1  = Backspace_len(s);
        Stack<Character> s2 = Backspace_len(t);
        return s1.equals(s2);
    }
    public static Stack<Character> Backspace_len(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch == '#'){
                st.pop();
            }else if(ch != '#'){
                st.push(ch);
            }
        }
        return st;
    }
}