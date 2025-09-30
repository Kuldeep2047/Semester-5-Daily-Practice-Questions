// Last updated: 9/30/2025, 8:46:26 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return Anagrams(s2,s1);
    }
    public boolean Anagrams(String s , String p){
        int[] arr = new int[26];
        int m = p.length();
        int n = s.length();
        
        for(int i=0;i<m;i++){
            arr[p.charAt(i)-'a']++;
        }
        int si =0;
        int ei =0;
        while(ei<n){
            arr[s.charAt(ei)-'a']--;

            while(ei-si+1 == m && si<n){
                if(isZero(arr)){
                    
                    return true;
                }
                arr[s.charAt(si)-'a']++;
                si++;
            }

            ei++;

        }
        return false;

    }

    public static boolean isZero(int[] arr){
        for(int a:arr){
            if(a != 0){
                return false;
            }
        }
        return true;
    }
}