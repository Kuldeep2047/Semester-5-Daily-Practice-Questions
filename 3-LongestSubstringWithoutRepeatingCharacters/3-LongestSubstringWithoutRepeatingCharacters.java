// Last updated: 9/30/2025, 11:08:05 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        return answer(s);
    }
    public int answer(String s){
        // Set<Character> set = new HashSet<>();
        int si=0;
        int ei =0;
        // int len =0;
        int ans =0;
        int[] arr = new int[255];
        while(ei < s.length()){
            while(arr[s.charAt(ei)]>0){
                arr[s.charAt(si)]--;
                si++;
            }
            arr[s.charAt(ei)]++;
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
       
    }
}