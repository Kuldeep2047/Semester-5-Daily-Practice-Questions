// Last updated: 8/9/2025, 1:46:51 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        return Longest_Substring(s);
    }
    public static int Longest_Substring(String s) {
		int si=0, ei=0, ans=0;
		Set<Character> set = new HashSet<>();
        int len =0;
        while(ei<s.length()){
            if(!set.contains(s.charAt(ei))){
                set.add(s.charAt(ei));
                ei++;
                len++;
                ans = Math.max(ans,len);
            }else{
                set.remove(s.charAt(si));
                si++;
                len--;
            }
        }
        return ans;
    }
}