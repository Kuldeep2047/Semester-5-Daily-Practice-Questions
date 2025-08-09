// Last updated: 8/9/2025, 1:37:52 PM
class Solution {
    public int addMinimum(String word) {
        return answer(word);
    }
    public static int answer(String word){
        int ans =0;
        int a=0 , b=0, c=0;
        int i=0;
        int n = word.length();
        while(i<n){
            if(word.charAt(i)=='a'){
                i++;
                if(i<n && word.charAt(i)=='b'){
                    i++;
                }else{
                    ans++;
                }
                if(i<n && word.charAt(i)=='c'){
                    i++;
                }else{
                    ans++;
                }
            }else if(word.charAt(i)=='b'){
                i++;
                ans++;
                if(i<n && word.charAt(i)=='c'){
                    i++;
                }else{
                    ans++;
                }
            }else{
                i++;
                
                ans++;
                ans++;
                
            }
        }
        return ans;
    }
}