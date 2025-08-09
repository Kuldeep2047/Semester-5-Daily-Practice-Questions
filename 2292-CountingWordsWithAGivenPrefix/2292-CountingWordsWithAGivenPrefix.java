// Last updated: 8/9/2025, 1:38:51 PM
class Solution {
    public int prefixCount(String[] words, String pref) {
        return Count_Word(words,pref);
    }
    public static int Count_Word(String[] words,String pref){
        int c=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                c++;
            }
        }
        return c;
    }
}