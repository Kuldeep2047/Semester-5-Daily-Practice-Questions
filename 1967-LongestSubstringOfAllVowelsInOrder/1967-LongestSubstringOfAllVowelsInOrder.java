// Last updated: 8/9/2025, 1:39:27 PM
class Solution {
    public int longestBeautifulSubstring(String word) {
        return longestSubstring(word);
    }
    public int longestSubstring(String word){
        int c=1;
        int ans=0;
        int[] count = new int[26];
        char pre = word.charAt(0);
        count[pre-'a']++;
        for(int i=1;i<word.length();i++){
            char ch = word.charAt(i);
            if(pre<=ch){
                count[ch-'a']++;
                c++;
                pre = ch;
            }else{
                if(isvalid(count)){
                    ans = Math.max(ans,c);
                }
                c=1;
                count = new int[26];
                count[ch-'a']++;
                pre = ch;
            }
        }  
        
        if(isvalid(count)){
            ans = Math.max(ans,c);
        }
        return ans;
    }
    public static boolean isvalid(int[] count){
        if(count[0]>=1 && count[4]>=1 && count[8]>=1 && count[14]>=1 && count[20]>=1){
            return true;
        }
        return false;
    }
}