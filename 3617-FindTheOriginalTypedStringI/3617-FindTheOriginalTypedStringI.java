// Last updated: 8/9/2025, 1:37:07 PM
class Solution {
    public int possibleStringCount(String word) {
        return answer(word);
    }
    public static int answer(String word){
        int n = word.length();
        int c=1;
        for(int i=0;i<n-1;i++){
            if(word.charAt(i) == word.charAt(i+1)){
                c++;
            }
        }
        return c;
    }
}