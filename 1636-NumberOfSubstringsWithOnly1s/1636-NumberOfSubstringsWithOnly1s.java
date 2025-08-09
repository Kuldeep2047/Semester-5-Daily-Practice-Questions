// Last updated: 8/9/2025, 1:40:20 PM
class Solution {
    public int numSub(String s) {
        return answer(s);
    }
    public static int answer(String s){
        int c=0;
        int n = s.length();
        int ans =0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                c++;
            }else{
                ans += (((long)c*(c+1))/2) % 1000000007;
                c=0;
            }
        }
        ans += (((long)c*(c+1))/2) % 1000000007;
        return (int) ans;
    }
}