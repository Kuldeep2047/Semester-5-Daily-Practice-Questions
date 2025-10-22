// Last updated: 10/22/2025, 10:16:16 PM
class Solution {
    public boolean isValid(String s) {
        return isAnswer(s);
    }
    public static boolean isAnswer(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char br = s.charAt(i);
            if(br=='[' || br=='{' || br=='('){
                st.push(br);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if((br==']' && top != '[') || (br=='}' && top != '{') || (br==')' && top != '(')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}