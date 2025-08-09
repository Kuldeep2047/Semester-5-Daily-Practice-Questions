// Last updated: 8/9/2025, 1:40:04 PM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        return answer(word1,word2);
    }
    public static boolean answer(String s1,String s2){
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            f2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if((f1[i]==0 && f2[i]!=0) || (f1[i]!=0 && f2[i]==0)){
                return false;
            }
        }
        Arrays.sort(f2);
        Arrays.sort(f1);
        for(int i=0;i<26;i++){
            if(f1[i] != f2[i]){
                return false;
            }
        }
        return true;
    }
}