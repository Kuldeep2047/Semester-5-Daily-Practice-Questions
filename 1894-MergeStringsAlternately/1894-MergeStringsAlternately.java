// Last updated: 8/9/2025, 1:39:45 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        return answer(word1,word2);
    }
    public static String answer(String word1,String word2){
        int i=0;
        int j=0;
        int n = word1.length();
        int m = word2.length();
        StringBuilder sb = new StringBuilder();
        while(i<n && j<m){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        while(i<n){
            sb.append(word1.charAt(i++));
        }
        while(j<m){
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}