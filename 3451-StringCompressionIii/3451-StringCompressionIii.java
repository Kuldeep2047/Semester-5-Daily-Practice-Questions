// Last updated: 8/9/2025, 1:37:16 PM
class Solution {
    public String compressedString(String word) {
        
        String ans = "";
        
        for(int i=0;i<word.length();){
            char curr = word.charAt(i);
            int c=0;
            while(i<word.length() && curr==word.charAt(i) && c<9  ){
                c++;
                i++;
            }
            ans+=c+""+curr;
        }
        return ans;
        
        
    }
}