// Last updated: 8/9/2025, 1:42:32 PM
class Solution {
    public int countBinarySubstrings(String s) {
        int curr =1;
        int pre =0;
        int ans =0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                curr++;
            }else{
                ans += Math.min(curr,pre);
                pre = curr;
                curr =1;
            }
        }
        ans += Math.min(curr,pre);
        return ans;
    }
}