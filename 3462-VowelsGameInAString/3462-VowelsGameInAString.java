// Last updated: 8/9/2025, 1:37:13 PM
class Solution {
    public boolean doesAliceWin(String s) {
        return vowel_game(s);
    }
    public static boolean vowel_game(String s){
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                return true;
            }
        }
        return false;
    }
}