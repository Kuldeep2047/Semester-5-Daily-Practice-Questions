// Last updated: 8/9/2025, 1:41:14 PM
class Solution {
    public int balancedStringSplit(String s) {
        return answer(s);
    }
    public static int answer(String s){
        int ans=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                c++;
            }else{
                c--;
            }
            if(c==0){
                ans++;
            }
        }
        return ans;
    }
}