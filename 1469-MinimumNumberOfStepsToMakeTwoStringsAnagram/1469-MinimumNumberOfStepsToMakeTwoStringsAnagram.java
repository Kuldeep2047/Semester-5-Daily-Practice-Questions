// Last updated: 8/9/2025, 1:40:49 PM
class Solution {
    public int minSteps(String s, String t) {
        return Steps_to_make_anagram(s,t);
    }
    public static int Steps_to_make_anagram(String s,String t){
        int[] freq_s = new int[26];
        int[] freq_t = new int[26];
        int count =0;
        for(int i=0;i<s.length();i++){
            freq_s[s.charAt(i)-'a']++;
            freq_t[t.charAt(i)-'a']++;
        }
        
        for(int i=0;i<freq_s.length;i++){
            count += Math.abs(freq_s[i] - freq_t[i]);
        }
        return count/2;
    }
}