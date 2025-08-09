// Last updated: 8/9/2025, 1:39:47 PM
class Solution {
    public int countHomogenous(String s) {
        return answer(s);
    }
    public static int answer(String s){
        int c=1;
        int n = s.length();
        int ans =0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }else{
                // ans += ((long)c*(c-1))/2;
                // ans+=c;
                ans += ((long)c*(c+1))/2 % 1000000007;
                c=1;
            }
        }
        // ans += (c*(c-1))/2;
        // ans += c;
        ans += ((long)c*(c+1))/2 % 1000000007;
        return (int)ans;
    }
}