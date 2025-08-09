// Last updated: 8/9/2025, 1:36:33 PM
class Solution {
    public String smallestPalindrome(String s) {
        return answer(s);
    }
    public static String answer(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder first = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        // StringBuilder last = new StringBuilder();

        for(int i=0;i<26;i++){
            int f = freq[i]/2;
            for(int j=0;j<f;j++){
                first.append((char)(i+'a'));
            }
            if(freq[i]%2==1 && middle.isEmpty()){
                middle.append((char)(i+'a'));
            }
        }
        StringBuilder last = new StringBuilder(first).reverse();
        // last = first.reverse().toString();
        String ans = first.toString() + middle.toString() + last.toString();
        return ans;
    }
}