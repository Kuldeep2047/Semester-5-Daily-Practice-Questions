// Last updated: 8/9/2025, 1:39:48 PM
class Solution {
    public String largestMerge(String word1, String word2) {
        return answer(word1,word2);
    }
    public static String answer(String s1,String s2){
     
        int n = s1.length();
        int m = s2.length();
        StringBuilder ans = new StringBuilder();
        int i=0;
        int j=0;
        while(i<n && j<m){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);
            if(s1.substring(i).compareTo(s2.substring(j)) > 0){
                ans.append(c1);
                i++;
            }else{
                ans.append(c2);
                j++;
            }
        } 
        while(i<n){
            char c1 = s1.charAt(i);
            ans.append(c1);
            i++;
            
        }
        while(j<m){
            char c1 = s2.charAt(j);
            ans.append(c1);
            j++;
             
        }
        return ans.toString();
    }
}