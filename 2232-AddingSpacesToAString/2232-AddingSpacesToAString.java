// Last updated: 8/9/2025, 1:38:58 PM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        return Adding_Spaces(s,spaces);
    }
    public static String Adding_Spaces(String s,int[] spaces){
        StringBuilder ans= new StringBuilder();
        int n = spaces.length;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(l<n && i==spaces[l]){
                l++;
                ans.append(" ");
            }
                ans.append(s.charAt(i));
            
        }
        return ans.toString();
    }

}