// Last updated: 8/9/2025, 1:43:01 PM
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        return Longest_word(s,dictionary);
    }
    public static String Longest_word(String s,List<String> dictionary){
        Collections.sort(dictionary);
        String ans="";
        for(int i=0;i<dictionary.size();i++){
            String word = dictionary.get(i);
            if(word.length()>ans.length()){
                if(isPresent(s,word)){
                    ans = word;
                }
            }
        }
        return ans;
    }
    public static boolean isPresent(String s,String word){
        int i=0;
        int j=0;
        while(i<s.length() && j<word.length()){
            if(s.charAt(i)==word.charAt(j)){
                j++;
            }
            i++;
        } 
        return j == word.length();
    }
}