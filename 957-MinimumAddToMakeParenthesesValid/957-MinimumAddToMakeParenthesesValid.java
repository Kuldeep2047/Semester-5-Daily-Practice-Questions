// Last updated: 8/9/2025, 1:41:50 PM
class Solution {
    public int minAddToMakeValid(String s) {
        return Min_Parentheses(s);
    }
    public static int Min_Parentheses(String s){
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char bracket = s.charAt(i);
            if(bracket=='('){
                open++;
            }else if(bracket==')'){
                if(open>0){
                    open--;
                }else{
                    close++;
            }
            }
        }
        return open+close;
    }
}