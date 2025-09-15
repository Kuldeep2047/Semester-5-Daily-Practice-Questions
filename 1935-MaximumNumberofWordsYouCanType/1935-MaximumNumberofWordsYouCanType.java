// Last updated: 9/15/2025, 9:44:47 PM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        return answer(text,brokenLetters);
    }
    public int answer(String text, String brokenLetters){
        // int n = text.length();
        int m = brokenLetters.length();
        String[] arr = text.split(" ");
        Set<Character> set = new HashSet<>();
        for(int i=0;i<m;i++){
            set.add(brokenLetters.charAt(i));
        }
        int ans =0;
        for(String word : arr){
            int f =1;
            for(int j=0;j<word.length();j++){
                if(set.contains(word.charAt(j))){
                    f=0;
                    break;
                }
            }
            if(f==1){
                ans ++;
            }

        }
        return ans;
    }
}