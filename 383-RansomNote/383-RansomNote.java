// Last updated: 8/9/2025, 1:43:36 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        return answer(ransomNote,magazine);
    }
    public static boolean answer(String s1,String s2){
        int[] f1 =  new int[26];
        int[] f2 = new int[26];
        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            f2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(f1[i]>f2[i]){
                return false;
            }
        }
        return true;
    }
}