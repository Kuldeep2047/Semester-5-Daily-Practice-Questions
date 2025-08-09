// Last updated: 8/9/2025, 1:38:59 PM
class Solution {
    public String firstPalindrome(String[] words) {
        return answer(words);
    }
    public static String answer(String[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(isPalindrome(arr[i])){
                return arr[i];
            }
        }
        return "";
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}