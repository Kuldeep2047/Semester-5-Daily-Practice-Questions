// Last updated: 8/9/2025, 1:38:57 PM
class Solution {
    public boolean checkString(String s) {
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
                return false;
            }
        }
        return true;
    }
}