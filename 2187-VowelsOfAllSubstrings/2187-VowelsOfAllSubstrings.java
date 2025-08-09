// Last updated: 8/9/2025, 1:39:10 PM
class Solution {
    public long countVowels(String word) {
        return vowel_substring(word);
    }
    public static long vowel_substring(String word){
        long ans =0;
        int n = word.length();
        for(int i=0;i<word.length();i++){
            if(isVowel(word.charAt(i))){
                ans += (long)(i+1)*(n-i);            
            }        
        }
        return ans;
    }

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' ||ch=='i' || ch=='o'|| ch=='u'){
            return true;
        }
        return false;
    }
}