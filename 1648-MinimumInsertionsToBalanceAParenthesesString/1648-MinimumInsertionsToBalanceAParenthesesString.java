// Last updated: 8/9/2025, 1:40:17 PM
class Solution {
    public int minInsertions(String s) {
        return insertion(s);
    }
    public static int insertion(String s){
        int open =0;
        int ans =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open++;
            }else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    i++;
                    // open--;
                }else{
                    ans++;
                    // if(open>0){
                    //     open--;
                    // }
                }
                if(open>0){
                    open--;
                }else{
                    ans++;
                }
                // if(open<0){
                //     ans++;
                // }
            }
        }
        ans += open*2;
        
        return ans;

    }
}