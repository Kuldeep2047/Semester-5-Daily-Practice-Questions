// Last updated: 8/9/2025, 1:40:45 PM
class Solution {
    public boolean canConstruct(String s, int k) {
        return K_Palindrome(s,k);
    }
    public static boolean K_Palindrome(String s,int k){
        if(s.length()<k){
            return false;
        }
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                odd++;
            }
        }
        if(odd<=k){
            return true;
        }else{
            return false;
        }
    }
}