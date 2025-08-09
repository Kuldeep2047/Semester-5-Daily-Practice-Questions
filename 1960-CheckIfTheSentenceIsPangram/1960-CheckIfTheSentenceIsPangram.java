// Last updated: 8/9/2025, 1:39:32 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        return isPangram(sentence);
    }
    public static boolean isPangram(String str){
        int[] arr = new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }
}