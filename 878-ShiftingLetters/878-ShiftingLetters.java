// Last updated: 8/9/2025, 1:42:07 PM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        return letter_shift(s,shifts);
    }
    public static String letter_shift(String s, int[] shifts){
        String ans = "";
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i] = (shifts[i]+shifts[i+1])%26;
        }
        for(int i=0;i<shifts.length;i++){
            int inc = shifts[i]%26;
            char ch = s.charAt(i);
            
            ans += (char)((ch-'a'+inc)%26+'a');
        }
        return ans;
    }
}