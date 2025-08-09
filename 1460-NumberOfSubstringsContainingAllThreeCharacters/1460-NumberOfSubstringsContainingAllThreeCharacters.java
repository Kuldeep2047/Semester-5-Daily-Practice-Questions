// Last updated: 8/9/2025, 1:40:52 PM
class Solution {
    public int numberOfSubstrings(String s) {
        return substring(s);
    }
    public static int substring(String s){
        int si=0,ei=0;
        int ans=0;
        int a=0,b=0,c=0;
        while(ei<s.length()){
            char ch = s.charAt(ei);
            if(ch=='a'){
                a++;
            }
            else if(ch=='b'){
                b++;
            }
            else{
                c++;
            }
            while(a>0 && b>0 && c>0){
                ans += s.length()-ei;
                char chr = s.charAt(si);
                if(chr=='a'){
                    a--;
                }
                else if(chr=='b'){
                    b--;
                }
                else{
                    c--;
                }
                si++;
            }
            ei++;
        }
        return ans;
    }
}