// Last updated: 10/10/2025, 7:48:47 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        return answer(s, t);
    }
    public boolean answer(String s, String t){
        int i=0,j=0;
        if(s.length()==0)return true;
        while(i<s.length() && j< t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
            if(i==s.length()) return true;
        }
        return false;
    }
}