// Last updated: 8/9/2025, 1:41:10 PM
class Solution {
    public String greatestLetter(String s) {
        return answer(s);
    }
    public static String answer(String s){
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                lower[ch-'a'] = true;
            }else{
                upper[ch-'A'] = true;
            }
        }
        for(int i=25;i>=0;i--){
            if(lower[i] && upper[i]){
                return String.valueOf((char)(i+'A'));
            }
        }
        return "";
    }
}