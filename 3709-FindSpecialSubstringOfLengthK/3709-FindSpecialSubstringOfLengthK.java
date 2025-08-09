// Last updated: 8/9/2025, 1:37:01 PM
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        return substring(s,k);
    }
    public static boolean substring(String  s,int k){
        // int si=0;
        int l = s.length();
        for(int i=0;i<=l-k;i++){
            char ch = s.charAt(i);
            boolean same = true;
            for(int j=i;j<i+k;j++){
                if(s.charAt(j)!=ch){
                    same = false;
                    break;
                }
            }
            if(! same){
                continue;
            }
            if(i>0 && s.charAt(i-1)==ch){
                continue;
            }
            if(i+k<l && s.charAt(i+k)==ch){
                continue;
            }
            return true;
        }
        return false;
    }
}