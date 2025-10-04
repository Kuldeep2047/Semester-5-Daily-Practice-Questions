// Last updated: 10/4/2025, 12:10:19 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        Parentheses(n , ans, "", 0, 0);

        return ans;
    }

    public static void Parentheses(int n, List<String> ans,String s, int open ,int close){
        
        if(open == n && close == n){
            ans.add(s);
            return;
        }
        if(open> n || close>open){
            return;
        }

        Parentheses(n, ans, s+'(' , open+1, close);
        Parentheses(n, ans, s+')', open, close+1);
    }
}