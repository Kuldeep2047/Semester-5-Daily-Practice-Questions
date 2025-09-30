// Last updated: 9/30/2025, 8:26:28 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        return LongestSubstring(s);
    }
    public int LongestSubstring(String s){
        int ans =0;

        int si =0;
        int ei =0;
        int[] arr = new int[255];
        while(ei < s.length()){
            while(arr[s.charAt(ei)]>0){
                arr[s.charAt(si)]--;
                si++;
            }
            arr[s.charAt(ei)]++;
            
            ans = Math.max(ans , ei-si+1);
            ei++;
        }
        return ans;
    }
}