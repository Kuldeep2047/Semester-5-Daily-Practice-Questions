// Last updated: 8/9/2025, 1:37:30 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        return answer(words,x);
    }
    public static List<Integer> answer(String[] words,char x){
        List<Integer> ll = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String w = words[i];
            for(int j=0;j<w.length();j++){
                if(w.charAt(j)==x){
                    ll.add(i);
                    break;
                }
            }
        }
        return ll;
    }
}