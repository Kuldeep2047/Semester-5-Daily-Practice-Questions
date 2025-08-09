// Last updated: 8/9/2025, 1:44:12 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        return is_Anagram(s,t);
    }
    public static boolean is_Anagram(String s,String t){
        int[] scount = new int[26];
        int[] tcount = new int[26];
        for(int i=0;i<s.length();i++){
            scount[s.charAt(i)-'a']++;
        } 
        for(int i=0;i<t.length();i++){
            tcount[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(scount[i] != tcount[i]){
                return false;
            }
        }
        return true;
    }
}