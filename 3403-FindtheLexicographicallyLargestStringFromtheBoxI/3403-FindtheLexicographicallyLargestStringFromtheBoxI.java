// Last updated: 10/13/2025, 10:12:57 PM
class Solution {
    public String answerString(String word, int numFriends) {
        return answer(word, numFriends);
    }
    public String answer(String word, int num){
        int n = word.length();
        if(num ==1){
            return word;
        }
        int m = n- num+1; 

        String ans = "";
        for(int i = 0; i<n ;i++){
            // String part = word.substring(i,i+ m);
            String part = word.substring(i);

            if(part.length()>=m){
                part = part.substring(0,m);
            }

            if(part.compareTo(ans) > 0){
                ans = part;
            }
        }
        return ans;
    }
}